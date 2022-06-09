package chapterSeven;

public class Pen {

    private boolean isDown;

    public boolean isPenDown() {
        return isDown;
    }

    public void penDown() {
        isDown = true;
    }

    public void penUp() {
        isDown = false;
    }
}
