package chapterTwo;//Divisibility by three

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		int number = user.nextInt();
		
		int divide = number % 3;
		if (divide < 1 ) {
			System.out.println("This number is divisible by 3.");
		}
		if (divide > 0) {
			System.out.println("This number is not divisible by 3.");
		}
	}
}
