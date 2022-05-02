package chapterFive;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class UserScoreApp {

    private int rightAnswerCount;
    private int wrongAnswerCount;
    private int operand1;
    private int operand2;
    private int userAnswer;
    private int computedAnswer;
    private Scanner input;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int rightAnswerCount = 0;
        int wrongAnswerCount = 0;

        int loop = 1;
        while (loop <= 10) {
            int operand1 = random.nextInt(1,50);
            int operand2 = random.nextInt(1,50);
            int operator = random.nextInt(1,4);

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
                    System.out.printf("%d %s %d %s ", operand1, "X", operand2, "=");
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
            loop++;
        }
        System.out.printf("Correct answers: %d%n", rightAnswerCount);
        System.out.printf("Wrong answers: %d%n", wrongAnswerCount);
        System.out.printf("Adjusted Score: %d%n", rightAnswerCount - wrongAnswerCount);
    }

    public int randomNumberGenerator(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(1,50);
    }

    public void rand(){

        operand1 = randomNumberGenerator();
        operand2 = randomNumberGenerator();
    }

    public void operatorRandomGenerator(){
//         SecureRandom random = new SecureRandom();
//        int operator =  random.nextInt(1,4);
//        switch(operator){
//            case 1: return '+';
//            break;
//            case 2: return '-';
//            break;
//            case 3: return '*';
//            break;
//            case 4: return '/';
//            break;
//        }
    }
    public void generateQuestion(){
        System.out.printf("%d %s %d %s ", operand1, "-", operand2, "=");
    }
    public void generateAnswer(){
        input = new Scanner(System.in);
        userAnswer = input.nextInt();
        computedAnswer = operand1 +  operand2;
    }
}

