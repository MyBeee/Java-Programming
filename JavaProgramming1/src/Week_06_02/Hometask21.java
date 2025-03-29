package Week_06_02;

import java.util.Scanner;

public class Hometask21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n!의 값을 입력하세요. ");
		int n = scanner.nextInt();
		long result = 1;
		
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		System.out.printf("%d!의 값은 %d입니다.", n, result);
	}

}
