package chapterTwo;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a degree in celcius: ");
		int tempCelcius;
		tempCelcius= input.nextInt();

		double tempFahrenheit;
		tempFahrenheit= 9.0/5 * tempCelcius + 32;

		System.out.printf("%d%s%d%s%n", tempCelcius, "Celcius is", tempFahrenheit, "Fahrenheit");
	}
}	
		

