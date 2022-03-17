package chapterTwo;//This program computes the arithmetic operai=tions of three users inputs

import java.util.Scanner;
public class InputCalculations {
	public static void main(String[] args) {
		Scanner calculus = new Scanner(System.in);

		System.out.print("Enter three different integers: ");

		int integer1 = calculus.nextInt();
		int integer2 = calculus.nextInt();
		int integer3 = calculus.nextInt();

		int sum = integer1 + integer2 + integer3;
		int average = (integer1 + integer2 + integer3) / 3;
		int product = integer1 * integer2 * integer3;

		System.out.printf("Sum of the numbers is: %d%n Average of the numbers is: %d%n Product of the numbers is %d%n ", sum, average, product);

		if (integer1 > integer2) {
			if (integer2 > integer3) {
				System.out.printf("The smallest number is %s%d%n", "The largest number is %d%n", integer3, integer1);

			}
		}
	}
}