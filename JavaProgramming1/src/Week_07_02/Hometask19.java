package Week_07_02;

import java.util.Scanner;

public class Hometask19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n!값의 n을 입력해주세요. ");
		int n = scanner.nextInt();
		int i = 1;
		long result = 1;
		
		while(i<=n) {
			result *= i;
			i++;
		}
		System.out.printf("%d!의 값의 결과값은 %d입니다.", n, result);
	}
}