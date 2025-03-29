package Week_04_01;

public class Task03 {

	public static void main(String[] args) {
		// byte x = 10;
		// byte y = 20;
		// byte result = x + y; // 컴파일 에러
		// int result = x + y;
		// System.out.println(result);
		
		// int x = 10;
		// int y = 20;
		// int result = x + y;
		// System.out.println(result);
		
		// byte a = 1 + 3;
		// System.out.println(a);
		
		// int intValue = 10;
		// double doubleValue = 5.5;
		// double result = intValue + doubleValue;
		// System.out.println(result);
		
		// int intValue = 10;
		// double doubleValue = 5.5;
		// int result = intValue + (int) doubleValue;
		// System.out.println(result);
		
		// int x = 1;
		// int y = 2;
		// double result = x / y;
		// System.out.println(result);
		// 컴파일 에러
		
		// int x = 1;
		// int y = 2;
		// double result = (double) x / y;
		// System.out.println(result);
		
		// int x = 1;
		// int y = 2;
		// double result = x / (double) y;
		// System.out.println(result);
		
		// int x = 1;
		// int y = 2;
		// double result = (double) x / (double) y;
		// System.out.println(result);
		
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 =  1000L;
		long result3 = v3 + v4 + v5;
		System.out.println("result3: " + result3);
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5: " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6: " + result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("result7: " + result7);
	}
}
