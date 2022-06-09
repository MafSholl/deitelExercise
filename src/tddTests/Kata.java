package tddTests;

import java.util.Scanner;

public class Kata {

    //Palindrome
    public boolean palindrome(int number1) {
        /**    Scanner numbers = new Scanner(System.in);

         System.out.print("Enter an integer of five digits: ");
         int number1= numbers.nextInt();**/

         if (number1 > 100_000) {
         System.out.print("Number out of range");
         }

        int mod5 = number1 % 10;
        int mod4 = number1 % 100;
        int mod3 = number1 % 1000;
        int mod2 = number1 % 10000;
        int mod1 = number1 % 100000;

        int divTenThousands1 = mod1 / 10000;
        int divThousands2 = mod2 / 1000;
        int divHundreds3 = mod3 / 100;
        int divTens4 = mod4 / 10;
        int divUnit5 = mod5 / 1;

        if (divUnit5 == divTenThousands1) if (divThousands2 == divTens4) {
            return true;
        }
        return false;
    }

    public int utmeVendor(int quantity) {
        if (quantity >= 1 && quantity <= 4) {
            return quantity * 2000;
        }
        if (quantity >= 5 && quantity <= 9) {
            return quantity * 1800;
        }
        if (quantity >= 10 && quantity <= 29) {
            return quantity * 1600;
        }
        if (quantity >= 30 && quantity <= 49) {
            return quantity * 1500;
        }
        if (quantity >= 50 && quantity <= 99) {
            return quantity *  1300;
        }
        if (quantity >= 100 && quantity <= 199) {
            return quantity * 1200;
        }
        if (quantity >= 200 && quantity <= 499) {
            return quantity *  1100;
        }
        if (quantity >= 500) {
            return quantity * 1000;
        }
        return 0;
    }

    public int quotientOfTwoNumbers(int number1, int number2) {
        int quotient = number1 / number2;;
        return quotient;
    }
    public boolean evenOrOddNumber(int number){
        int value = number%2;
        if (value == 0){
            return true;
        }
        return false;
    }
    public int biggestOfFiveNumbers(int first, int second, int third, int fourth, int fifth){
        int biggestNumber = first;
        if (second > biggestNumber) {biggestNumber = second;}
        if (third >biggestNumber) {biggestNumber = third;}
        if (fourth > biggestNumber) {biggestNumber = fourth;}
        if (fifth > biggestNumber) {biggestNumber = fifth;}
        return biggestNumber;
    }

    public int numberOfHighestFactor(int input){
        int counter = 1;
        int factorCounter = 0;
        while (counter <= input){
          if (input%counter == 0){
              factorCounter ++;
          }
          counter++;
        } return factorCounter;
    }

    public boolean primeNumberTest(int input) {
        int counter = 1;
        while (counter <= input){
            if (input%2 == 1 && input%3 != 0){
                return true;
            }
            counter++;
        }return false;
    }

    public static void printingPrimeNumber(){
        int loop = 2;
        while(loop <= 100){
            if(loop/2 == 1 && loop%2 == 0){
                System.out.print(loop + ", ");
            }
            if(loop/3 == 1 && loop%3 == 0){
                System.out.print(loop + ", ");
            }
            if(loop/5 == 1 && loop%5 == 0){
                System.out.print(loop + ", ");
            }
            if(loop/7 == 1 && loop%7 == 0){
                System.out.print(loop + ", ");
            }
            if (loop%2 == 1 && loop%3 != 0 && loop%5 != 0 && loop%7 != 0){
                System.out.print(loop + ", ");
            }
            loop++;
        }
    }

    private static int[] twentyArray = new int[20];

    public static void main(String[] args) {
//        printingPrimeNumber();

        for(int i = 0; i < 20; i++){
            System.out.print(twentyArray[i] + " ");
        }

    }
}