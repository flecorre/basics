package flecorre.data.struct;

import flecorre.data.struct.linkedlist.LinkedList;
import flecorre.data.struct.linkedlist.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.size();
        list.remove(1100);
        list.insertAtBeginning(10);
        list.insertAtBeginning(11);
        list.insertAtBeginning(12);
        list.traverseList();
        list.insertAtEnd(14);
        list.size();
        list.traverseList();
        list.remove(109);
        list.traverseList();
    }
}
