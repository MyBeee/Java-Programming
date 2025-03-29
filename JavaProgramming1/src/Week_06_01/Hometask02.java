package Week_06_01;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		int day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.printf("%d 달은 31일 입니다.", month);
				yield 31;
			}
			case 4, 6, 9, 11 -> {
				System.out.printf("%d 달은 30일입니다.", month);
				yield 30;
			}
			case 2 -> {
				System.out.printf("%d 달은 29일입니다.", month);
				yield 29;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;
			}
		};
		System.out.println(month + "월은 " + day + "일입니다.");
		scanner.close();
	}
}
	