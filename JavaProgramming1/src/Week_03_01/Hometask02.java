package Week_03_01;

public class Hometask02 {

	public static void main(String[] args) {
		byte tri_under = 3;
		byte tri_height = 5;
		byte squ_under = 6;
		byte squ_side = 8;
		byte cir_r = 6;
		byte cir_p = 3;

		System.out.println("삼각형의 밑면이 " + tri_under + "이고 높이가 " + tri_height + "일 때, " + "삼각형의 넓이는 " + (tri_under * tri_height) / 2 + "입니다.");
		System.out.println("사각형의 밑면이 " + squ_under + "이고 옆면이 " + squ_side + "일 때, " + "사각형의 넓이는 " + (squ_under * squ_side) + "입니다.");
		System.out.println("원의 반지름이 " + cir_r + "일 때, 원의 넓이는 " + (cir_r * cir_r * cir_p) + "이다.");
	}

}
