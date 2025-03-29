package Week_04_01;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 학생의 성적: ");
		int stu1 = scanner.nextInt();
		System.out.print("두번째 학생의 성적: ");
		int stu2 = scanner.nextInt();
		System.out.print("세번째 학생의 성적: ");
		int stu3 = scanner.nextInt();
		System.out.print("네번째 학생의 성적: ");
		int stu4 = scanner.nextInt();
		
		int sum = stu1 + stu2 + stu3 + stu4;
		double average = (double) sum / 4;
		System.out.printf("학생 성적 총합: %d \n", sum);
		System.out.printf("학생 성적의 평균: %.3f \n", average);
		
		double dispersion = ((stu1 - average) * (stu1 - average) + (stu2 - average) * (stu2 - average) + (stu3 - average) * (stu3 - average) + (stu4 - average) * (stu4 - average)) / 4;
		System.out.printf("학생의 분산값은? %.3f", dispersion);
	}
}
