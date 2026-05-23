## Exp 01 — Searching and sorting algorithms

Programs implementing fundamental searching and sorting algorithms in Java.

| File | Description |
|------|-------------|
| SelectionSortExample2.java | Selection sort — user inputs array size and elements dynamically |
| InsertionSortExample.java | Insertion sort — sorts array {9,14,3,2,43,11,58,22} |
| GFG.java | Sequential (linear) search — finds element index by scanning one by one |
| BinarySearchExample.java | Binary search — searches sorted array {10,20,30,40,50} |

## Concepts used
- Arrays and nested for loops
- Comparison-based swapping (Selection Sort)
- Key insertion logic (Insertion Sort)
- Linear traversal (Sequential Search)
- Divide and conquer — mid = (first+last)/2 (Binary Search)

## Time complexity

| Algorithm        | Best     | Average  | Worst    |
|------------------|----------|----------|----------|
| Selection Sort   | O(n²)    | O(n²)    | O(n²)    |
| Insertion Sort   | O(n)     | O(n²)    | O(n²)    |
| Sequential Search| O(1)     | O(n)     | O(n)     |
| Binary Search    | O(1)     | O(log n) | O(log n) |

## Sample output

**InsertionSortExample.java**
```
Before Insertion Sort: 9 14 3 2 43 11 58 22
After Insertion Sort : 2 3 9 11 14 22 43 58
```

**BinarySearchExample.java**
```
Array  : {10, 20, 30, 40, 50}
Search : 30
Element is found at index: 2
```

**GFG.java**
```
Array  : {2, 3, 4, 10, 40}
Search : 10
Element is present at index 3
```

## How to compile & run
```bash
javac SelectionSortExample2.java
java SelectionSortExample2
```