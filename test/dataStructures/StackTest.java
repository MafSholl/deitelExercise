package dataStructures;

import chapterSeven.StudentGrader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void stackExistTest(){
        assertNotNull(stack);
    }

    @Test
    public void stackCanPushTest(){
        stack.push("string");
        assertEquals(1, stack.size());
    }

    @Test
    public void stackCanRemoveTest(){
        stack.push(3);
        stack.remove();
        assertEquals(0, stack.size());
    }

    @Test
    public void stackPushesElementTest(){
        stack.push(new StudentGrader());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackIsEmptyBeforePushTest(){
        assertTrue(stack.isEmpty());
        stack.push(true);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackCanGetPushedElementTest(){
        stack.push(24);
        stack.push(40);
        assertEquals(24, stack.get(0));
        assertEquals(40, stack.get(1));
    }

    @Test
    public void onlyObjectsOfTheSameTypeGetsPushed(){
        stack.push(24);
        assertThrows(ClassCastException.class, ()-> stack.push(true));
        assertEquals(1, stack.size());
    }

    @Test
    public void objectsOfDifferentTypeThrowFitTest(){
        stack.push(24);
        assertThrows(ClassCastException.class, ()->stack.push(true));
    }

    @Test
    public void stackCanRemoveObjectTest(){
        stack.push(34);
        stack.push(24);
        stack.push(14);
        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    public void peepTest(){
        stack.push(34);
        stack.push(24);
        stack.push(14);
        assertEquals(14, stack.peek());
    }

    @Test
    public void objectRemovedIsObjectPoppedTest(){
        stack.push(34);
        stack.push(24);
        stack.push(14);
        Object popped = stack.pop();
        assertEquals(14, popped);
        Object poppy = stack.pop();
        assertEquals(24, poppy);
    }

    @Test
    public void stackThrowsFitWhenFullTest(){
        stack.push(34);
        stack.push(24);
        stack.push(14);
        stack.push(34);
        stack.push(24);
        assertThrows(StackOverflowError.class, ()->stack.push(14));
    }


}
