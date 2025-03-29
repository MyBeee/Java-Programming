package Week_06_01;

import java.util.Scanner;

public class Hometask04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1부터 30까지의 수 중에 아무 수나 입력해주시오. ");
		int num = scanner.nextInt();
		
		switch(num) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9:
				System.out.println("10미만의 수 입니다.");
				break;
			case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
				System.out.println("10이상 20미만의 수 입니다.");
				break;
			case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
				System.out.println("20이상 30미만의 수 입니다.");
				break;
			default:
				System.out.println("30 초과된 수 입니다.");
		}
	}
}
