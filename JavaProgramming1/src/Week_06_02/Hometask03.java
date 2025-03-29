package Week_06_02;

import java.util.Scanner;

public class Hometask03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 번 반복하시겠습니끼? ");
		int a = scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.println("안녕 " + i);
		}
	}

}
