package searching.quickselect;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quickselect b = new Quickselect();
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(4, 2, 7, 10, 4, 1, 6));   
        b.di(lista2, 5);  
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(4, 2, 7, 1, 4, 6)); 
        b.di(lista, 1);
    }
    //1,2,4,4,6,7,10
}
