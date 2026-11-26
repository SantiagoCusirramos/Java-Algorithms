package fundamentals.generics.calculator;

class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException() {
        super("Error: Entrada no válida. Debe ingresar un número.");
    }
}