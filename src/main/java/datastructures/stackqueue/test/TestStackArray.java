package datastructures.stackqueue.test;

import datastructures.stackqueue.exceptionisempty.ExceptionIsEmpty;
import datastructures.stackqueue.stack.ArrayStack;

public class TestStackArray {
	public static void main(String[] args) throws ExceptionIsEmpty {
		ArrayStack<Integer> stckArr = new ArrayStack<>();
		//stckArr.pop();
		stckArr.push(10);
		stckArr.push(20);
		stckArr.push(30);
		System.out.println(stckArr.top());
		System.out.println(stckArr.pop());
		System.out.println(stckArr.top());
		stckArr.push(30);
		stckArr.push(40);		
	}
}
