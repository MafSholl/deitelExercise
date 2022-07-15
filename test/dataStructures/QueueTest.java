package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void setUp(){
        queue = new Queue();
    }

    @Test
    public void queueExistTest(){
        assertNotNull(queue);
    }

    @Test
    public void queueCanBeJoinedTest(){
        queue.queue(1);
        assertEquals(1, queue.size());
    }

    @Test
    public void queueCanAddElementTest(){
        queue.queue(1);
        assertEquals(1, queue.get(0));
    }

    @Test
    public void queueCanAddAndGetMultipleElementTest(){
        queue.queue(2);
        queue.queue(3);
        assertEquals(2, queue.get(0));
        assertEquals(3, queue.get(1));
    }

    @Test
    public void queueCanTakeOnlySameObjectType_andThrowsErrorTest(){
        queue.queue(1);
        queue.queue(4);
        queue.queue(9);
        assertThrows(ClassCastException.class, ()->queue.queue("String"));
    }

    @Test
    public void queueThrowsFitWhenFullTest(){
        queue.queue("dalu");
        queue.queue("otutu 0ma");
        queue.queue("igwe");
        queue.queue("bia");
        queue.queue("isiewu");
        assertThrows(StackOverflowError.class, ()->queue.queue("nagode"));

    }

    @Test
    public void peepTest(){
        queue.queue(5);
        queue.queue(8);
        queue.queue(4);
        Object peeped = queue.peek();
        assertEquals(5, peeped);
    }

    @Test
    public void popPopsFirstElementOnQueueTest(){
        queue.queue(true);
        queue.queue(false);
        queue.queue(false);
        queue.queue(false);
        queue.queue(true);
        Object popped = queue.dequeue();
        assertEquals(true, popped);
    }

    @Test
    public void AfterPopping_QueueAdjustItself(){
        queue.queue(true);
        queue.queue(false);
        queue.queue(false);
        queue.queue(false);
        queue.queue(true);
        assertEquals(true, queue.dequeue());
        assertEquals(false, queue.get(0));
        assertEquals(false, queue.get(1));
        assertEquals(false, queue.get(2));
        assertEquals(true, queue.get(3));
    }

    @Test
    public void queueShrinkInSize_WhenIPopTest(){
        queue.queue(true);
        queue.queue(false);
        queue.queue(false);
        queue.queue(false);
        queue.queue(true);
        queue.dequeue();
        assertEquals(4, queue.size());
    }
}