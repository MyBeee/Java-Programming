package Week_06_02;

public class Hometask07 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i<=20; i+=2) {
			sum += i;
			if(i==19) {
				System.out.printf("%d = %d", i, sum);
			} else {
				System.out.printf("%d + ", i);
			}
		}
	}
}
