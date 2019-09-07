package flecorre.data.struct.linkedlist;

public interface List<T> {

    void insertAtBeginning(T data);

    void insertAtEnd(T data);

    void remove(T data);

    void size();

    void traverseList();
}
