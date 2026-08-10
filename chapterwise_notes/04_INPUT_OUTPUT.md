# Java Input / Output (I/O)

## 1. What is I/O?

**I/O** stands for:

```text
I → Input
O → Output
```

### Definition

**Input** means taking data from the user.

**Output** means displaying data to the user.

### Simple Diagram

```text
        User
         │
         │ Input
         ↓
     Java Program
         │
         │ Output
         ↓
       Screen
```

Example:

```text
User enters → 25
              ↓
        Java Program
              ↓
Screen shows → 25
```

---

# 2. Output in Java

Java provides `System.out` to display output.

There are mainly two methods beginners should know:

```java
System.out.print();
System.out.println();
```

---

# 3. `System.out.print()`

### Definition

`print()` displays the output **without moving to a new line**.

Example:

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

### Diagram

```text
print()
  ↓
Prints on the same line
```

---

# 4. `System.out.println()`

### Definition

`println()` displays the output and then **moves the cursor to the next line**.

Example:

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

### Diagram

```text
println()
   ↓
Prints
   ↓
Moves to next line
```

---

# 5. `print()` vs `println()`

| Method                 | What it does                           |
| ---------------------- | -------------------------------------- |
| `System.out.print()`   | Prints without moving to the next line |
| `System.out.println()` | Prints and moves to the next line      |

Example:

```java
System.out.print("Hello ");
System.out.print("Biswa");
```

Output:

```text
Hello Biswa
```

Example:

```java
System.out.println("Hello");
System.out.println("Biswa");
```

Output:

```text
Hello
Biswa
```

---

# 6. Printing Variables

We can also print variables.

```java
String name = "Biswa";
int age = 20;

System.out.println(name);
System.out.println(age);
```

Output:

```text
Biswa
20
```

---

# 7. Printing Calculations

We can perform calculations and print the result.

```java
int a = 56;
int b = 56;

int sum = a + b;

System.out.println(sum);
```

Output:

```text
112
```

Another example:

```java
int mul = a * b;

System.out.println(mul);
```

Output:

```text
3136
```

---

# 8. Taking Input from the User

To take input from the keyboard, Java commonly uses the **`Scanner`** class.

First, import Scanner:

```java
import java.util.*;
```

Then create a Scanner object:

```java
Scanner sc = new Scanner(System.in);
```

### Meaning

```text
Scanner
   ↓
Class used to take input

sc
   ↓
Scanner object

System.in
   ↓
Keyboard input
```

---

# 9. What is `Scanner`?

### Definition

**Scanner is a Java class used to read input from the user.**

Example:

```java
Scanner sc = new Scanner(System.in);
```

Think of it like:

```text
Keyboard
   ↓
Scanner
   ↓
Java Program
```

---

# 10. Taking a String Input with `next()`

### Definition

`next()` reads the **next word/token** entered by the user.

Example:

```java
Scanner sc = new Scanner(System.in);

String user = sc.next();

System.out.println(user);
```

Input:

```text
Biswa
```

Output:

```text
Biswa
```

### Important

If the user enters:

```text
Biswa Biswal
```

`next()` reads only:

```text
Biswa
```

because it stops at whitespace.

---

# 11. Taking a Full Line with `nextLine()`

### Definition

`nextLine()` reads the **entire line**, including spaces.

Example:

```java
Scanner sc = new Scanner(System.in);

String user = sc.nextLine();

System.out.println(user);
```

Input:

```text
Biswa Biswal
```

Output:

```text
Biswa Biswal
```

### Difference

```text
next()
   ↓
Reads one word

nextLine()
   ↓
Reads the complete line
```

---

# 12. Taking Integer Input — `nextInt()`

`nextInt()` is used to read an integer.

Example:

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

System.out.println(age);
```

Input:

```text
20
```

Output:

```text
20
```

---

# 13. Taking Float Input — `nextFloat()`

`nextFloat()` is used to read a `float`.

Example:

```java
Scanner sc = new Scanner(System.in);

float price = sc.nextFloat();

System.out.println(price);
```

Input:

```text
10.5
```

Output:

```text
10.5
```

---

# 14. Taking Double Input — `nextDouble()`

`nextDouble()` is used to read a `double`.

Example:

```java
Scanner sc = new Scanner(System.in);

double price = sc.nextDouble();

System.out.println(price);
```

Input:

```text
99.99
```

Output:

```text
99.99
```

---

# 15. Common Scanner Methods

| Method          | Used For       | Example          |
| --------------- | -------------- | ---------------- |
| `next()`        | One word/token | `Biswa`          |
| `nextLine()`    | Complete line  | `Biswa Biswal`   |
| `nextInt()`     | Integer        | `25`             |
| `nextFloat()`   | Float          | `10.5f`          |
| `nextDouble()`  | Double         | `99.99`          |
| `nextLong()`    | Long integer   | `100000L`        |
| `nextShort()`   | Short integer  | `100`            |
| `nextByte()`    | Byte integer   | `10`             |
| `nextBoolean()` | Boolean        | `true` / `false` |

---

# 16. Complete Input/Output Example

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        // Output
        System.out.println("Hello World");
        System.out.print("Hello ");

        String name = "Biswa";
        int a = 56;
        int b = 56;

        // Calculation
        int sum = a + b;
        System.out.println(sum);

        int mul = a * b;
        System.out.println(mul);

        // Input
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();

        System.out.println(user);
    }
}
```

---

# 17. Example with Different Inputs

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

Input:

```text
Enter your name: Biswa
Enter your age: 20
```

Output:

```text
Name: Biswa
Age: 20
```

---

# 18. String Concatenation

We can join text and variables using `+`.

Example:

```java
String name = "Biswa";
int age = 20;

System.out.println("My name is " + name);
System.out.println("My age is " + age);
```

Output:

```text
My name is Biswa
My age is 20
```

### Diagram

```text
"My name is " + name
       ↓          ↓
      Text      Variable
          \      /
           \    /
             ↓
       My name is Biswa
```

---

# 19. Taking Two Numbers as Input

Example:

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
```

Input:

```text
10
20
```

Output:

```text
30
```

### Flow

```text
User
 ↓
10
 ↓
Scanner
 ↓
a = 10

User
 ↓
20
 ↓
Scanner
 ↓
b = 20

a + b
 ↓
30
 ↓
Output
```

---

# 20. Important: `next()` vs `nextLine()`

```text
next()
  ↓
Reads one word/token

Example:
Biswa Biswal
 ↓
Biswa
```

```text
nextLine()
  ↓
Reads complete line

Example:
Biswa Biswal
 ↓
Biswa Biswal
```

---

# 21. Important Scanner Issue

When using `nextInt()` followed by `nextLine()`, you may encounter a leftover newline.

Example:

```java
int age = sc.nextInt();
String name = sc.nextLine();
```

In this situation, `nextLine()` can consume the remaining newline instead of waiting for the name.

A common solution is:

```java
int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();
```

Here the first `nextLine()` consumes the leftover newline.

---

# 22. Quick Revision

## Output

```java
System.out.print();
System.out.println();
```

```text
print()   → Same line
println() → Next line
```

## Input

```java
Scanner sc = new Scanner(System.in);
```

```text
next()       → One word
nextLine()   → Complete line
nextInt()    → int
nextFloat()  → float
nextDouble() → double
nextLong()   → long
nextBoolean()→ boolean
```

---

# 23. One-Minute Revision Diagram

```text
                 Java I/O
                    │
             ┌──────┴──────┐
             ↓             ↓
           Input         Output
             ↓             ↓
          Scanner      System.out
             │             │
      ┌──────┼──────┐   ┌──┴───────┐
      ↓      ↓      ↓   ↓          ↓
   next() nextInt()  ... print() println()
   nextLine()
```

### Remember

> **Input → Scanner**

> **Output → System.out**

> **`print()` → Same line**

> **`println()` → New line**

> **`next()` → One word**

> **`nextLine()` → Complete line**

> **`nextInt()` → Integer input**
