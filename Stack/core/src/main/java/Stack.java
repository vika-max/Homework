import java.awt.dnd.InvalidDnDOperationException;

/**
 * Created by root on 26.09.16.
 */
public class Stack<E> implements IStack<E>{
        private class Entry {
            private E element;
            private Entry next;

            public Entry(E element) {
                this(element, null);
            }

            public Entry(E element, Entry next) {
                this.element = element;
                this.next = next;
            }
        }
        Entry head = null;
        int count = 0;

        public Stack() {
        }

        public void push(E element) {
            head = new Entry(element, head);
            count++;
        }

        public E pop() {
            if (this.isEmpty()) {
                throw new InvalidDnDOperationException("Stack is empty");
            }
            Entry h = head;
            head = head.next;
            count--;
            return h.element;
        }

        public E peek() {
            if (this.isEmpty()) {
                throw new InvalidDnDOperationException("Stack is empty");
            }
            return head.element;
        }

        public int size() {
            return count;
        }

        public boolean isEmpty(){
            if (head == null){
                return true;
            }
            return false;
        }

        public String toString() {
            Entry pointer= head;
            StringBuilder builder = new StringBuilder();
            while (pointer !=null) {
                builder.append("{" + pointer.element + "}");
                builder.append(" -> ");
                pointer = pointer.next;
            }

            builder.append(" null ");
            return builder.toString();
        }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.size());
        int p1 = stack.pop();
        p1 = stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
    }
}
