package Week_07_02;

import java.util.Scanner;

public class Hometask07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 번 반복하시겠습니까? ");
		int a = scanner.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=a) {
			System.out.print("수 입력: ");
			int b = scanner.nextInt();
			sum += b;
			i++;
		}
		System.out.printf("%d만큼 반복하였을 때, 받은 모든 수의 총합은 %d이고, 평균은 %d 입니다.", a, sum, sum/a);
	}
}
