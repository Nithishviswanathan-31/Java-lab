## Exp 09 — Generics in Java

Java application demonstrating generic classes, generic methods, and
bounded type parameters for type-safe programming.

| File | Description |
|------|-------------|
| GenericClassDemo.java | Generic class Box<T>, generic method, bounded <T extends Number> |

## Concepts used
- Generic class: class Box<T> { private T value; }
- Generic method: public <T> void print(T value)
- Bounded type parameter: <T extends Number>
- Type safety — no explicit casting required
- Works with Integer, String, Double, and custom types

## Generic class structure

```java
class Box {
    private T value;
    public void set(T value) { this.value = value; }
    public T get()           { return value; }
}
```

## Sample output

```
Integer Box : 100
String Box  : Hello Generics
Double Box  : 3.14

Generic method with : PSV College
Generic method with : 2024

Sum (bounded generics): 55.5
```

## How to compile & run
```bash
javac GenericClassDemo.java
java GenericClassDemo
```
