package Week_06_02;

import java.util.Scanner;

public class Hometask12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단을 보시겠습니까? ");
		int a = scanner.nextInt();
		
		System.out.printf("----%d단----\n", a);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", a, i, a*i);
		}
	}

}
