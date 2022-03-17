package chapterTwo;

import java.util.Scanner;

public class CircleCalculations {
	public static void main(String[] args) {
		Scanner circle = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		int radius= circle.nextInt();
		
		double diameter = 2 * radius;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("Diameter is:%f%n, Circumference is:%f%n, Area is %f%n", diameter, circumference, area);
	}
}