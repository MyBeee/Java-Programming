package Week_06_02;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수 ");
		int a = scanner.nextInt();
		System.out.print("나중 수 ");
		int b = scanner.nextInt();
		int sum = 0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합은 %d 입니다.", a, b, sum);
	}

}
