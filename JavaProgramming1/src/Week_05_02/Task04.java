package Week_05_02;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		else {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
