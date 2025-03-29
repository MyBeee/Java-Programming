package Week_06_02;

import java.util.Scanner;

public class Hometask10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수 ");
		int a = scanner.nextInt();
		System.out.print("나중 수 ");
		int b = scanner.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(i%2==1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				System.out.printf("%d ", i);
			}
		}
	}
}
