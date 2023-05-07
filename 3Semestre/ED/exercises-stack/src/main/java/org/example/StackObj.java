package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class StackObj<T> {
    private Object[] stack;
    private int top;
    private int capacity;

    public StackObj(int capacidade) {
        stack = new Object[capacidade];
        top = -1;
        capacity = capacidade;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(T info) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            throw new IllegalStateException("Pilha cheia");
        } else {
            stack[++top] = info;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return (T) stack[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) stack[top];
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public int getTopo() {
        return top;
    }
}

