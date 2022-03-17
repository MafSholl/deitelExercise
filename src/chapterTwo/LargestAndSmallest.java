package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner headache = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int number1 = headache.nextInt();

		System.out.print("Enter the second integer: ");
		int number2 = headache.nextInt();
		
		System.out.print("Enter the third integer: ");
		int number3 = headache.nextInt();

		int highest = number1;
		
		if (number2 > highest) {
			if (number2 > number3) {
				highest = number2;
			}
		}
		if (number3 > highest) {
			if (number3 > highest) {
				highest = number3;
			}
		}
		System.out.printf("The highest is %d%n", highest);

		int lowest = number1;
		
		if (number2 < lowest) {
			if (number2 < number3) {
				lowest = number2;
			}
		}
		if (number3 < lowest) {
			if (number3 < number2) {
				lowest = number3;
			}
		}
		System.out.printf("The lowest is %d%n", lowest);
	}
}