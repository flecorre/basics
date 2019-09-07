package flecorre.data.struct.stack.array;

public class Stack<T> {

    private T[] stack;
    private int count;

    public Stack() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T data) {
        if(this.count == this.stack.length) {
           resizeStack(this.stack.length*2);
        }
        this.stack[count++] = data;
    }

    public T pop() {
        T itemToPop = this.stack[--count];
        this.stack[count] = null;
        if(this.count > 0 && this.count == this.stack.length / 4) {
            resizeStack(this.stack.length / 2);
        }
        return itemToPop;
    }

    public void peek() {
        if(this.count > 0) {
            System.out.println(this.stack[count]);
        }
    }

    private void resizeStack(int capacity) {
        T[] newStack = (T[]) new Object[capacity];
        System.arraycopy(this.stack, 0, newStack, 0, this.stack.length);
        this.stack = newStack;
    }
}
