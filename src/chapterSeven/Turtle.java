package chapterSeven;

import static chapterSeven.Direction.*;

public class Turtle {

    private Pen pen = new Pen();
    private Direction direction = EAST;
    private Position position = new Position(0,0);


    public boolean isPen() {
        return true;
    }

    public boolean isPenDown() {
        return pen.isPenDown();
    }

    public void penUp() {
        pen.penUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == NORTH) makeDirection(EAST);
        else if(direction == WEST) makeDirection(NORTH);
        else if(direction == SOUTH) makeDirection(WEST);
        else if(direction == EAST) makeDirection(SOUTH);
    }

    private void makeDirection(Direction newDirection) {
        direction = newDirection;
    }

    public void moveForward(int steps) {
        position.move(steps);
    }

    public Position getFloorPosition() {
        return position;
    }

    public void turnLeft() {
        if(direction == SOUTH) makeDirection(EAST);
        else if(direction == WEST) makeDirection(SOUTH);
        else if(direction == NORTH) makeDirection(WEST);
        else if(direction == EAST) makeDirection(NORTH);

    }

    public void move(int steps) {
        position.move(steps);
    }
}