package Week_06_02;

import java.util.Scanner;

public class Hometask16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수 ");
		int a = scanner.nextInt();
		System.out.print("나중 수 ");
		int b = scanner.nextInt();
		long result1 = 1;
		long result2 = 1;
		
		for(int i=a; i<=b; i++) {
			if(i%2==1) {
				result1 *= i;
			} else {
				result2 *= i;
			}
		}
		System.out.printf("%d부터 %d까지 홀수만 곱한 값은 %d입니다.\n", a, b, result1);
		System.out.printf("%d부터 %d까지 짝수만 곱한 값은 %d입니다.", a, b, result2);
	}

}
