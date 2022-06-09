package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static dataStructures.Cart.*;
import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set set;
    @BeforeEach
    public void setUp(){
        set = new Set();
    }

    @Test
    public void setListExist(){
        assertNotNull(set);
    }

    @Test
    public void setCanAddByItemTest(){
        assertTrue(set.isEmpty());
        set.add(SHOES);
        assertFalse(set.isEmpty());
    }

    @Test
    public void setCanAddMoreThanOneItemTest(){
        set.add(BAGS);
        set.add(SHOES);
        assertEquals(2, set.size());
    }

    @Test
    public void setItemsCanBeQueriedByIndexTest(){
        set.add(BAGS);
        assertEquals(BAGS, set.get(0));
    }

    @Test
    public void setCanOnlyTakeSameReferenceTypeTest(){
        set.add("shoes");
        assertThrows(ClassCastException.class, ()-> set.add(1));
    }

    @Test
    public void setCanIncreaseSizeWhenFull_AndAddTest(){
        set.add("shoes");
        set.add("vibrator");
        set.add("bra");
        set.add("panties");
        set.add("chocolate");
        set.add("pokeman");
        assertEquals("chocolate", set.get(4));
        assertEquals("pokeman", set.get(5));
    }

    @Test
    public void setCanAddACollectionOfItemsAtOnceTest(){
        Object[] test = {3, 2, 4, 7};
        set.addAll(test);
        assertEquals(3, set.get(0));
        assertEquals(2, set.get(1));
        assertEquals(4, set.get(2));
        assertEquals(7, set.get(3));
    }

    @Test
    public void setCanRemoveACollectionOfItemsAtOnceTest(){
        Object[] test = {3, 2, 4, 7};
        set.addAll(test);
        set.clear();
        assertEquals(0, set.size());
    }

    @Test
    public void setContainsMethodWorksTest(){
        Object[] test = {3, 2, 4, 7};
        set.addAll(test);
        assertFalse(set.contains(9));
        assertTrue(set.contains(3));
        assertFalse(set.contains(0));
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
        assertTrue(set.contains(7));
        assertFalse(set.contains(6));
    }

    @Test
    public void setContainsAllMethodWorksTest(){
        Object[] test = {3, 2, 4, 7};
        set.addAll(test);
        Object[] compared = {3, 2, 4, 0};
        assertFalse(set.containsAll(compared));
        Object[] compared2 = {3, 2, 4, 7};
        assertTrue(set.containsAll(compared2));
        Object[] compared3 = {0, 3, 7, 1};
        assertFalse(set.containsAll(compared3));
    }

//
//    @Test
//    public void arrayListCanAddMoreThanOneItemByIndexAndItemTest(){
//        set.add(0, "rolex");
//        set.add(1, "belt");
//        assertEquals("rolex", set.get(0));
//        assertEquals("belt", set.get(1));
//    }
//
//
//    @Test
//    public void arrayListAddMethodOfIndexAndItemOnlySameReference(){
//        set.add(0, "rolex");
//        assertThrows(ClassCastException.class, ()-> set.add(1, 1));
//    }
//
//    @Test
//    public void arrayListAddMethodOfIndexAndItem_CanIncreaseSizeWhenFullTest(){
//        set.add(0, "shoes");
//        set.add(1, "vibrator");
//        set.add(2, "bra");
//        set.add(3, "panties");
//        set.add(4, "chocolate");
//        set.add(5, "pokeman");
//        assertEquals("chocolate", set.get(4));
//        assertEquals("pokeman", set.get(5));
//    }
//
//    @Test
//    public void arrayListCanRemoveByIndexTest(){
//        set.add(0, "shoes");;
//        set.remove(0);
//        assertEquals(null, set.get(0));
//    }
//
//    @Test
//    public void arrayListSizeReducesArraySizeTest(){
//        set.add(0, "shoes");
//        set.add(1, "vibrator");
//        set.add(2, "bra");
//        set.add(3, "panties");
//        set.add(4, "chocolate");
//        set.add(5, "pokeman");
//        set.remove(0);
//        assertEquals("vibrator", set.get(0));
//        assertEquals("bra", set.get(1));
//        assertEquals("panties", set.get(2));
//        assertEquals("chocolate", set.get(3));
//        assertEquals("pokeman", set.get(4));
//    }




}
