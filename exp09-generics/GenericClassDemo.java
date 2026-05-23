// Exp 09 — Generics in Java
// Author: Nithish V
// B.E. CSE (Cybersecurity), P.S.V. College of Engineering & Technology

import java.util.*;

// ─────────────────────────────────────────
// 1. Generic Class — Box<T>
// ─────────────────────────────────────────
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void display() {
        System.out.println("Box contains : " + value + " (" + value.getClass().getSimpleName() + ")");
    }
}

// ─────────────────────────────────────────
// 2. Generic Pair Class — holds two types
// ─────────────────────────────────────────
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key   = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key : " + key + " | Value : " + value);
    }
}

// ─────────────────────────────────────────
// 3. Bounded Generic Class — only Numbers
// ─────────────────────────────────────────
class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double doubled() {
        return value.doubleValue() * 2;
    }

    public void display() {
        System.out.println("Number : " + value + " | Doubled : " + doubled());
    }
}

// ─────────────────────────────────────────
// 4. Generic Stack — push, pop, peek
// ─────────────────────────────────────────
class GenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
        System.out.println("Pushed : " + item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        T item = stack.remove(stack.size() - 1);
        System.out.println("Popped : " + item);
        return item;
    }

    public T peek() {
        if (stack.isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }

    public void display() {
        System.out.println("Stack  : " + stack);
    }
}

// ─────────────────────────────────────────
// Main class
// ─────────────────────────────────────────
public class GenericClassDemo {

    // Generic Method — works with any type
    public static <T> void printType(T value) {
        System.out.println("Value : " + value + " | Type : " + value.getClass().getSimpleName());
    }

    // Bounded Generic Method — only Number types, finds max
    public static <T extends Comparable<T>> T findMax(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("       Exp 09 — Generics in Java          ");
        System.out.println("===========================================\n");

        // ── 1. Generic Box ──────────────────────────
        System.out.println("--- 1. Generic Class Box<T> ---");
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        intBox.display();

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        strBox.display();

        Box<Double> dblBox = new Box<>();
        dblBox.set(3.14);
        dblBox.display();

        // ── 2. Generic Pair ─────────────────────────
        System.out.println("\n--- 2. Generic Pair<K, V> ---");
        Pair<Integer, String> p1 = new Pair<>(1, "Nithish");
        Pair<String, Double>  p2 = new Pair<>("CGPA", 7.83);
        p1.display();
        p2.display();

        // ── 3. Bounded Generic Class ─────────────────
        System.out.println("\n--- 3. Bounded Generic Class <T extends Number> ---");
        NumberBox<Integer> nb1 = new NumberBox<>(25);
        NumberBox<Double>  nb2 = new NumberBox<>(3.75);
        nb1.display();
        nb2.display();

        // ── 4. Generic Method ────────────────────────
        System.out.println("\n--- 4. Generic Method ---");
        printType("PSV College");
        printType(2024);
        printType(9.5);
        printType(true);

        // ── 5. Bounded Generic Method ────────────────
        System.out.println("\n--- 5. Bounded Generic Method findMax() ---");
        System.out.println("Max(45, 78)         : " + findMax(45, 78));
        System.out.println("Max(3.14, 2.71)     : " + findMax(3.14, 2.71));
        System.out.println("Max(\"Apple\",\"Mango\") : " + findMax("Apple", "Mango"));

        // ── 6. Generic Stack ─────────────────────────
        System.out.println("\n--- 6. Generic Stack<T> ---");
        GenericStack<Integer> gs = new GenericStack<>();
        gs.push(10);
        gs.push(20);
        gs.push(30);
        gs.display();
        gs.pop();
        gs.display();
        System.out.println("Peek : " + gs.peek());

        System.out.println("\n===========================================");
        System.out.println("           Program completed!             ");
        System.out.println("===========================================");
    }
}
