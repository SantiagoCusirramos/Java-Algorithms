package datastructures.stackqueue.queue;
import datastructures.stackqueue.exceptionisempty.ExceptionIsEmpty;

public interface Queue<E> {
    void enqueue(E e);
    E dequeue() throws ExceptionIsEmpty;
    E front() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    boolean isEmpty();
}
