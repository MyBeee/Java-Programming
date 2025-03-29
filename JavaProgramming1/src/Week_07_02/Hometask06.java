package Week_07_02;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("처음 수 입력: ");
		int a = scanner.nextInt();
		System.out.print("나중 수 입력: ");
		int b = scanner.nextInt();
		
		System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈");
		int result = scanner.nextInt();
		
		switch(result) {
			case 1:
				System.out.printf("%d와 %d를 더했을 때, 결과값은 %d입니다.", a, b, a+b);
				break;
			case 2:
				System.out.printf("%d와 %d를 뺄 때, 결과값은 %d입니다.", a, b, a-b);
				break;
			case 3:
				System.out.printf("%d와 %d를 곱했을 때, 결과값은 %d입니다.", a, b, a*b);
				break;
			case 4:
				System.out.printf("%d와 %d를 나누었을 때, 결과값은 %d입니다.", a, b, a/b);
				break;
		}
	}
}
