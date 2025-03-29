package Week_08;

import java.util.Scanner;

public class Hometask01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, result, math = 0;
		boolean restart;
		
		do {
			System.out.print("첫 번째 수 입력: ");
			a = scanner.nextInt();
			System.out.print("두 번째 수 입력: ");
			b = scanner.nextInt();
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. 프로그램 종료");
			math = scanner.nextInt();
			restart = true;
			
			switch(math) {
				case 1:
					result = a + b;
					System.out.println("두 수를 더한 값은 " + result + "입니다.");
					break;
				case 2:
					result = a - b;
					System.out.println("두 수를 뺀 값은 " + result + "입니다.");
					break;
				case 3:
					result = a * b;
					System.out.println("두 수를 곱한 값은 " + result + "입니다.");
					break;
				case 4:
					result = a / b;
					System.out.println("두 수를 나눈 값은 " + result + "입니다.");
					break;
				case 5:
					System.out.println("시스템을 종료하겠습니다.");
					restart = false;
			}
		} while(restart);
		
		scanner.close();
	}
}
