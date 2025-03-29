package Week_06_01;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생의 성적을 입력하세요. ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 95, 96, 97, 98, 99, 100:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 A+입니다.", num);
			break;
		case 90, 91, 92, 93, 94:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 A입니다.", num);
			break;
		case 85, 86, 87, 88, 89:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 B+입니다.", num);
			break;
		case 80, 81, 82, 83, 84:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 B입니다.", num);
			break;
		case 75, 76, 77, 78, 79:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 C+입니다.", num);
			break;
		case 70, 71, 72, 73, 74:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 C입니다.", num);
			break;
		case 65, 66, 67, 68, 69:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 D+입니다.", num);
			break;
		case 60, 61, 62, 63, 64:
			System.out.printf("이 학생의 점수는 %d점 이므로 학점이 D입니다.", num);
			break;
		default:
			System.out.println("이 학생은 60점 미만의 성적을 받아 F학점 이므로 낙제점입니다.");
		}
	}
}
