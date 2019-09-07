package flecorre.data.struct.stack.linkedlist;

import flecorre.data.struct.linkedlist.Node;

public class Stack<T extends Comparable<T>> {

    private int count;
    private Node<T> root;

    public void push(T data) {
        if(this.root == null) {
            this.root = new Node<T>(data);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<T>(data);
            this.root.setNextNode(oldRoot);
        }
        this.count++;
    }

    public T pop() {
        T data = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return data;
    }

    public T peek() {
        return this.root.getData();
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
}
