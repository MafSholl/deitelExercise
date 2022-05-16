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
        sevenSeggy.setDisplayNumber("0");
        assertEquals("0", sevenSeggy.getNumber());
    }

    @Test
    public void eightNumbersCanBeGeneratedAtOnceTest(){
        sevenSeggy.setDisplayNumber("10000001");
        assertEquals("10000001", sevenSeggy.getNumber());
    }

    @Test
    public void NumbersGeneratedControlsDisplay(){
        sevenSeggy.setDisplayNumber("10010111");
        assertEquals('1', sevenSeggy.getNumberAtAPosition(7));
        sevenSeggy.isScreen();
        assertTrue(sevenSeggy.getScreenDisplay());
    }

    @Test
    public void eighthNumberTurnsOnsDisplay(){
        sevenSeggy.setDisplayNumber("10010111");
        sevenSeggy.isScreen();
        assertTrue(sevenSeggy.getScreenDisplay());
    }

    @Test
    public void eighthNumberTurnsOffDisplay(){
        sevenSeggy.setDisplayNumber("10010111");
        sevenSeggy.isScreen();
        assertTrue(sevenSeggy.getScreenDisplay());
        sevenSeggy.setDisplayNumber("10010110");
        sevenSeggy.isScreen();
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
    public void arrayCanBeLoadedMultipleTimeTest() {
        sevenSeggy.arrayLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(1, sevenSeggy.getArrayContent(0, 1));
        assertEquals(1, sevenSeggy.getArrayContent(0, 2));
        assertEquals(1, sevenSeggy.getArrayContent(0, 3));
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
        assertEquals(1, sevenSeggy.getArrayContent(0, 1));
        assertEquals(1, sevenSeggy.getArrayContent(0, 2));
        assertEquals(1, sevenSeggy.getArrayContent(0, 3));
    }

    @Test
    public void segmentAcanBeLoaded(){
        sevenSeggy.setDisplayNumber("10000001");
        sevenSeggy.segmentALoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(1, sevenSeggy.getArrayContent(0, 1));
        assertEquals(1, sevenSeggy.getArrayContent(0, 2));
        assertEquals(1, sevenSeggy.getArrayContent(0, 3));
    }

    @Test
    public void segmentACanBeLoaded_OnlyIfFirstInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentALoader();
        assertEquals(0, sevenSeggy.getArrayContent(0,0));
        assertEquals(0, sevenSeggy.getArrayContent(0, 1));
        assertEquals(0, sevenSeggy.getArrayContent(0, 2));
        assertEquals(0, sevenSeggy.getArrayContent(0, 3));
    }

    @Test
    public void segmentBCanBeLoaded(){
        sevenSeggy.setDisplayNumber("01000001");
        sevenSeggy.segmentBLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0,3));
        assertEquals(1, sevenSeggy.getArrayContent(1, 3));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void segmentBCanBeLoaded_OnlyIfSecondInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentBLoader();
        assertEquals(0, sevenSeggy.getArrayContent(0,3));
        assertEquals(0, sevenSeggy.getArrayContent(1, 3));
        assertEquals(0, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void segmentCCanBeLoaded(){
        sevenSeggy.setDisplayNumber("00100001");
        sevenSeggy.segmentCLoader();
        assertEquals(1, sevenSeggy.getArrayContent(2,3));
        assertEquals(1, sevenSeggy.getArrayContent(3, 3));
        assertEquals(1, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void segmentCCanBeLoaded_OnlyIfThirdInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentCLoader();
        assertEquals(0, sevenSeggy.getArrayContent(2,3));
        assertEquals(0, sevenSeggy.getArrayContent(3, 3));
        assertEquals(0, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void segmentDCanBeLoaded(){
        sevenSeggy.setDisplayNumber("00010001");
        sevenSeggy.segmentDLoader();
        assertEquals(1, sevenSeggy.getArrayContent(4,0));
        assertEquals(1, sevenSeggy.getArrayContent(4, 1));
        assertEquals(1, sevenSeggy.getArrayContent(4, 2));
        assertEquals(1, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void segmentDCanBeLoaded_OnlyIfFourthInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentDLoader();
        assertEquals(0, sevenSeggy.getArrayContent(4,0));
        assertEquals(0, sevenSeggy.getArrayContent(4, 1));
        assertEquals(0, sevenSeggy.getArrayContent(4, 2));
        assertEquals(0, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void segmentECanBeLoaded(){
        sevenSeggy.setDisplayNumber("00001001");
        sevenSeggy.segmentELoader();
        assertEquals(1, sevenSeggy.getArrayContent(2,0));
        assertEquals(1, sevenSeggy.getArrayContent(3, 0));
        assertEquals(1, sevenSeggy.getArrayContent(4, 0));
    }

    @Test
    public void segmentECanBeLoaded_OnlyIfFirthInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentELoader();
        assertEquals(0, sevenSeggy.getArrayContent(2,0));
        assertEquals(0, sevenSeggy.getArrayContent(3, 0));
        assertEquals(0, sevenSeggy.getArrayContent(4, 0));
    }

    @Test
    public void segmentFCanBeLoaded(){
        sevenSeggy.setDisplayNumber("00000101");
        sevenSeggy.segmentFLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0,0));
        assertEquals(1, sevenSeggy.getArrayContent(1, 0));
        assertEquals(1, sevenSeggy.getArrayContent(2, 0));
    }

    @Test
    public void segmentFCanBeLoaded_OnlyIfFirthInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentFLoader();
        assertEquals(0, sevenSeggy.getArrayContent(0,0));
        assertEquals(0, sevenSeggy.getArrayContent(1, 0));
        assertEquals(0, sevenSeggy.getArrayContent(2, 0));
    }

    @Test
    public void segmentGCanBeLoaded(){
        sevenSeggy.setDisplayNumber("00000011");
        sevenSeggy.segmentGLoader();
        assertEquals(1, sevenSeggy.getArrayContent(2,0));
        assertEquals(1, sevenSeggy.getArrayContent(2, 1));
        assertEquals(1, sevenSeggy.getArrayContent(2, 2));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void segmentGCanBeLoaded_OnlyIfFirthInputCharacteris1(){
        sevenSeggy.setDisplayNumber("00000001");
        sevenSeggy.segmentGLoader();
        assertEquals(0, sevenSeggy.getArrayContent(2,0));
        assertEquals(0, sevenSeggy.getArrayContent(2, 1));
        assertEquals(0, sevenSeggy.getArrayContent(2, 2));
        assertEquals(0, sevenSeggy.getArrayContent(2, 3));
    }

    @Test
    public void LoadingTheWholeArrayAtOnceWorks(){
        sevenSeggy.setDisplayNumber("11111111");
        sevenSeggy.arrayLoader();
        assertEquals(1, sevenSeggy.getArrayContent(0, 0));
        assertEquals(1, sevenSeggy.getArrayContent(0, 1));
        assertEquals(1, sevenSeggy.getArrayContent(0, 2));
        assertEquals(1, sevenSeggy.getArrayContent(0, 3));
        assertEquals(1, sevenSeggy.getArrayContent(1, 0));
        assertEquals(1, sevenSeggy.getArrayContent(2, 0));
        assertEquals(1, sevenSeggy.getArrayContent(3, 0));
        assertEquals(1, sevenSeggy.getArrayContent(4, 0));
        assertEquals(1, sevenSeggy.getArrayContent(1, 3));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
        assertEquals(1, sevenSeggy.getArrayContent(3, 3));
        assertEquals(1, sevenSeggy.getArrayContent(4, 3));
        assertEquals(1, sevenSeggy.getArrayContent(2, 1));
        assertEquals(1, sevenSeggy.getArrayContent(2, 2));
        assertEquals(1, sevenSeggy.getArrayContent(2, 3));
        assertEquals(1, sevenSeggy.getArrayContent(4, 1));
        assertEquals(1, sevenSeggy.getArrayContent(4, 2));
        assertEquals(1, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void ArrayCanOnlyBeDisplayed_OnlyIfTheEigthCharacterIs1(){
        sevenSeggy.setDisplayNumber("11111110");
        sevenSeggy.arrayLoader();
        assertEquals(0, sevenSeggy.getArrayContent(0, 0));
        assertEquals(0, sevenSeggy.getArrayContent(0, 1));
        assertEquals(0, sevenSeggy.getArrayContent(0, 2));
        assertEquals(0, sevenSeggy.getArrayContent(0, 3));
        assertEquals(0, sevenSeggy.getArrayContent(1, 0));
        assertEquals(0, sevenSeggy.getArrayContent(2, 0));
        assertEquals(0, sevenSeggy.getArrayContent(3, 0));
        assertEquals(0, sevenSeggy.getArrayContent(4, 0));
        assertEquals(0, sevenSeggy.getArrayContent(1, 3));
        assertEquals(0, sevenSeggy.getArrayContent(2, 3));
        assertEquals(0, sevenSeggy.getArrayContent(3, 3));
        assertEquals(0, sevenSeggy.getArrayContent(4, 3));
        assertEquals(0, sevenSeggy.getArrayContent(2, 1));
        assertEquals(0, sevenSeggy.getArrayContent(2, 2));
        assertEquals(0, sevenSeggy.getArrayContent(2, 3));
        assertEquals(0, sevenSeggy.getArrayContent(4, 1));
        assertEquals(0, sevenSeggy.getArrayContent(4, 2));
        assertEquals(0, sevenSeggy.getArrayContent(4, 3));
    }

    @Test
    public void arrayDisplayMethodWorks(){
        sevenSeggy.setDisplayNumber("111111111");
        sevenSeggy.arrayLoader();
        sevenSeggy.arrayDisplay();
    }
    @Test
    public void fiveMethod(){
        sevenSeggy.setDisplayNumber("10110111");
        sevenSeggy.arrayLoader();
        sevenSeggy.arrayDisplay();
    }

    @Test
    public void fourMethod(){
        sevenSeggy.setDisplayNumber("01100111");
        sevenSeggy.arrayLoader();
        sevenSeggy.arrayDisplay();
    }

}
