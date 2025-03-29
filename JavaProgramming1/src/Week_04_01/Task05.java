package Week_04_01;

public class Task05 {

	public static void main(String[] args) {
		// String str1 = "10";
		// byte value1 = Byte.parseByte(str1);
		// System.out.println("value 값은? " + value1);
		
		// String str2 = "200";
		// short value2 = Short.parseShort(str2);
		// System.out.println("value 값은? " + value2);
		
		// String str3 = "300000";
		// int value3 = Integer.parseInt(str3);
		// System.out.println("value 값은? " + value3);
		
		// String str4 = "40000000000";
		// long value4 = Long.parseLong(str4);
		// System.out.println("value 값은? " + value4);
		
		// String str5 = "12.345";
		// float value5 = Float.parseFloat(str5);
		// System.out.println("value 값은? " + value5);
		
		// String str6 = "12.345";
		// double value6 = Double.parseDouble(str6);
		// System.out.println("value 값은? " + value6);
		
		// String str7 = "true";
		// boolean value7 = Boolean.parseBoolean(str7);
		// System.out.println("value 값은? " + value7);
		
		// String str = "1a";
		// int value = Integer.parseInt(str); // 컴파일 에러
		// System.out.println("value 값은? " + value);
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
