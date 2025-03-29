package Week_07_02;

import java.util.Scanner;

public class Hometask04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단을 보시겠습니까? ");
		int a = scanner.nextInt();
		int i = 1;
		
		System.out.printf("-----%d단-----\n", a);
		
		while(i<=9) {
			System.out.printf("%d X %d = %d\n", a, i, a*i);
			i++;
		}
	}
}
