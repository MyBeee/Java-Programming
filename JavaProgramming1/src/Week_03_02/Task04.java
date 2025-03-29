package Week_03_02;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요.");
		int age = scanner.nextInt();
		
		System.out.printf("내 나이는 %d세 입니다.", age);
	}

}
