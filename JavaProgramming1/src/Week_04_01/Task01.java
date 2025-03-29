package Week_04_01;

public class Task01 {

	public static void main(String[] args) {
		// byte byteValue = 10;
		// int intValue = byteValue;
		// System.out.println(intValue);
		
		// char charValue = 'A';
		// int intValue = charValue;
		// System.out.println(intValue);
		
		// byte byteValue = 65;
		// char charValue = byteValue;
		// System.out.println(charValue);    
		// 컴파일 에러 뜸! byte 타입은 char 타입으로 자동변환이 안되서 강제변환 해줘야됨
		
		// byte byteValue = 65;
		// char charValue = (char) byteValue;
		// System.out.println(charValue);
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}
}
