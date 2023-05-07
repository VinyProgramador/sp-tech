package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Stack {
    private int[] stack;
    private int top;

    public Stack(int capacidade) {
        stack = new int[capacidade];
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int info) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            throw new IllegalStateException("Pilha cheia");
        }
        else {
            stack[++top] = info;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public int getTopo() {
        return top;
    }
}
