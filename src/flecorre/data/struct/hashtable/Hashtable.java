package flecorre.data.struct.hashtable;

public class Hashtable<T> {

    private T[] hashTable;

    public Hashtable() {
        this.hashTable = (T[]) new Object[10];
    }

    public void put(String key, T data) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null) {
            System.out.println("Slot already used");
        } else {
            hashTable[hashedKey] = data;
        }
    }

    public T get(String key) {
        return hashTable[hashKey(key)];
    }

    public void printHashtable() {
        for (T e : hashTable) {
            System.out.println(e);
        }
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
}
