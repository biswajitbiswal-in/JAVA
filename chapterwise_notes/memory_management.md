# Java Memory Management — Notes

*Made by Biswajit Biswal*

---

## 1. Why Memory Management Matters

Every running Java program needs memory to store variables, objects, and method calls. Java manages most of this **automatically** via the **JVM (Java Virtual Machine)**, unlike languages like C/C++ where the programmer manually allocates (`malloc`) and frees (`free`) memory.

Java memory is mainly divided into two areas: **Stack** and **Heap**.

---

## 2. Stack Memory

- Stores **method calls** and **local variables** (primitives like `int`, `boolean`, and **references** to objects).
- Works in a **LIFO** (Last In, First Out) order — each method call gets its own **stack frame**, which is removed once the method finishes.
- **Fast** access, but **limited in size**.
- Memory here is automatically freed as soon as the method returns — no garbage collector needed for this part.

```java
void greet() {
    int age = 25;        // stored in stack
    String name = "Biz"; // reference stored in stack, actual String object in heap
}
// once greet() finishes, 'age' and 'name' reference are removed from stack
```

⚠️ If you call too many nested/recursive methods, the stack fills up and throws:
```
StackOverflowError
```

---

## 3. Heap Memory

- Stores **all objects** and **arrays** created with `new` (e.g. `new User()`, `new int[10]`).
- Shared across the entire application (all threads can access heap objects).
- **Slower** than stack, but much **larger**.
- This is the memory area the **Garbage Collector (GC)** manages.

```java
User u = new User();  // 'u' (reference) → stack
                       // User object itself → heap
```

⚠️ If the heap runs out of space (too many live objects), you get:
```
OutOfMemoryError: Java heap space
```

| | Stack | Heap |
|---|---|---|
| Stores | Method calls, local variables, references | Objects, arrays |
| Speed | Fast | Slower |
| Size | Small, fixed per thread | Large, shared |
| Managed by | Automatically on method return | Garbage Collector |
| Error if full | `StackOverflowError` | `OutOfMemoryError` |

---

## 4. Garbage Collection (GC)

Garbage Collection is the JVM's automatic process of **finding and freeing heap memory** that is no longer being used — you never manually call `delete` or `free()`.

```java
User u = new User();  // object created, reachable via 'u'
u = null;              // no reference points to it anymore
                       // → eligible for garbage collection
```

### How the GC decides what's garbage: **Reachability**
Starting from a set of **GC Roots** (local variables on the stack, static fields, active threads), the GC walks through every object reachable from those roots. Anything **not reachable** is considered garbage — even if objects reference each other in a cycle, if nothing *outside* the cycle points to them, they're still collected. (This is why Java doesn't have the classic circular-reference-leak problem found in simple reference-counting systems.)

### Key facts
- GC runs **automatically**; you don't control exactly *when*.
- `System.gc()` is only a **request/suggestion** to the JVM — it does not guarantee GC will run immediately.
- GC uses CPU time and can cause brief pauses ("**stop-the-world**" events), which is why different GC algorithms exist for different performance needs.

---

## 5. Generational Garbage Collection

Most objects in a program are **short-lived** (e.g. temporary variables, loop objects), while a few live for a long time. Java exploits this pattern by dividing the heap into **generations**:

### Young Generation
- Where **new objects** are created first.
- Divided into:
  - **Eden space** — brand new objects go here.
  - **Survivor spaces (S0, S1)** — objects that survive a GC cycle in Eden get moved here.
- Collected **frequently** using a fast process called **Minor GC**, since most objects here die quickly.

### Old Generation (Tenured)
- Objects that **survive multiple GC cycles** in the Young Generation get **promoted** here.
- Collected **less often**, using a slower process called **Major GC / Full GC**, since long-lived objects are less likely to become garbage.

```
[ Young Generation ]        [ Old Generation ]
Eden → S0 → S1 → (promoted after surviving enough cycles) → Old Gen
   (frequent, fast Minor GC)      (infrequent, slower Major GC)
```

👉 This generational split makes garbage collection far more efficient than scanning the entire heap every time.

---

## 6. Common GC Algorithms in the JVM

| Collector | Best for |
|---|---|
| **Serial GC** | Small apps, single-threaded environments |
| **Parallel GC** | Throughput-focused apps (multi-threaded collection) |
| **G1 (Garbage First)** | Default in modern Java; balances pause time & throughput |
| **ZGC / Shenandoah** | Very large heaps, ultra-low pause time requirements |

---

## 7. Can Memory Leaks Still Happen in Java?

Yes! Even though GC is automatic, a **memory leak** can still occur if objects remain **reachable** (via some reference) even though your program logically doesn't need them anymore. The GC only frees *unreachable* objects — it can't tell if a reachable object is "logically useless."

Common causes:
- **Static fields** holding references to objects forever (statics live for the whole app lifetime).
- Forgetting to remove listeners/callbacks that hold references to objects.
- Unbounded caches or collections (e.g. a `HashMap` that keeps growing and is never cleared).
- Unclosed resources (streams, connections) holding onto memory.

```java
static List<User> cache = new ArrayList<>();

void addUser(User u) {
    cache.add(u);  // if users are never removed, this list (and all users) 
                    // stays reachable forever → memory leak
}
```

👉 **Lesson:** GC prevents *dangling pointer* bugs, but it does **not** prevent *logical* memory leaks — you still need to manage references thoughtfully (e.g., clear collections, use weak references where appropriate, remove listeners).

---

## Quick Summary
- **Stack** = method calls + local variables/references → fast, auto-cleared when method returns.
- **Heap** = actual objects → managed by the Garbage Collector.
- **GC** automatically reclaims heap memory for objects that are no longer **reachable** from GC Roots.
- **Generational GC** (Young + Old generation) makes collection efficient, since most objects die young.
- GC prevents dangling pointers, but **memory leaks can still happen** if you accidentally keep references alive (e.g., static caches, unremoved listeners).
