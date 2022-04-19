package tddTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void anything(){
        stack = new Stack();
    }

    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    public void stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushIsNotEmpty_stackIsNotEmpty(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popY_stackShouldNotBeEmpty(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXandY_popY_stackShouldNotBeEmpty(){
        stack.push(13);
        stack.push(3);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldBeEmpty(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldNotBeXEmpty(){
        stack.push(13);
        int element = stack.pop();
        assertEquals(13, element);
    }

    @Test
    public void pushXandY_popYandX_stackShouldNEmpty(){
        stack.push(13);
        stack.push(3);
        int element = stack.pop();
        assertEquals(3, element);
        element = stack.pop();
        assertEquals(13, element);
    }

    @Test
    public void pushXandY_peekReturnsElementTest(){
            stack.push(13);
            stack.push(3);
            int element = stack.peep();
            assertEquals(3, element);
            element = stack.pop();
            assertEquals(3, element);
            element = stack.peep();
            assertEquals(13,element);

    }


}
