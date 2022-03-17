package chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		
		System.out.print("Enter an integer of five digits: ");
		int number1= numbers.nextInt();
		
		if (number1 < 10_000) {
			System.out.print("This number is not up to 5 digits");
		}
		
		//First I compute the remainders of the number per digits
		int mod5 = number1%10;
		int mod4 = number1%100;
		int mod3 = number1%1000;
		int mod2 = number1%10000;
		int mod1 = number1%100000;
		
		//I compute the 
		int divisionTenThousands1 = mod1/10000;
		int divisionThousands2  = mod2/1000;
		int divisionHundreds3 = mod3/100;
		int divisionTens4 = mod4/10;
		int divisionUnit5 = mod5/1;
		
		if (number1 >= 10_000) {
		System.out.printf("%d%s%d%s%d%s%d%s%d%n", divisionTenThousands1, "   ", divisionThousands2, "   ", divisionHundreds3, "   ", divisionTens4, "   ", divisionUnit5);
		}
	}
}