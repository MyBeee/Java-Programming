package Week_06_02;

import java.util.Scanner;

public class Hometask11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수 ");
		int a = scanner.nextInt();
		System.out.print("나중 수 ");
		int b = scanner.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%2==1) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.printf("%d부터 %d까지 홀수의 합은 %d입니다.\n", a, b, sum1);
		System.out.printf("%d부터 %d까지 짝수의 합은 %d입니다.", a, b, sum2);
	}
}
