import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack<Integer> stack = new Stack<>();

    @Before
    public void init() {
        System.out.println("Before");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

    }

    @After
    public void fini() {
        System.out.println("After");
    }


    @Test
    public void testPush() {
        System.out.println("testPush");
        Integer num = new Integer(7);
        stack.push(num);
        assertEquals(num, stack.peek());
    }

    @Test
    public void testPop() {
        System.out.println("testPop");
        Integer num = stack.pop();
        assertEquals(new Integer(5), stack.peek());
    }

    @Test
    public void testPeek() {
        System.out.println("testPeek");
        Integer num = stack.peek();
        assertEquals(new Integer(6), stack.peek());
    }

    @Test
    public void testSize() {
        System.out.println("testSize");
        assertEquals(stack.size(), 6);
    }

    @Test
    public void testIsEmpty() {
        System.out.println("testIsEmpty");
        int stack_size = stack.size();
        for (int i = 0; i < stack_size; i = i+1) {
            Integer num = stack.pop();
        }
        assert(stack.isEmpty());
    }


}