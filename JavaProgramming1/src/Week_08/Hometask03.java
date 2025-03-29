package Week_08;

import java.util.Scanner;

public class Hometask03 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter value for x: ");
	        double x = scanner.nextDouble();

	        System.out.print("Enter value for y: ");
	        double y = scanner.nextDouble();

	        double result = 7 * (x * x) + 4 * y;
	        System.out.println("The value of 7x^2 + 4y is: " + result);

	        scanner.close();
	}
}
