package abstractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    private ArrayList list;
    @BeforeEach
    public void setUp() {
         list = new ArrayList();
    }

    @Test
    void addTest() {
        list.add("Rolex Watch");
        assertEquals(1, list.size());
    }

    @Test
    public void getTest(){
        list.add("Ballerina dress");
        assertEquals("Ballerina dress", list.get(0));
    }

    @Test
    public void addByIndexTest(){
        list.add("Addibas shoe");
        assertEquals("Addibas shoe", list.get(0));
    }

    @Test
    public void newArrayIsCreated_WhenArrayIsFullTest(){
        list.add("Addibas shoe");
        list.add("Rolex watch");
        list.add("Ballerina dress");
        list.add("Rayban glasses");
        list.add("Nike footwear");
        list.add("Ballerina shoe");
        list.add("Ballerina hat");
        list.add("Ballerina clothes");
        assertEquals("Addibas shoe", list.get(0));
        assertEquals("Rolex watch", list.get(1));
        assertEquals("Ballerina dress", list.get(2));
        assertEquals("Rayban glasses", list.get(3));
        assertEquals("Nike footwear", list.get(4));
        assertEquals("Ballerina shoe", list.get(5));
        assertEquals("Ballerina hat", list.get(6));
        assertEquals("Ballerina clothes", list.get(7));
    }

    @Test
    public void addByIndexAndItemTest(){
        list.add(0,"Rolex watch");
        assertEquals(1, list.size());
        assertEquals("Rolex watch", list.get(0));
    }

    @Test
    public void addByIndexAndItem_WhenIndexIsNoFulltTest(){
        list.add(0, "Addibas shoe");
        list.add(1, "Rolex watch");
        list.add(2, "Ballerina dress");
        list.add(1, "Lookpeng fashion");
        assertEquals("Addibas shoe", list.get(0));
        assertEquals("Lookpeng fashion", list.get(1));
        assertEquals("Rolex watch", list.get(2));
        assertEquals("Ballerina dress", list.get(3));
    }

    @Test
    public void addByIndexAndItem_WhenArrayIsFullTest(){
        list.add(0, "Addibas shoe");
        list.add(1, "Rolex watch");
        list.add(2, "Ballerina dress");
        list.add(3, "Rayban glasses");
        list.add(4, "Nike footwear");
        list.add(5, "Ballerina shoe");
        list.add(6, "Ballerina hat");
        list.add(3, "Lookpeng fashion");
        assertEquals("Addibas shoe", list.get(0));
        assertEquals("Rolex watch", list.get(1));
        assertEquals("Ballerina dress", list.get(2));
        assertEquals("Lookpeng fashion", list.get(3));
        assertEquals("Nike footwear", list.get(5));
        assertEquals("Ballerina shoe", list.get(6));
        assertEquals("Ballerina hat", list.get(7));
    }

    @Test
    public void removeTest(){
        list.add("Rolex Watch");
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void removeAndGet(){
        list.add("Rayban Glasses");
        list.remove(0);
        assertNull(list.get(0));
    }

    @Test
    public void removeAndGetForMoreThanOneIndexTest(){
        list.add(0, "Addibas shoe");
        list.add(1, "Rolex watch");
        list.add(2, "Ballerina dress");
        list.add(3, "Rayban glasses");
        list.add(4, "Nike footwear");
        list.add(5, "Ballerina shoe");
        list.add(6, "Ballerina hat");
        list.add(3, "Lookpeng fashion");
        list.remove(2);
        assertEquals("Addibas shoe", list.get(0));
        assertEquals("Rolex watch", list.get(1));
        assertEquals("Lookpeng fashion", list.get(2));
        assertEquals("Rayban glasses", list.get(3));
        assertEquals("Nike footwear", list.get(4));
        assertEquals("Ballerina shoe", list.get(5));
        assertEquals("Ballerina hat", list.get(6));
    }




}