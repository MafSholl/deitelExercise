package tddTests;

import java.security.SecureRandom;

public class DiceGame {

    private String status;
    public  int sumOfDices;
    private  int userPoint;
    private int diceNumber;
    public static int diceNom;
    private int dice1;
    private int dice2;
    private boolean isDiceOne;
    private boolean isDiceTwo;
    private boolean isFirstThrow;
    private  boolean isGame;
    private  int throwCount;
    private boolean startGame;


    public int randomDiceNumberGenerator() {
        SecureRandom randomizer = new SecureRandom();
        int diceNumber = 1 + randomizer.nextInt(5);
        this.diceNumber = diceNumber;
        diceNom = diceNumber;
        return diceNumber;
    }

    public int getRandomDiceNumber(){
        return diceNumber;
    }

    public void setDiceOneValue(int dice1){
//        dice1 = randomDiceNumberGenerator();
        this.dice1 = dice1;
    }

    public int getDiceOneValue(){
        return dice1;
    }

    public void setDiceTwoValue(int dice2){
//       int dice2 = randomDiceNumberGenerator();
        this.dice2 = dice2;
    }

    public int getDiceTwoValue(){
        return dice2;
    }

    public boolean isDiceOne() {
        if (dice1 > 0) {isDiceOne = true;}
        else {isDiceOne = false;}
        return isDiceOne;
    }

    public boolean isDiceTwo() {
        if (dice2 > 0) {isDiceTwo = true;}
        else {isDiceTwo = false;}
        return isDiceTwo;
    }


    public int addingTwoDicesNumberTogether() {
        int sumOfDices = dice1 + dice2;
        this.sumOfDices = sumOfDices;

//        int sumOfDices = dice1 + dice2;
//        this.sumOfDices = sumOfDices;
        return sumOfDices;
    }

    public int getSumOfDices() {
        return sumOfDices;
    }

    public int throwCounter() {
        if (isGame){
            throwCount++;
        }return throwCount;
    }

    public void gameStarter(){
        if (!isGame){
        startGame = true;
        }
        else {
            startGame = false;
        }
    }

    public boolean isGame(){
        if (startGame){
            isGame = true;
        }
        else {
            isGame = false;
        }
        return isGame;
    }

    public String getGameStatus(){
        return status;
    }

    public void DiceThrow() {
        if(startGame){
            if(throwCount == 0) {
                setDiceOneValue(dice1);
                setDiceTwoValue(dice2);
//                System.out.println(dice1);
//                System.out.println(dice2);
//                System.out.println(sumOfDices);
                addingTwoDicesNumberTogether();
            }
        }
    }
    public void firstThrowAndSubsequesntThrowScenarios(){
        DiceThrow();
        if (sumOfDices == 7 || sumOfDices == 11){
            status = "Win";
        }else if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12){
            status = "Lose";
        }else {
            loopMethodForOtherCaseScenariosAfterFirst(dice1, dice2);
        }
    }

    public void loopMethodForOtherCaseScenariosAfterFirst(int dice1, int dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        int userPoint = sumOfDices;
//        System.out.println(sumOfDices);
        do {
            DiceThrow();
            System.out.println(sumOfDices);
        } while (sumOfDices != userPoint && sumOfDices != 7);
        if (sumOfDices == userPoint) {
            status ="Win!";
        } else {
            status = "Lose!";
        }
    }
}
