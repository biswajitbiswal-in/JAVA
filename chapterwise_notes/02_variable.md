# Java Variables

## 1. What is a Variable?

### Definition

A **variable** is a named location used to **store data** in a Java program.

In simple words:

> A variable is a **container that stores a value**.

Example:

```java
int age = 20;
```

Here:

```text
int  → Data Type
age  → Variable Name
20   → Value
```

### Diagram

```text
        Variable
           ↓
     ┌─────────────┐
age  │     20      │
     └─────────────┘
           ↑
         Value
```

---

# 2. Why Do We Need Variables?

Suppose we want to store a student's age.

Without a variable:

```java
System.out.println(20);
```

With a variable:

```java
int age = 20;

System.out.println(age);
```

Variables make it easier to:

* Store data
* Reuse data
* Change data
* Perform calculations
* Make programs dynamic

Example:

```java
int age = 20;

System.out.println(age);
System.out.println(age + 1);
```

Output:

```text
20
21
```

---

# 3. Syntax of a Variable

The basic syntax is:

```text
dataType variableName = value;
```

Example:

```java
int age = 20;
```

### Breakdown

```text
int        age        =        20
 ↓          ↓         ↓         ↓
Type      Name     Assignment  Value
```

---

# 4. Declaration

### Definition

**Declaration** means creating a variable by specifying its data type and name.

Example:

```java
int age;
```

Here, we have declared a variable called `age`.

```text
int age;
 ↓   ↓
Type Name
```

At this point, we have not assigned a value.

---

# 5. Initialization

### Definition

**Initialization** means giving a variable its first value.

Example:

```java
int age = 20;
```

Here:

```text
Declaration → int age
Initialization → age = 20
```

---

# 6. Declaration + Initialization

We can do both at the same time:

```java
int age = 20;
```

```text
Declaration
     +
Initialization
     ↓
int age = 20;
```

---

# 7. Assigning a Value Later

We can also declare a variable first and assign a value later.

```java
int age;

age = 20;
```

Diagram:

```text
int age;
   ↓
Variable created
   ↓
age = 20;
   ↓
Value assigned
```

---

# 8. Changing the Value of a Variable

The value of a normal variable can be changed.

Example:

```java
int age = 20;

age = 21;

System.out.println(age);
```

Output:

```text
21
```

Diagram:

```text
age
 ↓
20
 ↓
21
```

The variable `age` now stores `21`.

---

# 9. Rules for Naming Variables

Java has rules for variable names.

### Rule 1: Cannot start with a number

❌ Wrong:

```java
int 1age = 20;
```

✅ Correct:

```java
int age1 = 20;
```

---

### Rule 2: Cannot contain spaces

❌ Wrong:

```java
int student age = 20;
```

✅ Correct:

```java
int studentAge = 20;
```

---

### Rule 3: Cannot use Java keywords

❌ Wrong:

```java
int class = 10;
```

`class` is a Java keyword.

---

### Rule 4: Variable names are case-sensitive

These are different variables:

```java
int age = 20;
int Age = 30;
```

```text
age ≠ Age
```

---

### Rule 5: Use meaningful names

❌ Not recommended:

```java
int x = 20;
```

✅ Better:

```java
int studentAge = 20;
```

Meaningful names make code easier to understand.

---

# 10. Naming Convention

Java commonly uses **camelCase** for variable names.

Example:

```java
int studentAge;
String studentName;
double accountBalance;
```

### camelCase

The first word starts with lowercase, and the next words start with uppercase.

```text
studentAge
   ↑
camelCase
```

---

# 11. Types of Variables in Java

Java has **three types of variables** based on where they are declared.

```text
Variables
   │
   ├── Local Variable
   │
   ├── Instance Variable
   │
   └── Static Variable
```

---

# 12. Local Variable

### Definition

A **local variable** is a variable declared inside a method, constructor, or block.

Example:

```java
class Main {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age);
    }
}
```

Here:

```java
int age = 20;
```

is a local variable.

It can be used only within its applicable method/block.

### Diagram

```text
class
 │
 └── main()
       │
       └── int age = 20
              ↑
        Local Variable
```

---

# 13. Instance Variable

### Definition

An **instance variable** is a variable declared inside a class but outside methods, constructors, or blocks.

Example:

```java
class Student {

    String name;
    int age;

}
```

Here:

```java
String name;
int age;
```

are instance variables.

Each object can have its own values.

---

# 14. Static Variable

### Definition

A **static variable** is a variable declared using the `static` keyword.

Example:

```java
class Student {

    static String college = "GIFT";
}
```

Here:

```java
static String college = "GIFT";
```

is a static variable.

A static variable belongs to the **class**, rather than to each individual object.

---

# 15. Local vs Instance vs Static

| Type     | Declared Where?               | Belongs To   |
| -------- | ----------------------------- | ------------ |
| Local    | Inside method/block           | Method/block |
| Instance | Inside class, outside methods | Object       |
| Static   | Inside class with `static`    | Class        |

### Simple Diagram

```text
                 Variables
                     │
        ┌────────────┼────────────┐
        ↓            ↓            ↓
      Local       Instance      Static
        ↓            ↓            ↓
      Method       Object        Class
```

---

# 16. Variables and Data Types

A variable must have a data type.

Example:

```java
int age = 20;
double price = 99.99;
char grade = 'A';
boolean passed = true;
String name = "John";
```

Diagram:

```text
Data Type       Variable       Value
   ↓               ↓             ↓

  int             age            20
double           price          99.99
  char           grade           'A'
boolean          passed          true
String           name          "John"
```

---

# 17. Multiple Variables

We can create multiple variables.

```java
int age = 20;
String name = "John";
double marks = 85.5;
boolean passed = true;
```

Each variable stores different data.

```text
age    → 20
name   → "John"
marks  → 85.5
passed → true
```

---

# 18. Assigning One Variable to Another

We can assign the value of one variable to another.

```java
int a = 10;
int b = a;

System.out.println(b);
```

Output:

```text
10
```

Diagram:

```text
a
↓
10
│
│
↓
b
↓
10
```

---

# 19. Changing Variables

Example:

```java
int a = 10;

a = 50;

System.out.println(a);
```

Output:

```text
50
```

The old value `10` is replaced by `50`.

```text
Before:

a → 10

After:

a → 50
```

---

# 20. `final` Variable

Sometimes we don't want a variable's value to change.

For this, we use `final`.

### Definition

A **final variable** is a variable whose value cannot be changed after it has been initialized.

Example:

```java
final int DAYS = 7;
```

This is not allowed:

```java
DAYS = 10;   // Error
```

Because `DAYS` is final.

### Diagram

```text
final variable
      ↓
   DAYS = 7
      ↓
 Cannot change
```

---

# 21. Variable Example

```java
public class Main {

    public static void main(String[] args) {

        String name = "Biswajit";
        int age = 20;
        double marks = 85.5;
        boolean passed = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(passed);
    }
}
```

Output:

```text
Biswajit
20
85.5
true
```

---

# 22. Important Terms

| Term              | Meaning                                          |
| ----------------- | ------------------------------------------------ |
| Variable          | Container used to store data                     |
| Data Type         | Specifies what type of data a variable can store |
| Variable Name     | Name used to access the variable                 |
| Value             | Actual data stored in the variable               |
| Declaration       | Creating a variable                              |
| Initialization    | Giving a variable its first value                |
| Assignment        | Giving/changing a value                          |
| Local Variable    | Variable declared inside a method/block          |
| Instance Variable | Variable belonging to an object                  |
| Static Variable   | Variable belonging to a class                    |
| `final`           | Prevents a variable from being reassigned        |

---

# 23. Quick Revision

### Basic Syntax

```java
dataType variableName = value;
```

Example:

```java
int age = 20;
```

Remember:

```text
int  → Data Type
age  → Variable Name
20   → Value
```

### Three Types

```text
Local    → Inside method/block
Instance → Inside class, outside methods
Static   → Class-level variable using static
```

### Variable Flow

```text
Declare
   ↓
Initialize
   ↓
Use
   ↓
Change (if allowed)
```

Example:

```java
int age;       // Declare

age = 20;      // Initialize

System.out.println(age);  // Use

age = 21;      // Change
```

### One-Line Definition

> **A variable is a named container used to store a value in a Java program.**
