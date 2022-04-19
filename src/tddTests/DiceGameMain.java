package tddTests;

import java.security.SecureRandom;

public class DiceGameMain {
    public static void main(String[] args) {

        SecureRandom randomizer = new SecureRandom();
        int dice1 = randomizer.nextInt(1,6);
        int dice2 = randomizer.nextInt(1,6);
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
                dice1 = randomizer.nextInt(1,6);
                dice2 = randomizer.nextInt(1,6);
                System.out.println("Dice one: " + dice1 + "     " + "Dice two: " + dice2);
                sumOfDice = dice1 + dice2;
                System.out.println("Your Sum is: " + sumOfDice);
            } while (sumOfDice != userPoint && sumOfDice != 7);
            if (sumOfDice == userPoint) {
                System.out.println("You Win!");

            } else {
                System.out.println("You Lose!");
            }
        }
    }
}
