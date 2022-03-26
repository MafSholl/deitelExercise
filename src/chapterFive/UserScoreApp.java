package chapterFive;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class UserScoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int rightAnswerCount = 0;
        int wrongAnswerCount = 0;

        for(int loop = 1; loop <= 10; loop++) {
            int operand1 = random.nextInt(50);
            int operand2 = random.nextInt(50);
            int operator = random.nextInt(4);

            int computedAnswer = 0;

            switch (operator) {
                case 1:
                    System.out.printf("%d %s %d %s ", operand1, "+", operand2, "=");
                    int userAnswer = input.nextInt();
                    computedAnswer = operand1 + operand2;
                    if (computedAnswer == userAnswer) {
                        rightAnswerCount++;
                    } else {
                        wrongAnswerCount++;
                    }
                    break;

                case 2:
                    System.out.printf("%d %s %d %s ", operand1, "-", operand2, "=");
                    userAnswer = input.nextInt();
                    computedAnswer = operand1 - operand2;
                    if (computedAnswer == userAnswer) {
                        rightAnswerCount++;
                    } else {
                        wrongAnswerCount++;
                    }
                    break;
                case 3:
                    System.out.printf("%d %s %d %s ", operand1, "*", operand2, "=");
                    userAnswer = input.nextInt();
                    computedAnswer = operand1 * operand2;
                    if (computedAnswer == userAnswer) {
                        rightAnswerCount++;
                    } else {
                        wrongAnswerCount++;
                    }
                    break;

                case 4:
                    System.out.printf("%d %s %d %s ", operand1, "/", operand2, "=");
                    userAnswer = input.nextInt();
                    computedAnswer = operand1 / operand2;
                    if (computedAnswer == userAnswer) {
                        rightAnswerCount++;
                    } else {
                        wrongAnswerCount++;
                    }
                    break;
            }
        }

        System.out.printf("Correct answers: %d%n", rightAnswerCount);
        System.out.printf("Wrong answers: %d%n", wrongAnswerCount);
        System.out.printf("Adjusted Score: %d%n", rightAnswerCount - wrongAnswerCount);
    }
}