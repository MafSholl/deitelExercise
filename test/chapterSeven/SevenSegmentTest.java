package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentTest {
    public SevenSegment sevenSeggy;
    @BeforeEach
    public void anything(){
        sevenSeggy = new SevenSegment();
    }

    @Test
    public void sevenSegmentExist(){
        assertNotNull(sevenSeggy);
    }

    @Test
    public void numbersCanBeGeneratedTest(){
        sevenSeggy.setDisplayNumber(0);
        assertEquals(0, sevenSeggy.getNumber());
    }

    @Test
    public void eightNumbersCanBeGeneratedAtOnceTest(){
        sevenSeggy.setDisplayNumber(10000001);
        assertEquals(10000001, sevenSeggy.getNumber());
    }

    @Test
    public void NumbersGeneratedControlsDisplay(){
        sevenSeggy.setDisplayNumber(10010111);
        sevenSeggy.setDisplayNumberToString();
       assertEquals('1', sevenSeggy.getDisplayNumberToString(7));
        sevenSeggy.setDisplay();
        assertTrue(sevenSeggy.getScreenDisplay());
    }

    @Test
    public void eighthNumberTurnsOnsDisplay(){
        sevenSeggy.setDisplayNumber(10010111);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.setDisplay();
        assertTrue(sevenSeggy.getScreenDisplay());
    }

    @Test
    public void eighthNumberTurnsOffDisplay(){
        sevenSeggy.setDisplayNumber(10010111);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.setDisplay();
        assertTrue(sevenSeggy.getScreenDisplay());
        sevenSeggy.setDisplayNumber(10010110);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.setDisplay();
        assertFalse(sevenSeggy.getScreenDisplay());
    }

    @Test
    public void anArrayExist(){
        sevenSeggy.arrayChecker();
        assertTrue(sevenSeggy.isArray());
    }

    @Test
    public void arrayRowisFiveTest(){
        sevenSeggy.arrayChecker();
        assertTrue(sevenSeggy.isArray());
        assertEquals(5, sevenSeggy.getArrayLength());
    }

//    @Test
//    public void arrayColumnIsFourTest(){
//        sevenSeggy.arrayChecker();
//        assertTrue(sevenSeggy.isArray());
//        assertEquals(4, sevenSeggy.getArrayLength());
//    }
    @Test
    public void arrayCanBeLoadedMultipleTimeTest(){
        sevenSeggy.arrayLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(2, sevenSeggy.getArrayContent(0, 1));
        assertEquals(3, sevenSeggy.getArrayContent(0, 2));
        assertEquals(4, sevenSeggy.getArrayContent(0, 3));
        assertEquals(5, sevenSeggy.getArrayContent(1, 0));
        assertEquals(6, sevenSeggy.getArrayContent(1, 1));
        assertEquals(7, sevenSeggy.getArrayContent(1, 2));
        assertEquals(8, sevenSeggy.getArrayContent(1, 3));
        assertEquals(9, sevenSeggy.getArrayContent(2, 0));
    }

    @Test
    public void arrayIsEmptyTest(){
        assertFalse(sevenSeggy.isEmpty());
    }

    @Test
    public void arrayCanBeLoadedTest(){
        sevenSeggy.arrayLoader();
        assertFalse(sevenSeggy.isEmpty());
    }

    @Test
    public void arrayLoadingUsingLoopTest(){
        sevenSeggy.arrayLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(2, sevenSeggy.getArrayContent(0, 1));
        assertEquals(3, sevenSeggy.getArrayContent(0, 2));
        assertEquals(4, sevenSeggy.getArrayContent(0, 3));
        assertEquals(5, sevenSeggy.getArrayContent(1, 0));
        assertEquals(6, sevenSeggy.getArrayContent(1, 1));
        assertEquals(7, sevenSeggy.getArrayContent(1, 2));
        assertEquals(8, sevenSeggy.getArrayContent(1, 3));
        assertEquals(9, sevenSeggy.getArrayContent(2, 0));
    }

    @Test
    public void segmentAcanBeLoaded(){
        sevenSeggy.setDisplayNumber(10000001);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.segmentALoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(1, sevenSeggy.getArrayContent(0, 1));
        assertEquals(1, sevenSeggy.getArrayContent(0, 2));
        assertEquals(1, sevenSeggy.getArrayContent(0, 3));
    }

    @Test
    public void segmentACanBeLoaded_OnlyIfFirstInputCharacteris1(){
        sevenSeggy.setDisplayNumber(00000001);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.segmentALoader();
        assertEquals(0, sevenSeggy.getArrayContent(0,0));
        assertEquals(0, sevenSeggy.getArrayContent(0, 1));
        assertEquals(0, sevenSeggy.getArrayContent(0, 2));
        assertEquals(0, sevenSeggy.getArrayContent(0, 3));
    }

    @Test
    public void segmentBCanBeLoaded(){
        sevenSeggy.setDisplayNumber(01000001);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.segmentBLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0,3));
        assertEquals(1, sevenSeggy.getArrayContent(1, 3));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void segmentBCanBeLoaded_OnlyIfSecondInputCharacteris1(){
        sevenSeggy.setDisplayNumber(01000001);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.segmentBLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0,3));
        assertEquals(1, sevenSeggy.getArrayContent(1, 3));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void segmentCCanBeLoaded_OnlyIfThirdInputCharacteris1(){
        sevenSeggy.setDisplayNumber(00100001);
        sevenSeggy.setDisplayNumberToString();
        sevenSeggy.segmentCLoader();
        assertEquals(0, sevenSeggy.getArrayContent(0,0));
        assertEquals(0, sevenSeggy.getArrayContent(0, 1));
        assertEquals(0, sevenSeggy.getArrayContent(0, 2));
        assertEquals(0, sevenSeggy.getArrayContent(0, 3));
    }


}
