package org.example.Aula5.PCS.ex3;

import java.util.EmptyStackException;

public class Stack {
    private int[] values = new int[3]; // Initial capacity of the stack
    private int size = 0;

    // Push a value onto the stack
    public void push(int x) {
        if (size >= values.length) {
            resize(); // Resize the array if needed
        }
        values[size++] = x; // Add the value and increment size
    }

    // Pop a value from the stack
    public int pop() {
        if (size > 0) {
            return values[--size]; // Decrement size and return the top value
        } else {
            throw new EmptyStackException(); // Throw exception if stack is empty
        }
    }

    // Resize the array to double its current length
    private void resize() {
        int[] newValues = new int[values.length * 2];
        System.arraycopy(values, 0, newValues, 0, values.length); // Copy old values to new array
        values = newValues;
    }

    // Optional: Get the current size of the stack
    public int size() {
        return size;
    }

    // Optional: Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
}

