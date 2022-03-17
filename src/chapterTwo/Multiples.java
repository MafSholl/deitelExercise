package chapterTwo;

import java.util.Scanner;

public class Multiples {
	public static void main (String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = number.nextInt();
		
		System.out.print("Enter a second number: ");
		int number2 = number.nextInt();

		int tripleOfNum1 = number1 * 3;
		int doubleOfNum2 = number2 * 2;
		int certified = doubleOfNum2 % tripleOfNum1;
		
		if (certified == 0) {
			System.out.println("Triple of first number is a certifed multiple of the double of the second number");
		}
		if (certified != 0) {
			System.out.println("Triple of first number isn't a multiple of the double of the second number.");
		}
	}
}