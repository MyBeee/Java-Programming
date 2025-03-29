package Week_07_02;

import java.util.Scanner;

public class Hometask02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 번 반복하시겠습니까? ");
		int a = scanner.nextInt();
		int i = 1;
		
		while(i<=a) {
			System.out.println( i + " hello java");
			i++;
		}
	}

}
