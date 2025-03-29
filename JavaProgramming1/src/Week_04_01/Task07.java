package Week_04_01;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
			
		// int x = 5;
		// boolean result = (x==5);
		// System.out.println("result 값은? " + result);
		
		// String str1 = "java";
		// boolean result1 = str1.equals("java");
		// boolean result2 = str1.equals("java");
		// System.out.println("result 값은? " + result1);
		// System.out.println("result 값은? " + result2);
	}
}
