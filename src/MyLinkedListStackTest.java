public class MyLinkedListStackTest {
    public static void main(String[] args) {
        MyLinkedListStack<Integer> stack = new MyLinkedListStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.pop();
        System.out.println("\nSize of this stack: "+stack.size());
        System.out.println("\nIs Empty? \n"+stack.isEmpty());
        System.out.println();
        stack.traverseList();
    }
}
