package org.example.Aula5.PCS.ex3;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(stack.size(), 1);
    }

    @Test
    void pop() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(110);
        stack.push(120);
        stack.pop();
        assertEquals(stack.size(), 2);
    }

    @Test
    void size() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(2);
        stack.push(110);
        assertEquals(stack.size(), 3);
    }

    @Test
    void isEmpty() {
        Stack stack = new Stack();
        assertEquals(stack.isEmpty(), true);
    }


    @Test
    void popEmpty() {
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void testResize(){
        Stack stack = new Stack();
        for(int i=0; i<1100; i++)
        {
            stack.push(i);
        }
        assertEquals(stack.size(), 1100);
    }
}

