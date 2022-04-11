package tddTests;

import java.security.SecureRandom;

public class DiceGameMain {
    public static void main(String[] args) {

        /*SecureRandom randomizer = new SecureRandom();
        int dice1 = randomDiceNumberGenerator();
        int dice2 = randomDiceNumberGenerator();
        System.out.println("Dice one: " + dice1 + "     " + "Dice two: " + dice2);

        int sumOfDice = dice1 + dice2;
        System.out.println("Your Sum is: " + sumOfDice);

        int userPoint;
        if (sumOfDice == 7 || sumOfDice == 11) {
            System.out.println("You Win!!");
        } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12){
            System.out.println("You Lose!!");
        } else {
            userPoint = sumOfDice;
            do {
                dice1 = randomDiceNumberGenerator();
                dice2 = randomDiceNumberGenerator();
                System.out.println("Dice one: " + dice1 + "     " + "Dice two: " + dice2);
                sumOfDice = dice1 + dice2;
                System.out.println("Your Sum is: " + sumOfDice);
            } while (sumOfDice != userPoint && sumOfDice != 7);
            if (sumOfDice == userPoint) {
                System.out.println("You Win!");

            } else if (sumOfDice == 7) {
                System.out.println("You Lose!");
            }
        }
    }

    public void gameConsoleRunner(int dice1, int dice2) {
        int sumOfDice = dice1 + dice2;
        this.sumOfDices = sumOfDice;
        if (sumOfDice == 7 || sumOfDice == 11) {
            status = "You Win!!";
        } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
            status = "You Lose!!";
        } else if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
            int userPoint = sumOfDice;
            do {
                sumOfDice = dice1 + dice2;
            } while (sumOfDice != userPoint || sumOfDice != 7);
            if (sumOfDice == userPoint) {
                status = "You Win!";
            } else if (sumOfDice == 7) {
                status = "You Lose!";
            }
        }*/
    }
}
