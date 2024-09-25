package Week_03_02;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("지원자 수: ");
		int a = scanner.nextInt();
		int[][] scores = new int[a][4];
		int sum = 0;
		double avg = 0;
		int score = 0;
		int max = 0;
		int min = 1000;
		
		for(int i = 0; i<scores.length; i++) {
			sum = 0;
			for(int j = 0; j<scores[i].length; j++) {
				System.out.printf("%d지원자의 점수를 입력: ", (i+1));
				score = scanner.nextInt();
				scores[i][j] = score;
				sum += scores[i][j];
			}
			avg = (double)sum / 4;
			System.out.printf("지원자 %d의 총합: %d\n", i+1 ,sum);
			System.out.printf("지원자 %d의 평균: %d\n", i+1 ,avg);
			if(max < sum) {
				max = sum;
			}
			if(min > sum) {
				min = sum;
			}
		}
	}

}
