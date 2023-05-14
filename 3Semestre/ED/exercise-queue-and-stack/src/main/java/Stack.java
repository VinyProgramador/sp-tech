//Nome: Vinicius A Nunes
//RA: 01221125
public class Stack<T> {
    private final T[] stack;
    private int top;

    public Stack(int capacity) {
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(T info) {
        if (isFull()) throw new IllegalStateException("Pilha cheia!");
        else stack[++top] = info;
    }

    public T pop() {
        return stack[top--];
    }

    public Object peek() {
        if (isEmpty()) return -1;
        return stack[top];
    }

    public void showStack() {
        if (isEmpty()) System.out.println("Empty stack!");
        else for (int i = 0; i <= top; i++) System.out.print(stack[i] + " ");
    }

    public int getTop() {
        return top;
    }

}
