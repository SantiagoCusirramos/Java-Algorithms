package datastructures.stackqueue.exceptionisempty;

public class ExceptionIsEmpty extends Exception {
	public ExceptionIsEmpty() {
		super("El stack esta vacio");
	}
}