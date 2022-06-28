package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HashMapTest {

    private HashMap hashMap;

    @BeforeEach
    public void setUp(){
        hashMap = new HashMap();
    }
    @Test
    public void hashMapExistTest(){
        assertNotNull(hashMap);
    }

    @Test
    public void hashMapCanTakeKeyTest(){
        hashMap.addKey("Tade");
        assertEquals("Tade", hashMap.getKeyAtIndex(1));
    }


}
