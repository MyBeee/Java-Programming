package Week_04_01;

public class Task06 {

	public static void main(String[] args) {
		// int a = 3;
		// char b = 'A';
		// String c = "Code";
		
		// System.out.printf("a = %d \n", a);
		// System.out.printf("b = %c \n", b);
		// System.out.printf("c = %s \n", c);
		
		// System.out.printf("이름: %s", "감자바");
		// System.out.printf("나이: %d", 25);
		
		// System.out.printf("이름: %s \n", "감자바");
		// System.out.printf("나이: %d", 25);
		
		// System.out.printf("이름: %1$s, 나이: %2$d", "김자바", 25);
		
		int value = 123;
		System.out.printf("상품의 가격: %d원 \n", value);
		System.out.printf("상품의 가격: %6d원 \n", value);
		System.out.printf("상품의 가격: %-6d원 \n", value);
		System.out.printf("상품의 가격: %06d원 \n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름의 %d인 원의 넓이: %10.2f \n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n", 1, name, job);
		
		// System.out.printf("자리수 미지정: %d \n", 1);
		// System.out.printf("자리수 미지정: %d \n", 10);
		// System.out.printf("자리수 미지정: %d \n", 100);
		// System.out.printf("자리수 미지정: %d \n", 1000);
		
		// System.out.printf("자리수 지정: %4d \n", 1);
		// System.out.printf("자리수 지정: %4d \n", 10);
		// System.out.printf("자리수 지정: %4d \n", 100);
		// System.out.printf("자리수 지정: %4d \n", 1000);
		
		// System.out.printf("자리수 지정('0'사용): %04d \n", 1);
		// System.out.printf("자리수 지정('0'사용): %04d \n", 10);
		// System.out.printf("자리수 지정('0'사용): %04d \n", 100);
		// System.out.printf("자리수 지정('0'사용): %04d \n", 1000);
		
		// int num1 = 1;
		// double num2 = 12.3456789;
		
		// System.out.printf("num1: %d \n", num1);
		// System.out.printf("num2: %f \n", num2);
		// System.out.printf("num2(소수점 첫째 자리까지): %.1f \n", num2);
		// System.out.printf("num2(소수점 둘째 자리까지): %.2f \n", num2);
		// System.out.printf("num2(소수점 셋째 자리까지): %.3f \n", num2);
	}
}
