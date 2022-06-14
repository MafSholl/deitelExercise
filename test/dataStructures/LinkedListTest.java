package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    public void setUp(){
        linkedList = new LinkedList();
    }

    @Test
    public void linkedListExistTest(){
        assertNotNull(linkedList);
    }

//    @Test
//    public void linkedListHasANodeTest(){
//        assertTrue(linkedList.isNode());
//    }

    @Test
    public void linkedListAddMethodWorksTest(){
        linkedList.addLast(3);
        assertEquals(1, linkedList.size());
    }

    @Test
    public void linkedListCanAddMoreThanOneTimeTest(){
        linkedList.addLast(1);
        linkedList.addLast(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void addedElementCanBeGottenTest(){
        linkedList.addLast(8);
//        linkedList.addLast(4);
        assertEquals(8, linkedList.get(0));
    }

    @Test
    public void moreThanOneElementCanBeGottenTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(6);
        assertEquals(1, linkedList.get(0));
        assertEquals( 2, linkedList.get(1));
        assertEquals( 8, linkedList.get(2));
        assertEquals( 6, linkedList.get(3));
    }

    @Test
    public void eachNodeAfterTheFirstNodeKnowsPreviousNodeBeforeTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        assertNull(linkedList.getPreviousNodeValueAtNode(0));
        assertEquals( 1, linkedList.getPreviousNodeValueAtNode(1));
        assertEquals( 2, linkedList.getPreviousNodeValueAtNode(2));
        assertEquals( 8, linkedList.getPreviousNodeValueAtNode(3));
    }

    @Test
    public void nodeCanBeRemoveTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.remove(2);
        assertEquals(1, linkedList.get(0));
        assertEquals( 2, linkedList.get(1));
        assertEquals( 9, linkedList.get(2));
    }

    @Test
    public void nodeCanBeAddedAtFrontTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        linkedList.addFirst(0);
        assertEquals(0, linkedList.get(0));
        assertEquals(5, linkedList.get(1));
        assertEquals(1, linkedList.get(2));
        assertEquals(2, linkedList.get(3));
        assertEquals(8, linkedList.get(4));
        assertEquals(9, linkedList.get(5));
    }

    @Test
    public void linkedListCanBeClearedTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        linkedList.addFirst(0);
        linkedList.clear();
        assertEquals(0, linkedList.size());
//        assertNull(linkedList.getFirst());
//        assertNull(linkedList.getLast());
    }

    @Test
    public void getElementMethodWorksTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        assertEquals(5, linkedList.element());
    }

    @Test
    public void getFirstElementMethodWorksTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        assertEquals(5, linkedList.getFirst());
    }

    @Test
    public void getLastElementMethodWorksTest(){
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(8);
        linkedList.addLast(9);
        linkedList.addFirst(5);
        assertEquals(9, linkedList.getLast());
    }



}
