package chapterTwo;//Exercise 2.15 solution

import java.util.Scanner;

public class Arithmetic {
	public static void main (String[] args) {
		Scanner user = new Scanner(System.in);
		
//		System.out.print("Enter the first integer: ");
		int number1 = user.nextInt();
		
//		System.out.print("Enter the second integer: ");
		int number2 = user.nextInt();

		int square1 = number1 * number1;

		int square2 = number2 * number2;

		int sum = square1 + square2;

		int difference = square1 - square2;

		System.out.printf("Squares of each respectively are %d and %d; the sum of their squares is %d; the difference of their squares is %d .", square1, square2, sum, difference);
	}
}

	