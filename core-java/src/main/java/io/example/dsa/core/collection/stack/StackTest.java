package io.example.dsa.core.collection.stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
