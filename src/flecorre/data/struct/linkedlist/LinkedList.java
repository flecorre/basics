package flecorre.data.struct.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int size;

    @Override
    public void insertAtBeginning(T data) {
        if(this.root == null) {
            this.root = new Node<T>(data);
        } else {
            Node<T> oldRoot = this.root;
            this.root = new Node<T>(data);
            root.setNextNode(oldRoot);
        }
        this.size++;
    }

    @Override
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);
        Node<T> lastNode = this.root;
        while(lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(newNode);
        this.size++;
    }

    @Override
    public void remove(T data) {
        if(this.size > 0) {
            if(this.root.getData().compareTo(data) == 0) {
                this.root = this.root.getNextNode();
            } else {
                findAndRemoveData(data, this.root, this.root.getNextNode());
            }
        } else {
            System.out.println("LinkedList is empty");
        }
    }

    @Override
    public void size() {
        System.out.println("size: " + this.size);
    }

    @Override
    public void traverseList() {
        if(size > 0) {
            StringBuilder sb = new StringBuilder();
            Node<T> currentNode = this.root;
            while(currentNode != null) {
                sb.append(currentNode.toString() + " -> ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println(sb.toString());
        }

    }

    private void findAndRemoveData(T data, Node<T> previousNode, Node<T> currentNode) {
        boolean foundNode = false;

        while(currentNode != null && !foundNode) {
            if(currentNode.getData().compareTo(data) == 0) {
                foundNode = true;
                previousNode.setNextNode(currentNode.getNextNode());
            } else {
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
        }

        if(!foundNode) {
            System.out.println(data + " not in the LinkedList");
        }
    }
}
