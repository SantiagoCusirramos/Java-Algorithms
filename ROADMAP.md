# Contexto y próximos pasos

Este documento sirve para retomar el repo sin tener que redescubrir nada: de dónde viene, cómo está armado, qué problemas tiene y qué se puede hacer después.
La descripción general está en el [README](README.md).

---

## 1. Contexto

### Origen

- Nació en el curso **Estructuras de Datos y Algoritmos** de Ingeniería de Sistemas de la UCSM (Arequipa), entre marzo y julio de 2025.
- Las prácticas se hicieron en equipo con José Carlos Yto Quispe y Miguel Bejarano Rivera. Elizabeth Rodríguez participó en los ejercicios de colas.
- Junta dos repositorios anteriores, que ya no existen por separado:

| Repo original | Periodo | Contenido | Commits |
|---|---|---|---|
| `Algoritmia_UCSM` (fork de `Arthur845777/Algoritmia_Prac2`) | mar–jul 2025 | Prácticas P1–P11 del curso, organizadas como `Fase1/P1` … `Fase3/P11` | 88 |
| `Algorithms---Programming-Logic---Documentation` | mar 2026 | Ejercicios de teoría de números | 4 |

### Reorganización del 26/11/2026

1. Se unieron los dos historiales en un solo repo, sin perder commits. `git log --follow <archivo>` muestra la historia original de cada archivo.
2. Se reorganizó por **tema** en vez de por número de práctica. Cada práctica del curso quedó así:

| Práctica | Tema | Paquete |
|---|---|---|
| P1 | POO y arreglos de objetos | `fundamentals.oop` |
| P2 | Genéricos | `fundamentals.generics` |
| P3 | Complejidad y merge sort | `complexity`, `sorting.mergesort` |
| P4 | Recursión, búsqueda y divide y vencerás | `recursion`, `searching`, `dynamicprogramming` |
| P5 | Listas enlazadas | `datastructures.linkedlist` |
| P6 | Pilas y colas | `datastructures.stackqueue` |
| P7 | Árbol binario de búsqueda | `datastructures.bst` |
| P8 | AVL | `datastructures.avl` |
| P9 | Grafos | `graphs` |
| P10 | Árboles B y B+ | `datastructures.btree` |
| P11 | Hashing | `datastructures.hashing` |

3. Se pusieron nombres descriptivos a paquetes y clases (por ejemplo, `Hilos` → `ParallelMergeSort`, `Ejer5` → `RodCutting`). **La lógica no se tocó.**
4. Se agregó Maven (`pom.xml`, Java 21, sin dependencias externas) y se quitaron los archivos de IntelliJ.
5. Los informes, las notas sueltas y los diagramas de BD pasaron a `docs/`.

### Convenciones

- **Paquetes y nombres nuevos en inglés.** El código, los comentarios y las variables originales siguen en español.
- **Un paquete por tema.** Dentro, subpaquetes por implementación (`openhashing`, `closedhashing`…).
- **Compilar:** `mvn compile`. **Ejecutar:** `java -cp target/classes <paquete.Clase>`.

### Estado al 26/11/2026

| Dato | Valor |
|---|---|
| Archivos `.java` | 180 (203 clases compiladas) |
| Clases con `main` | 59 |
| Tests automáticos | 0 |
| Commits | 97 |

---

## 2. Problemas conocidos (deuda técnica)

| Problema | Dónde | Qué hacer |
|---|---|---|
| **No hay tests reales.** Las clases `Test*` son `main` que imprimen resultados | `datastructures.stackqueue.demo`, `datastructures.avl.demo` | Pasarlas a JUnit 5 |
| 15 clases piden datos por `Scanner` y se caen si no hay entrada (`NoSuchElementException`) | `recursion.hanoi`, entre otras | Aceptar argumentos o usar valores de ejemplo |
| Clases de apoyo duplicadas: 4 `ExceptionIsEmpty`, 13 `Node`/`Nodo`, 6 `LinkedList`, 8 colas | En casi todos los temas | Crear un paquete `common` y reutilizarlo |
| `RedDistribucion` está comentada entera, porque dependía de JGraphT | `graphs.distributionnetwork` | Reescribirla con el `GraphLink` propio, o borrarla |
| Los árboles B usan `ArrayList` para las claves y los hijos | `datastructures.btree.*` | Cambiarlo por arreglos de tamaño fijo, como en un B-Tree clásico |
| `bplustreeexperiment` trae una `LinkedList` propia que no se usa | `datastructures.btree.bplustreeexperiment` | Usarla o borrarla |
| Hay varias versiones de lo mismo: dos B+, siete merge sort, dos implementaciones de colas | `btree`, `sorting`, `stackqueue`/`bst` | Dejar una versión "oficial" por estructura y marcar el resto como variantes |
| Borradores que ya quedaron implementados: `AVLTree.delete` y los recorridos de `BSTree` | `docs/notas` | Borrarlos cuando se compruebe que la versión final los cubre |
| Los diagramas de BD (contabilidad, usuarios) no son de algoritmos | `docs/diagramas-bd` | Moverlos al proyecto al que pertenecen |
| Español e inglés mezclados en los nombres | Todo el repo | Elegir un idioma para el código nuevo (sugerido: inglés) |

---

## 3. Próximos pasos

En orden, de lo más corto a lo más largo:

1. **Fijar (pin) el repo** en el perfil de GitHub.
2. **Tests con JUnit 5**, empezando por las estructuras base: pila, cola, lista, BST y AVL.
3. **CI con GitHub Actions** que corra `mvn test` en cada push, más el badge en el README.
4. **Complejidad Big-O en el Javadoc** de cada operación y una tabla resumen en el README.
5. **Paquete `common`** con los nodos y excepciones compartidas, para eliminar duplicados.
6. **Demos sin `Scanner`**, para que cada `main` se pueda correr sin escribir nada.
7. **Una versión oficial por estructura**, dejando las demás como variantes documentadas.

---

## 4. Futuras implementaciones

### Ordenamiento

- [ ] Quick sort (Lomuto, Hoare, pivote aleatorio)
- [ ] Heap sort
- [ ] Insertion, selection y bubble sort, como base de comparación
- [ ] Shell sort
- [ ] Counting sort y radix sort

### Búsqueda

- [ ] Búsqueda por interpolación
- [ ] Búsqueda exponencial
- [ ] Búsqueda ternaria

### Estructuras de datos

- [ ] Heap binario (min/max), como base de la cola de prioridad
- [ ] Deque
- [ ] Árbol rojo-negro
- [ ] Trie
- [ ] Union-Find (disjoint set)
- [ ] Segment tree y Fenwick tree
- [ ] Skip list
- [ ] Caché LRU (hash + lista doblemente enlazada)

### Grafos

- [ ] A\*
- [ ] Bellman-Ford y Floyd-Warshall
- [ ] Prim y Kruskal (árbol de expansión mínima)
- [ ] Orden topológico
- [ ] Componentes fuertemente conexas (Tarjan / Kosaraju)
- [ ] Dijkstra con heap: hoy la versión es O(V²)

### Programación dinámica y backtracking

- [ ] Mochila 0/1
- [ ] LCS y distancia de edición
- [ ] Cambio de monedas
- [ ] Subsecuencia creciente más larga (LIS)
- [ ] N reinas y sudoku

### Cadenas

- [ ] KMP
- [ ] Rabin-Karp

---

## 5. Proyectos futuros

| Idea | Descripción | Relación |
|---|---|---|
| **Visualizador de algoritmos** | App web o JavaFX que anime ordenamientos, recorridos de grafos y rotaciones del AVL. Ya existe `AVLTreeVisualizer` como punto de partida | Portafolio |
| **Benchmarks con JMH** | Comparar las siete versiones de merge sort, incluida `ParallelMergeSort`, y graficar los tiempos | Muestra análisis, no solo código |
| **Motor de rutas** | Reutilizar `graphs` (Dijkstra y, más adelante, A\* con heap) en el proyecto Rutas mínimas, con mapas de OpenStreetMap | Proyecto Rutas mínimas + FlowteachIA |
| **Librería publicable** | Publicar las estructuras como librería Maven vía JitPack, con su Javadoc en GitHub Pages | Practicar empaquetado y documentación |
| **Carpeta de práctica de entrevistas** | Problemas de LeetCode o Codeforces resueltos con las estructuras de este repo | Preparación para entrevistas |
