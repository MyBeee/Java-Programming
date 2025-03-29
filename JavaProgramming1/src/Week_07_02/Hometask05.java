package Week_07_02;

public class Hometask05 {

	public static void main(String[] args) {
		int i = 1;
		long sum = 1;
		
		while(i<=10) {
			sum *= i;
			i++;
		}
		System.out.println("1~10까지의 모든 수를 곱하면 " + sum + "이 결과값이 됩니다.");
	}
}
