## Exp 04 — Abstract class and shape area

Java program using an abstract class Shape with overridden PrintArea()
method in Rectangle, Triangle, and Circle subclasses.

| Class | Description |
|-------|-------------|
| Shape | Abstract class — two int members (a, b), abstract PrintArea() |
| Rectangle | Extends Shape — area = a × b |
| Triangle | Extends Shape — area = 0.5 × a × b |
| Circle | Extends Shape — area = 3.14 × a × a |
| Z | Driver class — menu-driven: circle / rectangle / triangle |

## Concepts used
- abstract class and abstract method
- Inheritance using extends
- Method overriding with PrintArea()
- super(a, b) constructor chaining
- Scanner for runtime shape selection
- System.exit(0) for quitting

## Sample output

```
Which shape? circle/rectangle/triangle (write any other to quit):
rectangle
height: 5
width : 10
Area of rectangle is 50

Which shape? circle/rectangle/triangle:
circle
height: 7
width : 7
Area of circle is 153.86
```

## How to compile & run
```bash
javac Shape.java
java Z
```