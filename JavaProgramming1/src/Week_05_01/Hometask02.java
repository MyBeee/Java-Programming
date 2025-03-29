package Week_05_01;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int score = scanner.nextInt();
		
		if(score >= 30) {
			System.out.println("30이상의 수 입니다.");
		}
		if(score < 30 && score >= 10) {
			System.out.println("10~29에 있는 수 입니다.");
		}
		if(score < 10) {
			System.out.println("10 미만의 수 입니다.");
		}
	}
}
