package datastructures.stackqueue.test;

import datastructures.stackqueue.exceptionisempty.ExceptionIsEmpty;
import datastructures.stackqueue.queue.LinkedQueue;

public class TestQueueLink {
	public static void main(String[] args) throws ExceptionIsEmpty {
		LinkedQueue<Integer> queueLink = new LinkedQueue<>();
		//queueLink.front();
		queueLink.enqueue(10);
		queueLink.enqueue(20);
		System.out.println(queueLink.dequeue());
	}
}
