package Week_03_02;

import java.util.Scanner;

public class Hometask04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("섭씨 온도: ");
		double C = scanner.nextDouble();
		
		double Fc = 9 * C / 5 + 32;
		System.out.println("섭씨 온도가 " + C + "일 떄, 화씨 온도는 " + Fc + "이다.");
		
		System.out.print("화씨 온도: ");
		double F = scanner.nextDouble();
		
		double Cf = 5 * (F-32) / 9;
		System.out.println("화씨 온도가 " + F + "일 때, 섭씨 온도는 " + Cf + "이다.");
	}

}
