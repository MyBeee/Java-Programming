package Week_07_02;

import java.util.Scanner;

public class Hometask15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단 몇 단을 출력하시겠습니까? ");
		int result = scanner.nextInt();
		int i = 1;
		
		while(i<=9) {
			System.out.printf("%d X %d = %d\n", result, i, result*i);
			i++;
		}
	}
}
