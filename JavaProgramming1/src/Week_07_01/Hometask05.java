package Week_07_01;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("길이를 정해주세요. ");
		int a = scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}
}