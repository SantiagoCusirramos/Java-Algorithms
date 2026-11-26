package fundamentals.generics.ejercicio.calculadoragenerica;

class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException() {
        super("Error: Entrada no válida. Debe ingresar un número.");
    }
}