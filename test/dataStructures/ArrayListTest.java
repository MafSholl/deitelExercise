package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static dataStructures.Cart.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private ArrayList arrayList;
    @BeforeEach
    public void setUp(){
        arrayList = new ArrayList();
    }

    @Test
    public void arrayListExist(){
        ArrayList arrayList = new ArrayList();
        assertNotNull(arrayList);
    }

    @Test
    public void arrayListCanAddByItemTest(){
        ArrayList arrayList = new ArrayList ();
        assertTrue(arrayList.isEmpty());
        arrayList.add(SHOES);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void arrayListCanAddMoreThanOneItemTest(){
        arrayList.add(BAGS);
        arrayList.add(SHOES);
        assertEquals(2, arrayList.size());
    }

    @Test
    public void arrayListItemsCanBeQueriedByIndexTest(){
        arrayList.add(BAGS);
        assertEquals(BAGS, arrayList.get(0));
    }

    @Test
    public void arrayListIsCanOnlyTakeSameReferenceTypeTest(){
        arrayList.add("shoes");
        assertThrows(ClassCastException.class, ()-> arrayList.add(1));
    }

    @Test
    public void arrayListCanIncreaseSizeWhenFull_AndAddTest(){
        arrayList.add("shoes");
        arrayList.add("vibrator");
        arrayList.add("bra");
        arrayList.add("panties");
        arrayList.add("chocolate");
        arrayList.add("pokeman");
        assertEquals("chocolate", arrayList.get(4));
        assertEquals("pokeman", arrayList.get(5));
    }

    @Test
    public void arrayListCanAddByIndexAndItemTest(){
        arrayList.add(0, "rolex");
        assertEquals("rolex", arrayList.get(0));
    }

    @Test
    public void arrayListCanAddMoreThanOneItemByIndexAndItemTest(){
        arrayList.add(0, "rolex");
        arrayList.add(1, "belt");
        assertEquals("rolex", arrayList.get(0));
        assertEquals("belt", arrayList.get(1));
    }


    @Test
    public void arrayListAddMethodOfIndexAndItemOnlySameReference(){
        arrayList.add(0, "rolex");
        assertThrows(ClassCastException.class, ()-> arrayList.add(1, 1));
    }

    @Test
    public void arrayListAddMethodOfIndexAndItem_CanIncreaseSizeWhenFullTest(){
        arrayList.add(0, "shoes");
        arrayList.add(1, "vibrator");
        arrayList.add(2, "bra");
        arrayList.add(3, "panties");
        arrayList.add(4, "chocolate");
        arrayList.add(5, "pokeman");
        assertEquals("chocolate", arrayList.get(4));
        assertEquals("pokeman", arrayList.get(5));
    }

    @Test
    public void arrayListCanRemoveByIndexTest(){
        arrayList.add(0, "shoes");;
        arrayList.remove(0);
        assertEquals(null, arrayList.get(0));
    }

    @Test
    public void arrayListSizeReducesArraySizeTest(){
        arrayList.add(0, "shoes");
        arrayList.add(1, "vibrator");
        arrayList.add(2, "bra");
        arrayList.add(3, "panties");
        arrayList.add(4, "chocolate");
        arrayList.add(5, "pokeman");
        arrayList.remove(0);
        assertEquals("vibrator", arrayList.get(0));
        assertEquals("bra", arrayList.get(1));
        assertEquals("panties", arrayList.get(2));
        assertEquals("chocolate", arrayList.get(3));
        assertEquals("pokeman", arrayList.get(4));
    }

    @Test
    public void getByElementMethodTest(){
        arrayList.add(0, "shoes");
        arrayList.add(1, "vibrator");
        arrayList.add(2, "bra");
        arrayList.add(3, "panties");
        arrayList.add(4, "chocolate");
        arrayList.add(5, "pokeman");
        assertEquals("panties", arrayList.get("panties"));
        assertNull(arrayList.get("bata"));
    }



}
