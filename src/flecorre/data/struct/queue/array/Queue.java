package flecorre.data.struct.queue.array;

import java.util.NoSuchElementException;

public class Queue<T> {

    private int front;
    private int back;
    private T[] queue;

    public Queue(int capacity) {
        queue = (T[]) new Object[capacity];
    }

    public void add(T data) {
        if(this.back == this.queue.length) {
            resizeQueue(this.queue.length * 2);
        }
        this.queue[back++] = data;
    }

    public T remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        T data = this.queue[front];
        this.queue[front++] = null;
        return data;
    }

    private void resizeQueue(int capacity) {
        T[] newQueue = (T[]) new Object[capacity];
        System.arraycopy(this.queue, 0, newQueue, 0, this.queue.length);
        this.queue = newQueue;
    }

    private int size() {
        return back - front;
    }
}
