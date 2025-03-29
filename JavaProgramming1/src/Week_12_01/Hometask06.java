package Week_12_01;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean result = true;
		int[] scores = null;
		int stu = 0;
		
		while(result) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택> ");
			String pick = scanner.nextLine();
			
			switch (pick) {
				case "1":
					System.out.print("학생수> ");
					stu = scanner.nextInt();
					scores = new int[stu];
					scanner.nextLine();
					break;
				case "2":
					if (scores != null) {
						for(int i = 0; i < scores.length; i++) {
							System.out.print("scores[" + i + "]> ");
							scores[i] = scanner.nextInt();
						}
						scanner.nextLine();
					} else {
						System.out.println("먼저 학생수를 입력하세요.");
					}
					break;
				case "3":
					if (scores != null) {
						for(int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "]> " + scores[i]);
						}
					} else {
						System.out.println("먼저 학생수를 입력하세요.");
					}
					break;
				case "4":
					if (scores != null) {
						int max = 0;
						int sum = 0;
						for (int score : scores) {
							if (score > max) {
								max = score;
							}
							sum += score;
						}
						double avg = (double) sum / stu;
						System.out.println("최고 점수: " + max);
						System.out.println("평균 점수: " + avg);
					} else {
						System.out.println("먼저 학생수를 입력하고 점수를 입력하세요.");
					}
					break;
				case "5":
					result = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
					break;
			}	
		}
		scanner.close();
	}

}
