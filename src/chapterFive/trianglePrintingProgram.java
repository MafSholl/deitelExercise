package chapterFive;

public class trianglePrintingProgram {
    public static void main(String [] args) {
//        for (int loop=1; loop<=10; loop++) {
//            for (int counter = 1; counter <=loop; counter++) {
//                System.out.print('*');
//            } System.out.println();
//        }
//        for (int loop=1; loop<=10; loop++) {
//            for (int counter = 10; counter >=loop; counter--) {
//                System.out.print('*');
//            } System.out.println();
//        }
//        for (int loop = 1; loop <= 10; loop++) {
//            for (int counter = 1; counter < loop; counter++) {
//                System.out.print('*');
//            }
//            for (int empty = 10; empty > loop; empty--) {
//                System.out.print('#');
//            }   System.out.println();
//        }
//        for (int loop = 1; loop <= 10; loop++) {
//            for (int counter = 10; counter >= loop; counter--) {
//                System.out.print('*');
//            }
//            for (int empty = 1; empty <= loop; empty++) {
//                System.out.print('#');
//            }   System.out.println();
//        }
        //
        for (int loop = 1; loop <= 10; loop++){
            for (int i = 10; i >= loop; i--){
                System.out.print("*");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print(" ");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print(" ");
            }
            for (int i = 10; i >= loop; i--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int loop = 1; loop <= 10; loop++) {
            for (int i = 1; i <= loop; i++){
                System.out.print("*");
            }
            for (int i = 10; i >=loop; i--){
                System.out.print(" ");
            }
            for (int i = 10; i >= loop; i--){
                System.out.print(" ");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int loop = 1; loop <= 10; loop++){
            for (int i = 10; i >= loop; i--){
                System.out.print(" ");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print("*");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print("*");
            }
            for (int i = 10; i >= loop; i--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int loop = 1; loop <= 10; loop++) {
            for (int i = 1; i <= loop; i++){
                System.out.print(" ");
            }
            for (int i = 10; i >=loop; i--){
                System.out.print("*");
            }
            for (int i = 10; i >= loop; i--){
                System.out.print("*");
            }
            for (int i = 1; i <= loop; i++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
