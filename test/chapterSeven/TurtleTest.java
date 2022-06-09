package chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapterSeven.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle ijapa;

    @BeforeEach
    public void anything(){
        ijapa =  new Turtle();
    }

    @Test public void turtleExistTest(){
        assertNotNull(ijapa);
    }

    @Test public void turtleHasAPenTesst(){
        boolean isPen = ijapa.isPen();
        assertTrue(isPen);
    }

    @Test public void penIsUpByDefaultTest(){
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
    }

    @Test public void penCanBeMovedDownTest(){
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
    }

    @Test public void penCanBeMovedUpTest(){
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());
    }

    @Test public void penHasADirectionEastByDefaultTest(){
        assertEquals(EAST, ijapa.getDirection());
    }

    @Test public void penCanTurnRightWhileFacingEastTest(){
        assertEquals(EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getDirection());
    }

    @Test public void penCanTurnRightWhileFacingSouthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getDirection());
    }

    @Test public void penCanTurnRightWhileFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getDirection());
    }

    @Test public void penCanTurnRightWhileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getDirection());
    }

    @Test public void penCanTurnLeftWhileFacingEast(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getDirection());

    }

    @Test public void penCanTurnLeftWhileFacingNorthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getDirection());
    }

    @Test public void penCanTurnLeftWhileFacingWestTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getDirection());
    }

    @Test public void penCanTurnLeftWhileFacingSouthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getDirection());
    }

    @Test public void penCanMoveWhileFacingEastTest(){
        ijapa.moveForward(5);
        assertEquals(new Position(0, 4), ijapa.getFloorPosition());
    }
//
//    @Test public void penCanMoveWhileFacingSouthTest(){
//        ijapa.turnRight();
//        ijapa.moveForward(5);
//        assertEquals(new Position(4, 0), ijapa.getFloorPosition());
//    }





}
