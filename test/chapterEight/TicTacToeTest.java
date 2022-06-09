package chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chapterEight.Value.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;
    @BeforeEach
    public void setUp(){
        ticTacToe = new TicTacToe();
    }

    @Test
    public void ticTacToeisExistTEst(){
    assertNotNull(ticTacToe);
    }

    @Test
    public void threeByThreeArrayExistTest(){
        assertEquals(3, ticTacToe.getRowLength());
        assertEquals(3, ticTacToe.getColumnLength());
    }

    @Test
    public void arrayCanTakeElements(){
        ticTacToe.add(0, 0, EMPTY);
        assertEquals(EMPTY, ticTacToe.getIndexElementAt(0,0));
    }

    @Test
    public void arrayCanElementsByIndexTest(){
        ticTacToe.add(0, 0, EMPTY);
        assertEquals(EMPTY, ticTacToe.getIndexElementAt(0,0));
    }

    @Test
    public void TicTacToeHasEnumsTest(){
        Value x = ticTacToe.getValueX();
        Value y =ticTacToe.getValueO();
        Value empty = ticTacToe.getValueEmpty();
        assertEquals(Value.X, x);
        assertEquals(Value.O, y);
        assertEquals(EMPTY, empty);
    }

    @Test
    public void tictactoeArrayIsInitialisedWithEmptyOnInstantiation(){
        Value arrayContentOnConstruction = ticTacToe.getValueAt(0);
        assertEquals(EMPTY, arrayContentOnConstruction);
    }

    @Test
    public void tictactoeHasPlayersTest(){
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        assertEquals(Player1.class, player1.getClass());
        assertEquals(Player2.class, player2.getClass());
    }



    @Test
    public void player1CanPlayGameTest(){
        Player1 player1 = new Player1();
        Value[][] board = ticTacToe.getBoard();
        player1.play(1, board);
        assertEquals(X, ticTacToe.getElementAtIndex(1));
    }

    @Test
    public void player1CanPlayOnAllAndAnySquares(){
        Player1 player1 = new Player1();
        int loop1 = 1;
        while (loop1 <= 9){
            player1.play(loop1, ticTacToe.getBoard());
            loop1++;
        }
        assertEquals(X, ticTacToe.getElementAtIndex(1));
        assertEquals(X, ticTacToe.getElementAtIndex(2));
        assertEquals(X, ticTacToe.getElementAtIndex(3));
        assertEquals(X, ticTacToe.getElementAtIndex(4));
        assertEquals(X, ticTacToe.getElementAtIndex(5));
        assertEquals(X, ticTacToe.getElementAtIndex(6));
        assertEquals(X, ticTacToe.getElementAtIndex(7));
        assertEquals(X, ticTacToe.getElementAtIndex(8));
        assertEquals(X, ticTacToe.getElementAtIndex(9));
    }

    @Test
    public void player2CanPlayGameTest(){
        Player2 player2 = new Player2();
        player2.play(1, ticTacToe.getBoard());
        assertEquals(O, ticTacToe.getElementAtIndex(1) );
    }

    @Test
    public void player2CanPlayOnAllAndAnySquares(){
        Player2 player2 = new Player2();
        int loop1 = 1;
        while (loop1 <= 9){
            player2.play(loop1, ticTacToe.getBoard());
            loop1++;
        }
        assertEquals(O, ticTacToe.getElementAtIndex(1) );
        assertEquals(O, ticTacToe.getElementAtIndex(2) );
        assertEquals(O, ticTacToe.getElementAtIndex(3) );
        assertEquals(O, ticTacToe.getElementAtIndex(4) );
        assertEquals(O, ticTacToe.getElementAtIndex(5) );
        assertEquals(O, ticTacToe.getElementAtIndex(6) );
        assertEquals(O, ticTacToe.getElementAtIndex(7) );
        assertEquals(O, ticTacToe.getElementAtIndex(8) );
        assertEquals(O, ticTacToe.getElementAtIndex(9) );
    }

    @Test
    public void playersCanOnlyPlayOnEmptySquareTest(){
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        player1.play(1, ticTacToe.getBoard());
        player2.play(2, ticTacToe.getBoard());
        player1.play(2, ticTacToe.getBoard());
        player2.play(1, ticTacToe.getBoard());
        assertEquals(O, ticTacToe.getElementAtIndex(2));
        assertEquals(X, ticTacToe.getElementAtIndex(1));
//        assertThrows(NotEmptyException.class, ()->ticTacToe.player2Play(1));
//        assertThrows(NotEmptyException.class, ()->ticTacToe.player1Play(2));
    }

    @Test
    public void player1WinsOnPosition1_4_7Test() {
        Player1 player1 = new Player1();
        player1.play(1, ticTacToe.getBoard());
        player1.play(4, ticTacToe.getBoard());
        player1.play(7, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition1_2_3Test() {
        Player1 player1 = new Player1();
        player1.play(1, ticTacToe.getBoard());
        player1.play(2, ticTacToe.getBoard());
        player1.play(3, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition3_6_9Test() {
        Player1 player1 = new Player1();
        player1.play(3, ticTacToe.getBoard());
        player1.play(6, ticTacToe.getBoard());
        player1.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition3_5_7Test() {
        Player1 player1 = new Player1();
        player1.play(3, ticTacToe.getBoard());
        player1.play(5, ticTacToe.getBoard());
        player1.play(7, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition7_8_9Test() {
        Player1 player1 = new Player1();
        player1.play(7, ticTacToe.getBoard());
        player1.play(8, ticTacToe.getBoard());
        player1.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition1_5_9Test() {
        Player1 player1 = new Player1();
        player1.play(1, ticTacToe.getBoard());
        player1.play(5, ticTacToe.getBoard());
        player1.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition4_5_6Test() {
        Player1 player1 = new Player1();
        player1.play(4, ticTacToe.getBoard());
        player1.play(5, ticTacToe.getBoard());
        player1.play(6, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }

    @Test
    public void player1WinsOnPosition2_5_8Test() {
        Player1 player1 = new Player1();
        player1.play(2, ticTacToe.getBoard());
        player1.play(5, ticTacToe.getBoard());
        player1.play(8, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer1Win());
    }
    @Test
    public void player2WinsOnPosition1_4_7Test() {
        Player2 player2 = new Player2();
        player2.play(1, ticTacToe.getBoard());
        player2.play(4, ticTacToe.getBoard());
        player2.play(7, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition1_2_3Test() {
        Player2 player2 = new Player2();
        player2.play(1, ticTacToe.getBoard());
        player2.play(2, ticTacToe.getBoard());
        player2.play(3, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition3_6_9Test() {
        Player2 player2 = new Player2();
        player2.play(3, ticTacToe.getBoard());
        player2.play(6, ticTacToe.getBoard());
        player2.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition3_5_7Test() {
        Player2 player2 = new Player2();
        player2.play(3, ticTacToe.getBoard());
        player2.play(5, ticTacToe.getBoard());
        player2.play(7, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition7_8_9Test() {
        Player2 player2 = new Player2();
        player2.play(7, ticTacToe.getBoard());
        player2.play(8, ticTacToe.getBoard());
        player2.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition1_5_9Test() {
        Player2 player2 = new Player2();
        player2.play(1, ticTacToe.getBoard());
        player2.play(5, ticTacToe.getBoard());
        player2.play(9, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition4_5_6Test() {
        Player2 player2 = new Player2();
        player2.play(4, ticTacToe.getBoard());
        player2.play(5, ticTacToe.getBoard());
        player2.play(6, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void player2WinsOnPosition2_5_8Test() {
        Player2 player2 = new Player2();
        player2.play(2, ticTacToe.getBoard());
        player2.play(5, ticTacToe.getBoard());
        player2.play(8, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isPlayer2Win());
    }

    @Test
    public void gameCanEndInADrawTest(){
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        player1.play(1, ticTacToe.getBoard());
        player2.play(2, ticTacToe.getBoard());
        player1.play(3, ticTacToe.getBoard());
        player2.play(6, ticTacToe.getBoard());
        player1.play(9, ticTacToe.getBoard());
        player2.play(7, ticTacToe.getBoard());
        player1.play(8, ticTacToe.getBoard());
        player2.play(4, ticTacToe.getBoard());
        player1.play(5, ticTacToe.getBoard());
        ticTacToe.gameStatus();
        assertTrue(ticTacToe.isDraw());
    }

    @Test
    public void boardCanBeDisplayed(){
        ticTacToe.displayBoard();
        ticTacToe.player1Play(1);
        ticTacToe.player2Play(2);
        ticTacToe.player1Play(3);
        ticTacToe.player2Play(6);
        ticTacToe.player1Play(9);
        ticTacToe.player2Play(7);
        ticTacToe.player1Play(8);
        ticTacToe.player2Play(4);
        ticTacToe.player1Play(5);
        ticTacToe.gameStatus();
        ticTacToe.displayBoard();
    }

    @Test
    public void gamePlayMethodWorks(){
        ticTacToe.gamePlay(1, 3);
        assertEquals(X, ticTacToe.getElementAtIndex(1));
        assertEquals(O, ticTacToe.getElementAtIndex(3));
    }



}
