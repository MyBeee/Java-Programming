package Week_05_01;

import java.util.Scanner;

public class Hometask04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("예금할 금액: ");
		int PV = scanner.nextInt();
		System.out.print("이자율: ");
		double r = scanner.nextDouble();
		System.out.print("예금 기간: ");
		int n = scanner.nextInt();
		
		double FV1 = PV*(1+(r*n));
		double FV2 = PV*(Math.pow(1+r, n));
		
		System.out.print("단리, 복리 중에 무엇을 사용하시겠습니까? ");
		String result = scanner.next();
		
		if(result.equals("단리")) {
			System.out.printf("단리로 계산을 하게되면 %d원을 %.2f 이자율로 %d년 동안 예금을 하게되면 받는 금액은 %.0f원 입니다.", PV, r, n, FV1);
		}
		if(result.equals("복리")) {
			System.out.printf("복리로 계산을 하게되면 %d원을 %.2f 이자율로 %d년 동안 예금을 하게되면 받는 금액은 %.0f원 입니다.", PV, r, n, FV2);
		}
	}
}
