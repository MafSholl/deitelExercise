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
        linkedList.add(3);
        assertEquals(1, linkedList.size());
    }

    @Test
    public void linkedListCanAddMoreThanOneTimeTest(){
        linkedList.add(1);
        linkedList.add(1);
        assertEquals(2, linkedList.size());
    }

    @Test
    public void addedElementCanBeGottenTest(){
        linkedList.add(8);
//        linkedList.add(4);
        assertEquals(8, linkedList.get(1));
    }

    @Test
    public void moreThanOneElementCanBeGottenTest(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(8);
        assertEquals(1, linkedList.get(0));
        assertEquals( 2, linkedList.get(1));
        assertEquals( 8, linkedList.get(2));
    }

    @Test
    public void eachNodeAfterTheFirstNodeKnowsPreviousNodeBeforeTest(){
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(8);
//        assertEquals(1, linkedList.getPreviousNodeValueAtNode(0));
        assertEquals( 1, linkedList.getPreviousNodeValueAtNode(1));
        assertEquals( 2, linkedList.getPreviousNodeValueAtNode(2));
    }




}
