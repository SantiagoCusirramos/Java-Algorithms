package datastructures.stackqueue.queue;
import datastructures.stackqueue.exceptions.ExceptionIsEmpty;

public interface Queue<E> {
    void enqueue(E e);
    E dequeue() throws ExceptionIsEmpty;
    E front() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    boolean isEmpty();
}
