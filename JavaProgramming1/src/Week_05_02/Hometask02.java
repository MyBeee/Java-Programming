package Week_05_02;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번 째 수 입력: ");
		int num1 = scanner.nextInt();
		System.out.print("두번 째 수 입력: ");
		int num2 = scanner.nextInt();
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int multi = num1 * num2;
		double div = (double)num1 / num2;
		
		System.out.print("무슨 연산으로 계산하시겠습니까? ");
		String result = scanner.next();
		
		if(result.equals("덧셈")) {
			System.out.printf("첫 수가 %d이고 두번 째 수가 %d일 때, 덧셈연산을 하면 %d입니다.", num1, num2, plus);
		}
		else if(result.equals("뺄셈")) {
			System.out.printf("첫 수가 %d이고 두번 째 수가 %d일 때, 뺄셈연산을 하면 %d입니다.", num1, num2, minus);
		}
		else if(result.equals("곱셈")) {
			System.out.printf("첫 수가 %d이고 두번 째 수가 %d일 때, 곱셈연산을 하면 %d입니다.", num1, num2, multi);
		}
		else {
			System.out.printf("첫 수가 %d이고 두번 째 수가 %d일 때, 나눗셈연산을 하면 %.2f입니다.", num1, num2, div);
		}
	}
}
