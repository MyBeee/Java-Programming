package Week_05_02;

import java.util.Scanner;

public class Hometask01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이 학생의 성적이 어떻게 됩니까? ");
		int score = scanner.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("점수가 90점 이상이므로 학점이 A입니다.");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("점수가 80~89점이므로 학점이 B입니다.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("점수가 70~79점이므로 학점이 C입니다.");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("점수가 60~69점이므로 학점이 D입니다.");
		}
		else {
			System.out.println("점수가 미달되어 낙제되었습니다.");
		}
	}
}
