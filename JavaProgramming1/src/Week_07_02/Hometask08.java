package Week_07_02;

import java.util.Scanner;

public class Hometask08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("몇 개월 예금 및 출금을 하셨습니까? ");
		int mon = scanner.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=mon) {
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			int result = scanner.nextInt();
		
			switch (result) {
				case 1:
					System.out.print("예금할 금액: ");
					int a = scanner.nextInt();
					sum += a;
					System.out.printf("%d원을 예금하였을 때, 잔액은 %d입니다.\n", a, sum);
					break;
				case 2: 
					System.out.print("출금할 금액: ");
					int b = scanner.nextInt();
					sum -= b;
					System.out.printf("%d원을 출금하였을 때, 잔액은 %d입니다.\n", b, sum);
					break;
				case 3: 
					System.out.printf("현재 잔액은 %d입니다.\n", sum);
					break;
				case 4: 
					System.out.println("종료하겠습니다.");
					i = mon;
					break;
			}
			i++;
		}
	}
}
