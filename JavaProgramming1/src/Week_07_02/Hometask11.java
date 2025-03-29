package Week_07_02;

import java.util.Scanner;

public class Hometask11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수: ");
		int a = scanner.nextInt();
		System.out.print("나중 수: ");
		int b = scanner.nextInt();
		int sum = 0;
		int c = a;
		
		while(c<=b) {
			sum += c;
			c++;
		}
		System.out.printf("%d부터 %d까지의 수를 모두 더했을 때의 결과값은 %d입니다.", a, b, sum);
	}
}
