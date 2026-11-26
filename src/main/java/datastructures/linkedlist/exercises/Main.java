package datastructures.linkedlist.exercises;

public class Main {
    public static void main(String[] args) {
        // Crear la primera lista con números
        LinkedList<Integer> listaNumeros = new LinkedList<>();
        System.out.println("--- Creando lista de números ---");
        LinkedListExercises.insertar(listaNumeros, 10);
        LinkedListExercises.insertar(listaNumeros, 20);
        LinkedListExercises.insertar(listaNumeros, 30);
        LinkedListExercises.insertar(listaNumeros, 40);
        LinkedListExercises.insertar(listaNumeros, 50);
        
        // Crear la segunda lista con números
        LinkedList<Integer> listaNumeros2 = new LinkedList<>();
        System.out.println("\n--- Creando segunda lista de números ---");
        LinkedListExercises.insertar(listaNumeros2, 100);
        LinkedListExercises.insertar(listaNumeros2, 200);
        LinkedListExercises.insertar(listaNumeros2, 300);
        
        // Crear una lista para comparación
        LinkedList<Integer> listaComparacion = new LinkedList<>();
        System.out.println("\n--- Creando lista para comparación ---");
        LinkedListExercises.insertar(listaComparacion, 10);
        LinkedListExercises.insertar(listaComparacion, 20);
        LinkedListExercises.insertar(listaComparacion, 30);
        LinkedListExercises.insertar(listaComparacion, 40);
        LinkedListExercises.insertar(listaComparacion, 50);
        
        // Crear una lista de strings
        LinkedList<String> listaStrings = new LinkedList<>();
        System.out.println("\n--- Creando lista de strings ---");
        LinkedListExercises.insertar(listaStrings, "Hola");
        LinkedListExercises.insertar(listaStrings, "Mundo");
        LinkedListExercises.insertar(listaStrings, "Java");
        
        // Probar el método search
        System.out.println("\n--- Prueba método search ---");
        System.out.println("¿Está el 30 en la lista?: " + LinkedListExercises.search(listaNumeros, 30));
        System.out.println("¿Está el 60 en la lista?: " + LinkedListExercises.search(listaNumeros, 60));
        System.out.println("¿Está 'Java' en la lista de strings?: " + LinkedListExercises.search(listaStrings, "Java"));
        System.out.println("¿Está 'Python' en la lista de strings?: " + LinkedListExercises.search(listaStrings, "Python"));
        
        // Probar el método contar
        System.out.println("\n--- Prueba método contar ---");
        System.out.println("La lista de números tiene " + LinkedListExercises.contar(listaNumeros) + " elementos");
        System.out.println("La lista de strings tiene " + LinkedListExercises.contar(listaStrings) + " elementos");
        
        // Probar el método comparar
        System.out.println("\n--- Prueba método comparar ---");
        System.out.println("¿Son iguales listaNumeros y listaComparacion?: " + 
                          LinkedListExercises.comparar(listaNumeros, listaComparacion));
        System.out.println("¿Son iguales listaNumeros y listaNumeros2?: " + 
                          LinkedListExercises.comparar(listaNumeros, listaNumeros2));
        
        // Probar el método unir
        System.out.println("\n--- Prueba método unir ---");
        System.out.println("Uniendo listaNumeros con listaNumeros2");
        LinkedListExercises.unir(listaNumeros, listaNumeros2);
        
        // Probar el método invertir
        System.out.println("\n--- Prueba método invertir con lista par ---");
        LinkedList<Character> listaParCaracteres = new LinkedList<>();
        LinkedListExercises.insertar(listaParCaracteres, 'A');
        LinkedListExercises.insertar(listaParCaracteres, 'B');
        LinkedListExercises.insertar(listaParCaracteres, 'C');
        LinkedListExercises.insertar(listaParCaracteres, 'D');
        LinkedListExercises.invertir(listaParCaracteres);
        
        System.out.println("\n--- Prueba método invertir con lista impar ---");
        LinkedList<Character> listaImparCaracteres = new LinkedList<>();
        LinkedListExercises.insertar(listaImparCaracteres, 'X');
        LinkedListExercises.insertar(listaImparCaracteres, 'Y');
        LinkedListExercises.insertar(listaImparCaracteres, 'Z');
        LinkedListExercises.invertir(listaImparCaracteres);
        
        
    }
}