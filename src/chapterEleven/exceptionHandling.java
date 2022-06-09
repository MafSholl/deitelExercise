package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        int numerator = input("Enter numerator: ");
        int denominator = input("Enter denominator: ");
        int approximateQuotient = numerator / denominator;
        display(approximateQuotient + "");
    }
        public static int input(String prompt){
            display(prompt);
            int number = 0;
            Scanner keyboardInput  = new Scanner(System.in);
            try{
                return keyboardInput.nextInt();
            }
//            catch(Exception exception){ }
            catch(InputMismatchException exception){
            display("Get lost");
            System.exit(1);
            }
            return number;
        }

        public static String display(String output){
            return output;
        }



}
