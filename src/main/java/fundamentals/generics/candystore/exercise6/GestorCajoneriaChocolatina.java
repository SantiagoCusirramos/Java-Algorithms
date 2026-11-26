package fundamentals.generics.candystore.exercise6;

import fundamentals.generics.candystore.exercise5.Cajoneria;

import java.util.Scanner;

public class GestorCajoneriaChocolatina {
	Cajoneria<Chocolatina> cj = new Cajoneria();
	Scanner sc = new Scanner(System.in);
	
	public void agregarItem() {
		String nombre = sc.nextLine();
		double peso = Double.parseDouble(sc.nextLine());
		Chocolatina c = new Chocolatina(nombre, peso);
		cj.agregar(c);
	}
	
	public void agregarItem(Chocolatina c) {
		cj.agregar(c);
	}
	
	public void buscarItem(String nombre) {
		for (Chocolatina c :cj.getLista() ) {
			if (c.getNombre().equals(nombre)) {
				System.out.println(c);
			}
		}
	}
}