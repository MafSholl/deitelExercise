package tddTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameOfCrapTest {
    public GameOfCrap newGame;
    @BeforeEach
    public void gamer() {newGame = new GameOfCrap();
    }

    @Test
    public void randomlyGeneratingDiceNumberMethodWorksTest(){
        newGame.randomDiceNumberGenerator();
        assertEquals(GameOfCrap.diceNom, newGame.getRandomDiceNumber());
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
        newGame.setSumOfDices();
        assertEquals(11, newGame.getSumOfDices());
    }

    @Test
    public void firstThrowTest(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(7);
        newGame.DiceThrow();
        assertEquals(9, newGame.getSumOfDices());
    }

    @Test
    public void onFirstThrowSumOfSevenIsAWin(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(4);
        newGame.setDiceTwoValue(3);
        newGame.firstThrowAndSubsequesntThrowScenarios();
        assertEquals("Win", newGame.getGameStatus());
    }

    @Test
    public void onFirstThrowSumOfElevenIsAWin(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(9);
        newGame.firstThrowAndSubsequesntThrowScenarios();
        assertEquals("Win", newGame.getGameStatus());
    }
    @Test
    public void onFirstThrowSumOTwoIsALose(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(1);
        newGame.setDiceTwoValue(1);
        newGame.firstThrowAndSubsequesntThrowScenarios();
        assertEquals("Lose", newGame.getGameStatus());
    }
    @Test
    public void onFirstThrowSumOThreeIsALose(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(1);
        newGame.firstThrowAndSubsequesntThrowScenarios();
        assertEquals("Lose", newGame.getGameStatus());
    }

    @Test
    public void onFirstThrowSumOTwelveIsALose(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(6);
        newGame.setDiceTwoValue(6);
        newGame.firstThrowAndSubsequesntThrowScenarios();
        assertEquals("Lose", newGame.getGameStatus());
    }
    @Test
    public void previousUserpointInloopMethodForSubsequentThrowsWinsTest(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(2);
        newGame.DiceThrow();
        assertEquals(4, newGame.getSumOfDices());
        newGame.loopMethodForOtherCaseScenariosAfterFirst(2,2);
        assertEquals("Win!", newGame.getGameStatus());
    }
    @Test
    public void sevenAsSumOfDicesInloopMethodForSubsequentThrowsLoseTest(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(2);
        newGame.DiceThrow();
        assertEquals(4, newGame.getSumOfDices());
        newGame.loopMethodForOtherCaseScenariosAfterFirst(3,4);
        assertEquals("Lose!", newGame.getGameStatus());
    }
    @Test
    public void infiniteloopContinueIfSumIsNotUserpointForSubsequentThrowsTest(){
        newGame.gameStarter();
        assertTrue(newGame.isGame());
        newGame.setDiceOneValue(2);
        newGame.setDiceTwoValue(2);
        newGame.DiceThrow();
        assertEquals(4, newGame.getSumOfDices());
        newGame.loopMethodForOtherCaseScenariosAfterFirst(2,3);
        assertEquals("Win!", newGame.getGameStatus());
    }



}
