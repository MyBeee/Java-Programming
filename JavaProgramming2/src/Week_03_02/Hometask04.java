package Week_03_02;

import java.util.Scanner;

public class Hometask04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 수: ");
		int a = scanner.nextInt();
		int[] scores = new int[a];
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i<scores.length; i++) {
			System.out.printf("학생 %d의 점수: ", (i+1));
			int score = scanner.nextInt();
			scores[i] = score;
			sum += score;
			if (max < score) {
				max = score;
			}
			if (min > score) {
				min = score;
			}
		}
		double avg = (double) sum / a;
		System.out.println("주어진 배열의 총합: " + sum);
		System.out.println("주어진 배열의 평균값: " + avg);
		System.out.println("주어진 배열의 최고점수: " + max);
		System.out.println("주어진 배열의 최저점수: " + min);
	}

}
