package chapterTwo;// An application that compares users input with the number 100

import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
		Scanner decker = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int numba = decker.nextInt();
		
		int square = numba * numba;

		int hundred = 100;

		//Next we make comparison
		if (numba == hundred) {
			System.out.printf("%d is equal to 100. ",numba);
			}

		if (numba > hundred) {
			System.out.printf("%d is greater than 100. ",numba);
			}

		if (numba != hundred) {
			System.out.printf("%d is not equal to 100. ",numba);
			}

		if (numba < hundred) {
			System.out.printf("%d is less than 100. ",numba);
			}

		if (square == hundred) {
			System.out.printf("%d is equal to 100. ",square);
			}

		if (square > hundred) {
			System.out.printf("%d is greater than 100. ",square);
			}
					
		if (square != hundred) {
			System.out.printf("%d is not equal to 100. ",square);
			}

		if (square < hundred) {
			System.out.printf("%d is less than 100. ",square);
			}
	}
}