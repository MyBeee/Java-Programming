package Week_07_01;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 높이: ");
		int a = scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j=i; j<=a-1; j++) {
				System.out.print(" ");
			}
			for(int n=1; n<=2*i-1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
