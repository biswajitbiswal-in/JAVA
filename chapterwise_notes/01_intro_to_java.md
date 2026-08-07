# ☕ Java Basics

## 1. What is Java?

### Definition

**Java is a high-level, object-oriented programming language used to develop different types of applications.**

In simple words:

> Java is a programming language that allows us to give instructions to a computer.

Example:

```java
System.out.println("Hello World");
```

This tells Java to print:

```text
Hello World
```

---

# 2. When Was Java Developed?

Java was developed by **Sun Microsystems**.

* **1991** → Development of Java started
* **1995** → Java was officially released
* **James Gosling** → Known as the father of Java
* Java was originally called **Oak**
* **2010** → Oracle acquired Sun Microsystems

### Simple Timeline

```text
1991
  ↓
Java development started
  ↓
1995
  ↓
Java officially released
  ↓
2010
  ↓
Oracle acquired Sun Microsystems
```

---

# 3. What Type of Language is Java?

Java has several important characteristics.

### 1. High-Level Language

**Definition:**

A high-level language is a programming language that is easier for humans to understand.

Example:

```java
int age = 20;
```

We don't need to write complicated CPU instructions.

---

### 2. Object-Oriented Language

**Definition:**

An object-oriented language organizes programs using **classes and objects**.

Example:

```java
class Student {
    String name;
    int age;
}
```

Java uses concepts like:

* Class
* Object
* Inheritance
* Polymorphism
* Encapsulation
* Abstraction

---

### 3. Statically Typed Language

**Definition:**

In Java, we normally specify the data type of a variable when we create it.

```java
int age = 20;
String name = "John";
```

Here:

```text
int    → data type
age    → variable
20     → value
```

---

### 4. Platform Independent

**Definition:**

Java code can run on different operating systems using the JVM.

For example:

```text
             Java Program
                  ↓
               Bytecode
                  ↓
       ┌──────────┼──────────┐
       ↓          ↓          ↓
    Windows      Linux      macOS
       ↓          ↓          ↓
      JVM        JVM        JVM
       ↓          ↓          ↓
     Runs       Runs       Runs
```

This is why Java is famous for:

> **Write Once, Run Anywhere (WORA)**

---

# 4. What is a Programming Language?

### Definition

A **programming language** is a language used by humans to give instructions to computers.

Examples:

```text
Java
Python
C
C++
JavaScript
```

Example in Java:

```java
int a = 10;
int b = 20;

System.out.println(a + b);
```

The computer executes these instructions and gives:

```text
30
```

---

# 5. What is JVM?

## JVM = Java Virtual Machine

### Definition

**JVM is a virtual machine that runs Java bytecode.**

In simple words:

> JVM is the thing that runs our compiled Java program.

### Diagram

```text
Java Code
   ↓
Bytecode
   ↓
  JVM
   ↓
Program Runs
```

The JVM is different for different operating systems.

```text
        Java Bytecode
              ↓
      ┌───────┼───────┐
      ↓       ↓       ↓
    JVM     JVM     JVM
 Windows   Linux   macOS
```

---

# 6. What is JRE?

## JRE = Java Runtime Environment

### Definition

**JRE provides the environment needed to run Java programs.**

In simple words:

> JRE helps us RUN Java applications.

Conceptually:

```text
JRE
 ↓
JVM + Java Libraries
```

---

# 7. What is JDK?

## JDK = Java Development Kit

### Definition

**JDK is a collection of tools used to develop Java programs.**

In simple words:

> JDK is what we use when we want to CREATE Java programs.

It provides tools such as the Java compiler.

The important compiler is:

```text
javac
```

---

# 8. JDK vs JRE vs JVM

This is very important to remember.

```text
             JDK
              ↓
     Used to DEVELOP Java
              ↓
             JRE
              ↓
        Used to RUN Java
              ↓
             JVM
              ↓
       EXECUTES bytecode
```

### Easy Definitions

| Term    | Easy Meaning                  |
| ------- | ----------------------------- |
| **JDK** | Used to develop Java programs |
| **JRE** | Used to run Java programs     |
| **JVM** | Executes Java bytecode        |

### Memory Trick

> **JDK → Develop**
> **JRE → Run**
> **JVM → Execute**

---

# 9. What is Java Source Code?

### Definition

The code written by a programmer is called **source code**.

Example:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

The file is saved with:

```text
.java
```

Example:

```text
Main.java
```

---

# 10. What is a Compiler?

### Definition

A **compiler** converts source code into another form that can be executed.

Java uses the compiler:

```text
javac
```

For example:

```text
Main.java
   ↓
 javac
   ↓
Main.class
```

---

# 11. What is Bytecode?

### Definition

**Bytecode is the intermediate code generated after compiling Java source code.**

It is stored inside a:

```text
.class
```

file.

Example:

```text
Main.java
    ↓
  javac
    ↓
Main.class
    ↓
 Bytecode
```

The JVM understands this bytecode.

---

# 12. How Does Java Code Work?

Let's understand it step by step.

Suppose we write:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## Step 1: Write Java Code

We write:

```text
Main.java
```

This is our **source code**.

```text
Source Code
     ↓
 Main.java
```

---

## Step 2: Compile

We use:

```bash
javac Main.java
```

The Java compiler converts the source code into bytecode.

```text
Main.java
   ↓
 javac
   ↓
Main.class
```

---

## Step 3: Bytecode is Created

The `.class` file contains:

```text
Bytecode
```

```text
Main.class
    ↓
 Bytecode
```

---

## Step 4: JVM Runs the Bytecode

We run:

```bash
java Main
```

The JVM loads and executes the bytecode.

```text
Main.class
    ↓
   JVM
    ↓
Program runs
```

---

# 13. Complete Java Execution Diagram

Remember this diagram:

```text
       Java Source Code
          Main.java
              ↓
              ↓
        Java Compiler
           javac
              ↓
              ↓
          Bytecode
          Main.class
              ↓
              ↓
             JVM
              ↓
              ↓
        Program Runs
              ↓
              ↓
            Output
```

---

# 14. What is JIT?

## JIT = Just-In-Time Compiler

### Definition

**JIT is a part of the JVM that can compile frequently executed bytecode into native machine code while the program is running.**

Simple idea:

```text
Bytecode
   ↓
  JVM
   ↓
  JIT
   ↓
Machine Code
   ↓
  CPU
```

This can make frequently executed parts of a Java program faster.

---

# 15. What is Machine Code?

### Definition

**Machine code is the low-level instructions that a CPU can execute.**

Simple flow:

```text
Java Code
   ↓
Bytecode
   ↓
JVM / JIT
   ↓
Machine Code
   ↓
CPU
```

The CPU finally performs the instructions.

---

# 16. Java File Extensions

### `.java`

Contains Java source code.

```text
Main.java
```

### `.class`

Contains compiled Java bytecode.

```text
Main.class
```

Remember:

```text
.java  → Source Code
.class → Bytecode
```

---

# 17. Simple Real-Life Example

Think of Java like translating a language.

```text
You
 ↓
Write instructions in Java
 ↓
Java Compiler
 ↓
Converts them into Bytecode
 ↓
JVM understands Bytecode
 ↓
Computer executes it
```

Another simple example:

```text
Java Source Code
       ↓
   Translator
    (javac)
       ↓
   Bytecode
       ↓
     JVM
       ↓
    Computer
```

---

# 18. Important Definitions

### Java

A high-level, object-oriented programming language.

### JVM

**Java Virtual Machine** — runs Java bytecode.

### JRE

**Java Runtime Environment** — provides the environment required to run Java applications.

### JDK

**Java Development Kit** — provides tools required to develop Java applications.

### Compiler

A program that converts source code into another form for execution.

### Bytecode

Intermediate code generated from Java source code and stored in `.class` files.

### JIT

**Just-In-Time Compiler** — compiles frequently executed bytecode into native machine code during runtime.

### Source Code

The Java code written by the programmer.

### Machine Code

Low-level instructions executed by the CPU.

---

# 19. Quick Revision

```text
Java
 ↓
Programming Language
 ↓
High-Level
 ↓
Object-Oriented
 ↓
Statically Typed
 ↓
Platform Independent through JVM
```

### Java Execution

```text
.java
  ↓
javac
  ↓
.class
  ↓
Bytecode
  ↓
JVM
  ↓
JIT / Execution Engine
  ↓
Machine Code
  ↓
CPU
  ↓
Output
```

### JDK / JRE / JVM

```text
JDK → Develop
 ↓
JRE → Run
 ↓
JVM → Execute
```

---

# 20. One-Minute Revision

> **Java** → Programming language
> **JDK** → Used to develop Java
> **JRE** → Environment to run Java
> **JVM** → Executes bytecode
> **javac** → Java compiler
> **.java** → Source code
> **.class** → Bytecode
> **JIT** → Converts frequently executed bytecode to native machine code
> **WORA** → Write Once, Run Anywhere
