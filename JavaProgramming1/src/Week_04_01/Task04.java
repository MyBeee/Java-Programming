package Week_04_01;

public class Task04 {

	public static void main(String[] args) {
		// int value = 3 + 7;
		// String str1 = "3" + 7;
		// String str2 = 3 + "7";
		// System.out.println("value 값은? " + value);
		// System.out.println("str1의 값은? " + str1);
		// System.out.println("str2의 값은? " + str2);
		
		// int value = 1 + 2 + 3;
		// String str1 = 1 + 2 + "3";
		// String str2 = 1 + "2" + 3;
		// String str3 = "1" + 2 + 3;
		// System.out.println("value 값은? " + value);
		// System.out.println("str1의 값은? " + str1);
		// System.out.println("str2의 값은? " + str2);
		// System.out.println("str3의 값은? " + str3);
		
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
	}
}
