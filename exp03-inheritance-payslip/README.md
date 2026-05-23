## Exp 03 — Inheritance and pay slip generation

Java application demonstrating multilevel inheritance using an Employee class
hierarchy with pay slip generation for different staff designations.

| Class | Description |
|-------|-------------|
| Employee | Base class — name, ID, address, email, mobile |
| Programmer | Extends Employee — adds Basic Pay (BP), computes DA/HRA/PF |
| Assistant_Professor | Extends Employee — adds BP, computes salary components |
| Associate_Professor | Extends Employee — adds BP, computes salary components |
| Professor | Extends Employee — adds BP, computes salary components |
| Main | Driver class — menu-driven selection of designation |

## Salary components

| Component | Formula |
|-----------|---------|
| DA | 97% of BP |
| HRA | 10% of BP |
| PF | 12% of BP |
| Staff Club Fund | 0.1% of BP |

## Concepts used
- Single inheritance using extends
- Method overriding — display() in each subclass
- Scanner for menu-driven input
- switch-case for designation selection

## Sample output

```
1.Programmer
2.Assistant_Professor
3.Associate_Professor
4.Professor
Enter an integer: 1

BP              : 15000
DA              : 14550.0
HRA             : 1500.0
PF              : 1800.0
STAFF CLUB FUND : 15.0
Name            : ABC
Emp ID          : 567
Mail            : praw@gmail.com
Mobile          : 2345678
```

## How to compile & run
```bash
javac Employee.java
java Main
```