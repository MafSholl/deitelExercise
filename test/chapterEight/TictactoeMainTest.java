package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TictactoeMainTest {

    private TictactoeMain tictactoeMain;

    @BeforeEach
    public void setUP(){
        tictactoeMain = new TictactoeMain();
    }

    @Test
    public void gamePlayTest(){
        tictactoeMain.gameRunnerConsole();
    }
}
