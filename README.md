# Algorithms & Data Structures in Java

Data structures and algorithms implemented from scratch in Java, with no `java.util` collections.
They come from my *Data Structures and Algorithms* course (Systems Engineering, UCSM, 2025) plus later practice.
The code, comments and identifiers are mostly in Spanish.

```bash
mvn compile                      # Java 21, no external dependencies
java -cp target/classes graphs.adjacencylists.graphlink.GraphLink
```

## Contents

| Topic | Package | What's inside |
|---|---|---|
| **Graphs** | [`graphs`](src/main/java/graphs) | Graph as adjacency list, edge list and adjacency matrix. BFS, DFS, BFS path, **Dijkstra** / shortest path. Checks for connectivity, paths, cycles, complete, wheel, planar, isomorphic and self-complementary graphs |
| **B-Tree / B+ Tree** | [`datastructures.btree`](src/main/java/datastructures/btree) | B-Tree and B+ Tree with insertion, search and deletion; a student registry indexed by a B-Tree |
| **AVL Tree** | [`datastructures.avl`](src/main/java/datastructures/avl) | Self-balancing BST with rotations, and a Swing visualizer (`AVLTreeVisualizer`) |
| **Binary Search Tree** | [`datastructures.bst`](src/main/java/datastructures/bst) | Generic BST: insert, search, delete, traversals |
| **Hashing** | [`datastructures.hashing`](src/main/java/datastructures/hashing) | Open hashing (chaining) and closed hashing (open addressing), with prime-sized tables |
| **Stacks & Queues** | [`datastructures.stackqueue`](src/main/java/datastructures/stackqueue) | Array- and linked-based stacks and queues, two priority queues, bracket matching, circular list, sparse matrix |
| **Linked Lists** | [`datastructures.linkedlist`](src/main/java/datastructures/linkedlist) | Generic singly linked lists and a task manager built on top of one |
| **Sorting** | [`sorting`](src/main/java/sorting) | Merge sort in several versions: classic, in-place, optimized (insertion-sort cutoff + reusable buffer) and a multithreaded one |
| **Searching** | [`searching`](src/main/java/searching) | Binary search (recursive and iterative), Quickselect |
| **Recursion & Divide and Conquer** | [`recursion`](src/main/java/recursion) | Towers of Hanoi, Pythagoras tree (fractal), mode by divide and conquer, restricted subset sum, minimum-cost river trip (DP) |
| **Complexity** | [`complexity`](src/main/java/complexity) | Iterative vs. recursive algorithms for complexity analysis, fast exponentiation |
| **Fundamentals** | [`fundamentals`](src/main/java/fundamentals) | OOP with object arrays (rectangle intersection with a GUI), generics (containers, generic calculator, unit converter, inventory), number theory exercises (primes, perfect and amicable numbers) |
| Extras | [`extras`](src/main/java/extras) | Side experiments, such as a Swing ATM simulator |

### Documents

- [`docs/informes`](docs/informes): lab reports (Spanish).
- [`docs/notas`](docs/notas): draft fragments that never made it into the code.
- [`docs/diagramas-bd`](docs/diagramas-bd): PlantUML database diagrams from the same period. They are not about algorithms.

## History

The repo merges two earlier repositories, and keeps the full history of both:

1. **Algoritmia_UCSM** (Mar–Jul 2025): course labs, organized by phase and lab number (`Fase1/P1` … `Fase3/P11`).
2. **Algorithms---Programming-Logic---Documentation** (Mar 2026): number-theory exercises (`fundamentals.math`).

In November 2026 the code was reorganized by topic, and a Maven build was added.
Packages were renamed, but the logic was left untouched. `git log --follow <file>` shows each file's original history.

## Credits

Several labs were team work for the course. Thanks to:

- **José Carlos Yto Quispe** ([@josecarlosYQ](https://github.com/josecarlosYQ))
- **Miguel Bejarano Rivera** ([@Arthur845777](https://github.com/Arthur845777))

Their commits are kept in the history.
