package Week_07_02;

public class Hometask16 {

	public static void main(String[] args) {
		int i = 3;
		long result = 1;
		
		while(i<=30) {
			result *= i;
			i++;
		}
		System.out.println("3~30까지의 수를 곱하면 결과값은 " + result + "입니다.");
	}
}
