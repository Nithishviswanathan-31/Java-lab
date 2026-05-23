## Exp 05 — Interface and shape area

Same shape area problem as Exp 04 reimplemented using Java interface
instead of abstract class.

| Class / Interface | Description |
|-------------------|-------------|
| Shape (interface) | Declares input() and area() methods |
| Circle | Implements Shape — area = π × r² (r=5) |
| Rectangle | Extends Circle, implements Shape — area = l × b (l=6, b=4) |
| Demo | Driver class — creates Rectangle object, calls input() and area() |

## Concepts used
- interface keyword with abstract method declarations
- implements for interface realization
- extends combined with implements
- super.input() and super.area() for parent method calls
- Difference from Exp 04: interface vs abstract class

## Key difference from Exp 04

| Feature | Abstract Class (Exp 04) | Interface (Exp 05) |
|---------|-------------------------|--------------------|
| Keyword | extends | implements |
| Constructor | Allowed | Not allowed |
| Method body | Can have | Not allowed (Java 7) |
| Multiple inherit | No | Yes |

## Sample output

```
Area of circle    : 78.5
Area of rectangle : 24
```

## How to compile & run
```bash
javac Demo.java
java Demo
```