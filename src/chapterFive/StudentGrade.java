package chapterFive;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int totalStudentNumber = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        Scanner input = new Scanner(System.in);

        while (gradeCounter < 5) {
            System.out.print("Enter your grade: ");
            int grade = input.nextInt();
            ++totalStudentNumber;
            ++gradeCounter;

            switch (grade/10) {
                case 10:
                case 9:
                case 8:
                case 7:
                    ++aCount;
                    break;
                case 6:
                    ++bCount;
                    break;
                case 5:
                    ++cCount;
                    break;
                default:
                    ++dCount;
            }
        }
        System.out.printf("%d %s%n%d %s%n%d %s%n%d %s%n"
        , aCount, "number of student got grade A"
        , bCount, "number of student got grade B"
        , cCount, "number of student got grade C"
        , dCount, "number of student got grade D");

//        for (int multiplier = 1; multiplier <= 12; multiplier++) {
//                int result = multiplier * number;
//                System.out.println(number + "*" + multiplier + "=" + result);
//        }
    }
}