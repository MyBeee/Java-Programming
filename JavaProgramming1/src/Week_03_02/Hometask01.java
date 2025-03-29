package Week_03_02;

import java.util.Scanner;

public class Hometask01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("x의 값: ");
		int x = scanner.nextInt();
		
		System.out.print("y의 값: ");
		int y = scanner.nextInt();
		
		int result1 = x + y;
		int result2 = x - y;
		int result3 = x * y;
		int result4 = x / y;
		
		System.out.println("x의 값이 " + x + "이고 y가 " + y + "를 더하면 " + result1 + "이다.");
		System.out.println("x의 값이 " + x + "이고 y가 " + y + "를 빼면 " + result2 + "이다.");
		System.out.println("x의 값이 " + x + "이고 y가 " + y + "를 곱하면 " + result3 + "이다.");
		System.out.println("x의 값이 " + x + "이고 y가 " + y + "를 나누면 " + result4 + "이다.");
	}

}
