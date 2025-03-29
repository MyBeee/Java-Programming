package Week_03_01;

public class Hometask04 {

	public static void main(String[] args) {
		int tri_under = 3;
		int tri_height = 5;
		int tri = (tri_under * tri_height) / 2;
		int squ_under = 6;
		int squ_side = 8;
		int squ = (squ_under * squ_side);
		int cir_r = 6;
		int cir_p = 3;
		int cir = (cir_r * cir_r * cir_p);

		System.out.println("삼각형의 밑면이 " + tri_under + "이고 높이가 " + tri_height + "일 때, " + "삼각형의 넓이는 " + tri + "입니다.");
		System.out.println("사각형의 밑면이 " + squ_under + "이고 옆면이 " + squ_side + "일 때, " + "사각형의 넓이는 " + squ + "입니다.");
		System.out.println("원의 반지름이 " + cir_r + "일 때, 원의 넓이는 " + cir + "이다.");
	}

}
