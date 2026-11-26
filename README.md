# Java-Algorithms

Data structures and algorithms implemented by hand in Java. Lists, stacks, queues, BST/AVL trees, hash tables and graphs are built on their own nodes, not on `java.util`; the B-Trees still use `ArrayList` for keys and children.
They come from my *Data Structures and Algorithms* course (Systems Engineering, UCSM, 2025) plus later practice.
The code, comments and identifiers are mostly in Spanish.

```bash
mvn compile                                              # Java 21, no external dependencies
java -cp target/classes recursion.hanoi.Hanoi            # run any class that has a main()
```

## Contents

| Topic | Package | What's inside |
|---|---|---|
| **Graphs** | [`graphs`](src/main/java/graphs) | Three representations: `adjacencylist` (`GraphLink`), `edgelist` and `adjacencymatrix`. BFS, DFS, BFS path, **Dijkstra** / shortest path. Checks for connectivity, paths, cycles, complete, wheel, planar, isomorphic and self-complementary graphs |
| **B-Tree / B+ Tree** | [`datastructures.btree`](src/main/java/datastructures/btree) | `basic`: B-Tree. `bplustree`: B+ Tree. `bplustreeexperiment`: an alternative B-Tree and B+ Tree. `studentregistry`: a student registry indexed by a B-Tree |
| **AVL Tree** | [`datastructures.avl`](src/main/java/datastructures/avl) | Self-balancing BST with rotations, and a Swing visualizer (`gui.AVLTreeVisualizer`) |
| **Binary Search Tree** | [`datastructures.bst`](src/main/java/datastructures/bst) | Generic BST: insert, search, delete, traversals |
| **Hashing** | [`datastructures.hashing`](src/main/java/datastructures/hashing) | `openhashing` (chaining) and `closedhashing` (open addressing), with prime-sized tables |
| **Stacks & Queues** | [`datastructures.stackqueue`](src/main/java/datastructures/stackqueue) | Array- and linked-based `stack` and `queue`, `priorityqueue` (two versions), `bracketmatching`, `circularlist`, `sparsematrix`, `queueexercises` |
| **Linked Lists** | [`datastructures.linkedlist`](src/main/java/datastructures/linkedlist) | `basic` node and list, `operations` (search, reverse…), `exercises`, and a generic `taskmanager` |
| **Sorting** | [`sorting.mergesort`](src/main/java/sorting/mergesort) | `MergeSort`, `MergeSortInPlace`, `MergeSortOptimized` (insertion-sort cutoff and a reusable buffer), `ParallelMergeSort` (threads), `MergeSortGeneric`, `MergeSortArrayList`, `MergeSortWithCopies` |
| **Searching** | [`searching`](src/main/java/searching) | `binarysearch` (recursive and iterative), `quickselect` |
| **Dynamic Programming** | [`dynamicprogramming`](src/main/java/dynamicprogramming) | `RodCutting` (naive vs. DP), `RiverTripMinCost` |
| **Recursion & Divide and Conquer** | [`recursion`](src/main/java/recursion) | `hanoi`, `pythagorastree` (fractal), `ModeDivideAndConquer`, `RestrictedSubsetSum` |
| **Complexity** | [`complexity`](src/main/java/complexity) | `IterativeAlgorithms` and `RecursiveAlgorithms`, with the cost of each line annotated, and `ComplexityExercises` |
| **Fundamentals** | [`fundamentals`](src/main/java/fundamentals) | `oop`: rectangle intersection with a GUI, plus basics. `generics`: box, bags, candy store exercises, calculator, unit converter, inventory, financial simulator (MVC). `numbertheory`: primes, perfect and amicable numbers |
| Extras | [`extras`](src/main/java/extras) | Side experiments: `CajeroATM` (a Swing ATM simulator) and `RequitedLoveSimulation` |

### Documents

- [`docs/informes`](docs/informes): lab reports (Spanish).
- [`docs/notas`](docs/notas): draft fragments that never made it into the code.
- [`docs/diagramas-bd`](docs/diagramas-bd): PlantUML database diagrams from the same period. They are not about algorithms.

## History

See [ROADMAP.md](ROADMAP.md) for the full context, known issues and next steps.

The repo merges two earlier repositories and keeps the full history of both:

1. **Algoritmia_UCSM** (Mar–Jul 2025): course labs, organized by phase and lab number (`Fase1/P1` … `Fase3/P11`).
2. **Algorithms---Programming-Logic---Documentation** (Mar 2026): number-theory exercises, now in `fundamentals.numbertheory`.

In November 2026 the code was reorganized by topic, given descriptive names and a Maven build.
Only packages and class names changed; the logic is untouched.
`git log --follow <file>` shows each file's original history.

## Credits

Several labs were team work for the course. Thanks to:

- **José Carlos Yto Quispe** ([@josecarlosYQ](https://github.com/josecarlosYQ))
- **Miguel Bejarano Rivera** ([@Arthur845777](https://github.com/Arthur845777)): `bplustreeexperiment` started as his experiment
- **Elizabeth Rodríguez**, co-author of `queueexercises`

The commits of José Carlos and Miguel are kept in the history.
