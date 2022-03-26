package chapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the which verse you want to see: ");
        int dayOfChristmas = input.nextInt();

        switch (dayOfChristmas) {
            case 12:
                System.out.print("On the twelfth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 11:
                System.out.print("On the eleventh day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 10:
                System.out.print("On the tenth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 9:
                System.out.print("On the ninth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 8:
                System.out.print("On the eighth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 7:
                System.out.print("On the seventh day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 6:
                System.out.print("On the sixth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 5:
                System.out.print("On the fifth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 4:
                System.out.print("On the fourth day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 3:
                System.out.print("On the third day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 2:
                System.out.print("On the second day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            case 1:
                System.out.print("On the first day of Christmas\n" +
                        "My true love sent to me\n");
                break;
            default:
                System.out.println("This is not valid. Re-enter again.");
        }
        switch (dayOfChristmas) {
            case 12: System.out.println("12 drummers drumming");
            case 11: System.out.println("Eleven pipers piping");
            case 10: System.out.println("ten lords a-leaping");
            case 9: System.out.println("Nine ladies dancing");
            case 8: System.out.println("Eight maids a-milking");
            case 7: System.out.println("Seven swans a-swimming");
            case 6: System.out.println("Six geese a-laying\n");
            case 5: System.out.println("Five golden rings (five golden rings)");
            case 4: System.out.println("Four calling birds");
            case 3: System.out.println("Three French hens");
            case 2: System.out.println("Two turtle-doves");
            case 1: System.out.println("And a partridge in a pear tree");
            break;
            default:
                System.out.println("This is not valid. Re-enter again.");
        }
    }
}