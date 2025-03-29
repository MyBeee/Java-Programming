package Week_03_02;

import java.util.Scanner;

public class Hometask05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("처음 속도: ");
		double v0 = scanner.nextDouble();
		
		System.out.print("가속도: ");
		double a = scanner.nextDouble();
		
		System.out.print("시간: ");
		double t = scanner.nextDouble();
		
		double s = v0 * t + (double)1/2 * a * t * t;
		System.out.printf("가속도 운동을 하는 물체의 이동거리는 %f 입니다.", s);
	}

}
