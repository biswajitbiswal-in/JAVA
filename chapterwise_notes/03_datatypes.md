# Java Data Types

## 1. What is a Data Type?

### Definition

A **data type** tells Java **what type of data a variable can store**.

In simple words:

> A data type tells Java what kind of value we are storing.

Example:

```java
int age = 20;
```

Here:

```text
int → Data Type
age → Variable
20  → Value
```

### Diagram

```text
        Variable
           ↓
      ┌─────────┐
age → │   20    │
      └─────────┘
           ↑
        int
      Data Type
```

---

# 2. Why Do We Need Data Types?

Java needs to know:

* What type of data we are storing
* How much memory is required
* What operations can be performed on the data

Example:

```java
int age = 20;
```

`int` tells Java that `age` stores a whole number.

Another example:

```java
String name = "Biswajit";
```

`String` tells Java that `name` stores text.

---

# 3. Bits and Bytes

Before learning data-type sizes, understand **bit** and **byte**.

### Bit

A **bit** is the smallest unit of computer data.

A bit can have:

```text
0 or 1
```

### Byte

A **byte** is a group of **8 bits**.

```text
1 Byte = 8 Bits
```

### Conversion

```text
8 bits  = 1 byte
16 bits = 2 bytes
32 bits = 4 bytes
64 bits = 8 bytes
```

Example:

```text
int
 ↓
32 bits
 ↓
32 ÷ 8
 ↓
4 bytes
```

---

# 4. Types of Data Types in Java

Java data types are divided into two main categories:

```text
                 Data Types
                     │
            ┌────────┴────────┐
            ↓                 ↓
       Primitive          Non-Primitive
       Data Types         Data Types
```

---

# 5. Primitive Data Types

### Definition

**Primitive data types are the basic built-in data types provided by Java.**

Java has **8 primitive data types**:

```text
Primitive Data Types
        │
 ┌──────┼────────┬────────┐
 ↓      ↓        ↓        ↓
byte   short    int      long
float  double   char    boolean
```

---

# 6. `byte`

### Definition

`byte` is used to store **small whole numbers**.

### Size

```text
8 bits = 1 byte
```

### Range

```text
-128 to 127
```

Example:

```java
byte age = 20;
```

---

# 7. `short`

### Definition

`short` is used to store whole numbers larger than `byte`.

### Size

```text
16 bits = 2 bytes
```

### Range

```text
-32,768 to 32,767
```

Example:

```java
short number = 30000;
```

---

# 8. `int`

### Definition

`int` is used to store **whole numbers**.

It is the most commonly used integer data type.

### Size

```text
32 bits = 4 bytes
```

### Range

```text
-2,147,483,648
to
2,147,483,647
```

Example:

```java
int age = 20;
int marks = 95;
```

---

# 9. `long`

### Definition

`long` is used to store **very large whole numbers**.

### Size

```text
64 bits = 8 bytes
```

Example:

```java
long population = 1400000000L;
```

### Important

Use `L` at the end of a large `long` literal:

```java
long number = 10000000000L;
```

---

# 10. `float`

### Definition

`float` is used to store **decimal numbers** with single precision.

### Size

```text
32 bits = 4 bytes
```

Example:

```java
float price = 99.5f;
```

### Important

Use `f` or `F`:

```java
float x = 10.5f;
```

---

# 11. `double`

### Definition

`double` is used to store **decimal numbers with more precision than `float`**.

### Size

```text
64 bits = 8 bytes
```

Example:

```java
double price = 99.99;
```

`double` is commonly used when more decimal precision is needed.

---

# 12. `char`

### Definition

`char` is used to store **one character**.

### Size

```text
16 bits = 2 bytes
```

Example:

```java
char grade = 'A';
```

### Important

`char` uses **single quotes**:

```java
'A'
'B'
'5'
'@'
```

Not:

```java
"A"
```

`"A"` is a `String`, not a `char`.

---

# 13. `boolean`

### Definition

`boolean` is used to store one of two values:

```text
true
false
```

Example:

```java
boolean isPassed = true;
boolean isLoggedIn = false;
```

### Important

Java does **not specify a fixed size** for `boolean`.

So don't write:

```text
boolean → 1 byte
```

as a Java language rule.

---

# 14. All 8 Primitive Data Types

| Data Type | Size (Bits) | Size (Bytes) | Used For              | Example             |
| --------- | ----------: | -----------: | --------------------- | ------------------- |
| `byte`    |      8 bits |       1 byte | Small whole numbers   | `byte x = 10;`      |
| `short`   |     16 bits |      2 bytes | Whole numbers         | `short x = 1000;`   |
| `int`     |     32 bits |      4 bytes | Whole numbers         | `int x = 100;`      |
| `long`    |     64 bits |      8 bytes | Large whole numbers   | `long x = 100000L;` |
| `float`   |     32 bits |      4 bytes | Decimal numbers       | `float x = 10.5f;`  |
| `double`  |     64 bits |      8 bytes | More precise decimals | `double x = 10.5;`  |
| `char`    |     16 bits |      2 bytes | Single character      | `char x = 'A';`     |
| `boolean` |   Not fixed |    Not fixed | `true` / `false`      | `boolean x = true;` |

---

# 15. Easy Way to Remember Primitive Types

```text
                 8 Primitive Types
                        │
       ┌────────────────┼────────────────┐
       ↓                ↓                ↓
    Numbers          Character         Logic
       │                │                │
 ┌─────┴─────┐          ↓                ↓
 ↓     ↓     ↓     char 'A'        boolean true
byte  short  int
 ↓     ↓     ↓
        long

       Decimal
          │
      ┌───┴───┐
      ↓       ↓
    float   double
```

---

# 16. Non-Primitive Data Types

### Definition

**Non-primitive data types are reference types used to work with objects and other complex data.**

Examples:

```text
String
Array
Class
Object
Interface
Enum
```

---

# 17. String

### Definition

A `String` is used to store a **sequence of characters (text)**.

Example:

```java
String name = "Biswajit";
```

Here:

```text
String    → Data Type
name      → Variable
"Biswajit" → Value
```

### Important

`String` uses **double quotes**:

```java
String name = "Java";
```

---

# 18. Primitive vs Non-Primitive

```text
             Data Types
                  │
        ┌─────────┴─────────┐
        ↓                   ↓
   Primitive           Non-Primitive
        ↓                   ↓
   int, char,          String, Array,
   boolean, etc.       Class, Object
```

### Main Difference

| Primitive                       | Non-Primitive                                  |
| ------------------------------- | ---------------------------------------------- |
| 8 basic types                   | Many reference types                           |
| Built into Java                 | Includes classes, arrays, `String`, etc.       |
| Examples: `int`, `char`         | Examples: `String`, arrays                     |
| Variables hold primitive values | Variables generally hold references to objects |

---

# 19. Example Using Different Data Types

```java
public class Main {
    public static void main(String[] args) {

        int age = 20;
        double marks = 85.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Biswajit";

        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(grade);
        System.out.println(passed);
    }
}
```

Output:

```text
Biswajit
20
85.5
A
true
```

---

# 20. `char` vs `String`

### `char`

Stores **one character**.

```java
char letter = 'A';
```

### `String`

Stores **text / multiple characters**.

```java
String name = "Java";
```

Remember:

```text
'A'      → char
"Java"   → String
```

### Easy Trick

```text
'A'
 ↓
One character

"Hello"
   ↓
Text
```

---

# 21. Integer vs Decimal

### Integer

A whole number without a decimal point.

```java
int age = 20;
```

### Decimal

A number containing a decimal point.

```java
double price = 99.99;
```

```text
20      → Whole Number → int

99.99   → Decimal     → double
```

---

# 22. Choosing a Data Type

For beginners, remember:

```text
Whole number
     ↓
    int

Large whole number
     ↓
    long

Decimal number
     ↓
   double

One character
     ↓
    char

True / False
     ↓
  boolean

Text
     ↓
 String
```

---

# 23. Important Definitions

| Term              | Definition                                             |
| ----------------- | ------------------------------------------------------ |
| **Data Type**     | Tells Java what type of data a variable can store      |
| **Bit**           | Smallest unit of data, represented as `0` or `1`       |
| **Byte**          | Group of 8 bits                                        |
| **Primitive**     | One of Java's 8 basic built-in data types              |
| **Non-Primitive** | Reference type such as `String`, arrays, classes, etc. |
| **Integer**       | Whole number without a decimal point                   |
| **Decimal**       | Number containing a fractional/decimal part            |
| **Character**     | A single character                                     |
| **Boolean**       | Represents `true` or `false`                           |
| **String**        | A sequence of characters used for text                 |

---

# 24. Quick Revision

## 8 Primitive Data Types

```text
byte
short
int
long
float
double
char
boolean
```

## Sizes

```text
byte   → 8 bits  → 1 byte
short  → 16 bits → 2 bytes
int    → 32 bits → 4 bytes
long   → 64 bits → 8 bytes

float  → 32 bits → 4 bytes
double → 64 bits → 8 bytes

char   → 16 bits → 2 bytes

boolean → Size not fixed by Java
```

## Most Common Types

```java
int age = 20;

double price = 99.99;

char grade = 'A';

boolean passed = true;

String name = "Java";
```

## Final Diagram

```text
                 Java Data Types
                       │
             ┌─────────┴─────────┐
             ↓                   ↓
        Primitive           Non-Primitive
             │                   │
      ┌──────┼──────┐            │
      ↓      ↓      ↓            ↓
   byte   short    int         String
                    │
                  long

      Decimal
         │
    ┌────┴────┐
    ↓         ↓
  float     double

   Character
      ↓
    char

    Logic
      ↓
  boolean
```

---

# 25. One-Minute Revision

> **Data Type** → Tells Java what type of data a variable stores.

> **1 Byte = 8 Bits**

> **int** → Whole number

> **long** → Large whole number

> **float** → Decimal, single precision

> **double** → Decimal, more precision

> **char** → One character

> **boolean** → `true` / `false`

> **String** → Text

> **Primitive Data Types** → 8 basic types

```text
byte → 8 bits → 1 byte
short → 16 bits → 2 bytes
int → 32 bits → 4 bytes
long → 64 bits → 8 bytes
float → 32 bits → 4 bytes
double → 64 bits → 8 bytes
char → 16 bits → 2 bytes
boolean → Not fixed by Java
```
