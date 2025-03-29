package Week_05_02;

import java.util.Scanner;

public class Hometask06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 도형을 선택하시겠습니까? ");
		String result = scanner.next();
		
		if(result.equals("원")) {
			double pi = 3.14;
			System.out.print("반지름 길이: ");
			int r = scanner.nextInt();
			System.out.print("넓이와 둘레 중에 무엇을 선택하시겠습니까? ");
			String result1 = scanner.next();
			if(result1.equals("넓이")) {
			System.out.printf("반지름의 길이가 %dcm일 때, 원의 넓이는 %.3f입니다.\n", r, (r*r*pi));
			}
			else {
			System.out.printf("반지름의 길이가 %dcm일 때, 원의 둘레는 %.3f입니다.", r, (2*r*pi));
			}
		}
		else if(result.equals("삼각형")) {
			System.out.print("삼각형의 밑변 길이: ");
			int tri_under = scanner.nextInt();
			System.out.print("삼각형의 높이: ");
			int tri_height = scanner.nextInt();
			
			System.out.printf("삼각형 밑변의 길이가 %d이고 높이가 %d일 때, 삼각형의 넓이는 %.2f입니다.\n", tri_under, tri_height, ( (double) tri_under*tri_height/2));
		}
		else {
			System.out.print("사각형의 밑변 길이: ");
			int squ_under = scanner.nextInt();
			System.out.print("사각형의 옆변 길이: ");
			int squ_side = scanner.nextInt();
			System.out.print("넓이와 둘레 중에 무엇을 선택하시겠습니까? ");
			String result2 = scanner.next();
			if(result2.equals("넓이")) {
			System.out.printf("사각형 밑변의 길이가 %d이고 옆변의 길이가 %d일 때, 사각형의 넓이는 %d입니다.\n", squ_under, squ_side, (squ_under * squ_side));
			}
			else {
			System.out.printf("사각형 밑변의 길이가 %d이고 옆변의 길이가 %d일 때, 사각형의 둘레는 %d입니다.\n", squ_under, squ_side, (2 * squ_under + 2 * squ_side));
			}
		}
	}
}
