package chapterFive;

import java.util.Scanner;

public class BarChartProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 30: ");
        int input1 = input.nextInt();

        System.out.print("Enter an integer between 1 and 30: ");
        int input2 = input.nextInt();

        System.out.print("Enter an integer between 1 and 30: ");
        int input3 = input.nextInt();

        System.out.print("Enter an integer between 1 and 30: ");
        int input4 = input.nextInt();

        System.out.print("Enter an integer between 1 and 30: ");
        int input5 = input.nextInt();

        if (input1 >= 1 && input1 <=30){
            for (int i = 1; i <= input1; i++) {
                for (i = 1; i <= input1; i++) {
                    System.out.print('*');
                }
            } System.out.println();

            for (int i = 1; i <= input2; i++) {
                for (i = 1; i <= input2; i++) {
                    System.out.print('*');
                }
            }System.out.println();

            for (int i = 1; i <= input3; i++) {
                for (i = 1; i <= input3; i++) {
                    System.out.print('*');
                }
            }System.out.println();

            for (int i = 1; i <= input4; i++) {
                for (i = 1; i <= input4; i++) {
                    System.out.print('*');
                }
            }System.out.println();

            for (int i = 1; i <= input5; i++) {
                for (i = 1; i <= input5; i++) {
                    System.out.print('*');
                }
            }System.out.println();
        }
    }
}
