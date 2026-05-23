## Exp 02 — Stack and Queue data structures

Java application implementing Stack and Queue using classes and objects.

| File | Description |
|------|-------------|
| StackDemo.java | Stack using Java's built-in Stack class — push, pop with EmptyStackException |
| Queue.java | Queue using array — enQueue, deQueue, display with full/empty checks |

## Concepts used
- Stack: LIFO (Last In First Out) — java.util.Stack
- Queue: FIFO (First In First Out) — array-based with front and rear pointers
- isFull() and isEmpty() boundary checks
- EmptyStackException handling in StackDemo

## Sample output

**StackDemo.java**
```
stack: []
push(42) → stack: [42]
push(66) → stack: [42, 66]
push(99) → stack: [42, 66, 99]
pop → 99  stack: [42, 66]
pop → 66  stack: [42]
pop → 42  stack: []
pop → empty stack
```

**Queue.java**
```
Element 100 is inserted
Element 200 is inserted
Element 300 is inserted
Element 400 is inserted
Element 500 is inserted
Queue is full
Elements: 100 200 300 400 500
Element 100 is deleted
Elements: 200 300 400 500
```

## How to compile & run
```bash
javac StackDemo.java
java StackDemo

javac Queue.java
java Queue
```