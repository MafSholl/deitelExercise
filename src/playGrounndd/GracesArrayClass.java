package playGrounndd;

import java.security.SecureRandom;

public class GracesArrayClass {
    private static final int[] graces = new int[5];
    private static int[][] doubleGraces;
    private static final int row = 3;
    private static final int column = 3;


    public static void loadGrace(){
        SecureRandom number = new SecureRandom();
        for (int i = 0; i < graces.length; i++){
        graces[i] = 1 + number.nextInt(5);
        }
    }

    public static void printGraces(){
        for (int i = 0; i < graces.length; i++){
            System.out.println ("Index " + i + " is " + graces[i]);
        }
    }

    public static void sumMees(){
        int sum = 0;
        for(int i = 0; i < graces.length; i++){
            sum = sum + graces[i];
        }
        System.out.println("Sum of array is " + sum);
    }

    public static void multiDimLoader(){
        doubleGraces = new int[row][column];
        SecureRandom number = new SecureRandom();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                doubleGraces[i][j] = 1 + number.nextInt(10);
            }
        }
    }

    public static void multiDimPrinter(){
        for(int i = 0; i < row; i++) {
            System.out.print("Row " + i + "   ");
            for (int j = 0; j < column; j++) {
                System.out.print("column " + j + " is " + doubleGraces[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void multiDimSumMethods(){
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                sum = sum + doubleGraces[i][j];
            }
        }
        System.out.println("Sum of the array elements is " + sum);
    }

    public static void main(String[] args) {
        multiDimLoader();
        multiDimPrinter();
        multiDimSumMethods();
    }
}
