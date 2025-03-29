package Week_05_01;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int score = scanner.nextInt();
		
		if(score >= 10) {
			System.out.println("10 이상의 수 입니다.");
		}
		else {
			System.out.println("10 미만의 수 입니다.");
		}
	}
}
