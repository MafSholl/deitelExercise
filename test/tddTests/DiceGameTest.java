package tddTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceGameTest {
    public DiceGame newGame;
    @BeforeEach
    public void gamer() {newGame = new DiceGame();
    }

    @Test
    public void randomlyGeneratingDiceNumberMethodWorksTest(){
        newGame.randomDiceNumberGenerator();
        assertEquals(DiceGame.diceNom, newGame.getRandomDiceNumber());
    }

    @Test
    public void testThatDiceOneGenerateNumber(){
        assertFalse(newGame.isDiceOne());
        newGame.setDiceOneValue(4);
        assertTrue(newGame.isDiceOne());
        assertEquals(4, newGame.getDiceOneValue());
    }

    @Test
    public void testThatDiceTwoGenerateNumber(){
        assertFalse(newGame.isDiceTwo());
        newGame.setDiceTwoValue(6);
        assertTrue(newGame.isDiceTwo());
        assertEquals(6, newGame.getDiceTwoValue());
    }


    @Test
    public void addingDiceNumbersTogetherWorksTest(){
        newGame.setDiceOneValue(4);
        newGame.setDiceTwoValue(7);
        newGame.addingTwoDicesNumberTogether();
        assertEquals(11, newGame.getSumOfDices());
    }

    @Test
    public void firstThrowTest(){
        newGame.gameStarter();
        assertEquals(true, newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(7);
        newGame.firstThrow();
        assertEquals(9, newGame.getSumOfDices());
    }

    @Test
    public void onFirstThrowSumOfSevenIsAWin(){
        newGame.setDiceOneValue(5);
        newGame.setDiceTwoValue(11);
        newGame.firstThrow();
        newGame.sevenIsaWinOnFirstThrow();
        assertEquals("You Win", newGame.getGameStatus());
    }
//
//    @Test
//    public void methodToPlayTheGame(){
//        newGame.gamePlay();
//        assertEquals("In Game", newGame.getGamePlay());
//
//    }


}
