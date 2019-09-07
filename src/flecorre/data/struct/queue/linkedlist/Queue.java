package flecorre.data.struct.queue.linkedlist;

import flecorre.data.struct.linkedlist.Node;

public class Queue<T extends Comparable<T>> {

    private int count;
    private Node<T> firstNode;
    private Node<T> lastNode;

    public void enqueue(T data) {
        Node<T> oldLastNode = this.lastNode;
        this.lastNode = new Node<T>(data);
        if(isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNextNode(this.lastNode);
        }
        this.count++;
    }

    public T dequeue() {
        T data = this.firstNode.getData();
        this.firstNode = this.firstNode.getNextNode();
        this.count--;
        if(isEmpty()) {
            this.lastNode = null;
        }
        return data;
    }

    public int size() {
        return this.count;
    }

    private boolean isEmpty() {
        return this.firstNode == null;
    }
}
