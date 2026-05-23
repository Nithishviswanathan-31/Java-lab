## Exp 06 — Exception handling

Programs demonstrating built-in and user-defined exception handling in Java.

| File | Program | Description |
|------|---------|-------------|
| ExceptionExample.java | Exp 6a | Divide by zero — triggers ArithmeticException |
| ExceptionExample.java | Exp 6b | Student age validation — user-defined AgeDoesnotMatchException |

## Concepts used
- try, catch, throw, throws keywords
- Built-in: java.lang.ArithmeticException (divide by zero)
- User-defined: class AgeDoesnotMatchException extends Exception
- Custom message via constructor argument
- Age validation: must be between 17 and 24 (inclusive)
- e.printStackTrace() for detailed error trace

## Sample output

**Exp 6a — Divide by zero**
```
Enter first number : 100
Enter second number: 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at ExceptionExample.main(ExceptionExample.java:10)
```

**Exp 6b — User defined age exception**
```
Enter the name of the Student : Nithish
Enter the age (should be 17 to 24): 16
AgeDoesnotMatchException: Age is not between 17 and 24

Enter the name of the Student : Nithish
Enter the age (should be 17 to 24): 21
Name of the Student: Nithish
Age  of the Student: 21
```

## How to compile & run
```bash
javac ExceptionExample.java
java ExceptionExample
```