package Week_04_02;

public class Task08 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // 10 == 10 -> true
		boolean result2 = (num1 != num2); // 10 != 10 -> false   !=는 두 연산자의 값이 다를 경우 true
		boolean result3 = (num1 <= num2); // 10 <= 10 -> true
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // A < B -> true
		System.out.println("result4: " + result4);
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); // 1 == 1.0 -> true
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6); // 0.1 == 0.1 -> false    num6이 double 값이므로 false임
		boolean result7 = (num5 == (float)num6); // 0.1 == 0.1 -> true
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // 자바 == Java -> false
		boolean result9 = (! str1.equals(str2)); // 자바 != Java -> true
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}
