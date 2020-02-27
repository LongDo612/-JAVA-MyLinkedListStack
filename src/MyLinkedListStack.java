import java.util.LinkedList;

public class MyLinkedListStack<E> {

    private LinkedList<E> stack;

    public MyLinkedListStack() {
        this.stack = new LinkedList<E>();
    }

    public void push(E element) {
        stack.push(element);
    }

    public E pop() {
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void traverseList() {
        for (E e : stack) {
            System.out.println(e);
        }
    }
}
