package Week_07_02;

import java.util.Scanner;

public class Hometask17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수: ");
		int a = scanner.nextInt();
		System.out.print("나중 수: ");
		int b = scanner.nextInt();
		int c = a;
		long result1 = 1;
		long result2 = 1;
		
		while(a<=b) {
			if(a%2==1) {
				result1 *= a;
			} else {
				result2 *= a;
			}
			a++;
		}
		System.out.printf("%d부터 %d까지 홀수만 곱했을 때의 결과값은 %d입니다.\n", c, b, result1);
		System.out.printf("%d부터 %d까지 짝수만 곱했을 때의 결과값은 %d입니다.", c, b, result2);
	}
}