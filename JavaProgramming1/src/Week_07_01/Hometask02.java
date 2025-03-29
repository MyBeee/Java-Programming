package Week_07_01;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 줄의 삼각형을 원하십니까? ");
		int a = scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
