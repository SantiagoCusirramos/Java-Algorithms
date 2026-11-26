package datastructures.stackqueue.test;

import datastructures.stackqueue.stack.LinkedStack;
import datastructures.stackqueue.exceptionisempty.ExceptionIsEmpty;

public class TestStackLink {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        try {
            System.out.println("Top: " + stack.top()); // Three
            System.out.println("Pop: " + stack.pop()); // Three
            System.out.println("Pop: " + stack.pop()); // Two
            System.out.println("Top: " + stack.top()); // One
            System.out.println("Pop: " + stack.pop()); // One

            // stack.pop(); // Descomenta para lanzar excepción

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
