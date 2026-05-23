## Exp 07 — Multithreading

Java multithreaded application with 3 threads — number generator, square
calculator (even), and cube calculator (odd).

| Class | Type | Description |
|-------|------|-------------|
| even | implements Runnable | Thread 2 — prints square if number is even |
| odd | implements Runnable | Thread 3 — prints cube if number is odd |
| A | extends Thread | Thread 1 — generates random number every 1 second (×5) |
| multithreadprog | Main class | Creates and starts Thread 1 |

## Concepts used
- Thread creation: extends Thread and implements Runnable
- run() method for thread logic
- Thread.sleep(1000) for 1-second interval between generations
- Random class for random number generation (0–99)
- Conditional: num%2==0 → square thread, else → cube thread
- new Thread(new even(num)).start() — dynamic thread creation

## Thread flow

```
Thread A (Generator)
    → generates random number every 1 second (5 times)
         ↓ even?                    ↓ odd?
  Thread 1 (even)           Thread 2 (odd)
  prints: n² (square)       prints: n³ (cube)
```

## Sample output

```
Main Thread and Generated Number is 42
New Thread 42 is EVEN and Square of 42 is: 1764

Main Thread and Generated Number is 17
New Thread 17 is ODD  and Cube   of 17 is: 4913

Main Thread and Generated Number is 8
New Thread 8  is EVEN and Square of 8  is: 64
```

## How to compile & run
```bash
javac evenimplementsRunnable.java
java multithreadprog
```