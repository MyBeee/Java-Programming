package Week_10_01_Hometask;

public class Circle implements MathConstants {
	public void calcuateArea(double radius) {
		double area = PI * radius * radius;
		System.out.printf("원의 반지름이 %.0f일 때, 원의 넓이는 %.2f입니다.", radius, area);
	}
}
