package Week_03_02;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double cir_p = 3.14;
		
		System.out.print("반지름의 길이: ");
		double cir_r = scanner.nextDouble();
		
		double cir_l = 2 * cir_r * cir_p;
		double cir_s = cir_r * cir_r * cir_p;
		double cir_v = 4 * cir_p * cir_r * cir_r * cir_r / 3;
		
		System.out.println("반지름의 길이가 " + cir_r + "일 때, 원의 둘레는 " + cir_l + "이다.");
		System.out.println("반지름의 길이가 " + cir_r + "일 때, 원의 넓이는 " + cir_s + "이다.");
		System.out.println("반지름의 길이가 " + cir_r + "일 때, 원의 부피는 " + cir_v + "이다.");
	}

}
