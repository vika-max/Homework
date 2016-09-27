/**
 * Created by root on 26.09.16.
 */
public interface IStack<E> {
        void push(E element);
        E pop();
        E peek();
        int size();
        boolean isEmpty();
}
