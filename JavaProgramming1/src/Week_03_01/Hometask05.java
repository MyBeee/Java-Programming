package Week_03_01;

public class Hometask05 {

	public static void main(String[] args) {
		long tri_under = 3;
		long tri_height = 5;
		long tri = (tri_under * tri_height) / 2;
		long squ_under = 6;
		long squ_side = 8;
		long squ = (squ_under * squ_side);
		long cir_r = 6;
		long cir_p = 3;
		long cir = (cir_r * cir_r * cir_p);

		System.out.println("삼각형의 밑면이 " + tri_under + "이고 높이가 " + tri_height + "일 때, " + "삼각형의 넓이는 " + tri + "입니다.");
		System.out.println("사각형의 밑면이 " + squ_under + "이고 옆면이 " + squ_side + "일 때, " + "사각형의 넓이는 " + squ + "입니다.");
		System.out.println("원의 반지름이 " + cir_r + "일 때, 원의 넓이는 " + cir + "이다.");
	}

}
