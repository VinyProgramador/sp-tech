//Nome: Vinicius A Nunes
//RA: 01221125
public class Queue <T> {
    private int size;
    private final T[] queue;

    public Queue(int capacity) {
        this.queue = (T[]) new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void insert(T info) {
        if (isFull()) throw new IllegalStateException();
        queue[size++] = info;
    }

    public T peek() {
        return queue[0];
    }

    public T poll() {
        if (isEmpty()) return null;
        T aux = queue[0];
        for (int i = 0; i < size - 1; i++) queue[i] = queue[i+1];
        queue[--size] = null;
        return aux;
    }

    public void show() {
        for (int i = 0; i < size; i++) System.out.print(queue[i] + " ");
    }

    public int getSize(){
        return size;
    }
}


