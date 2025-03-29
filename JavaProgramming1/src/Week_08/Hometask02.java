package Week_08;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int count = 0;
		int num;
		
		do {
			System.out.print("수 입력(0 입력 시 종료): ");
			num = scanner.nextInt();
			if (num != 0) {
				count++;
				total += num;
			}
		} while (num != 0);
		
		double avg = (double) total / count;
		System.out.printf("모든 수의 총합은 %d이고, 평균은 %.2f입니다.", total, avg);
	}

}
