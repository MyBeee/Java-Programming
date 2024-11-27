package Week_13_02;

public class Task02 {

	public static void main(String[] args) {
		Shapes<Integer> Circle = new Shapes<> ();
		Circle.Shapes = 6;
		int resultCir = Circle.Shapes;
		System.out.printf("삼각형의 둘레: %.2f \n", resultCir * resultCir * 3.14159);
		System.out.printf("삼각형의 넓이: %.2f \n", 2 * resultCir * 3.14159);
		
		Shapes<Integer> Rectangle = new Shapes<> ();
		Rectangle.Shapes = 10;
		int resultRec = Rectangle.Shapes;
		System.out.printf("정사각형 둘레: %d \n", 4 * resultRec);
		System.out.printf("정사각형 넓이: %d \n", resultRec * resultRec);
		
		Shapes<Double> Triangle = new Shapes<> ();
		Triangle.Shapes = 4.5;
		double resultTri = Triangle.Shapes;
		System.out.printf("삼각형의 둘레: %.2f \n", 3 * resultTri);
		System.out.printf("삼각형의 넓이: %.2f \n", resultTri * 10);
		
	}

}
