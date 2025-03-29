package Week_03_02;

import java.util.Scanner;

public class Hometask03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형 밑변 길이: ");
		int tri_under = scanner.nextInt();
		
		System.out.print("삼각형 높이 길이: ");
		int tri_height = scanner.nextInt();
		
		System.out.print("사각형 밑변 길이: ");
		int squ_under = scanner.nextInt();
		
		System.out.print("사각형 옆변 길이: ");
		int squ_side = scanner.nextInt();
		
		int tri = tri_under * tri_height / 2;
		int squ = squ_under * squ_side;
		
		System.out.println("삼각형의 넓이는 " + tri + "이다.");
		System.out.println("사각형의 넓이는 " + squ + "이다.");
	}
}

//System.out.println("삼각형의 밑변의 길이가 " + tri_under + "이고 삼각형의 높이가 " + tri_side + "일 때, 삼각형의 넓이는 " + tri + "이다.");
//System.out.println("사각형의 밑변의 길이가 " + squ_under + "이고 사각형의 옆면의 길이가 " + squ_side + "일 때, 사각형의 넓이는 " + squ + "이다.");
