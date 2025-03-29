package Week_07_02;

public class Hometask12 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=20) {
			if(i != 19) {
				System.out.printf("%d + ", i);
				sum += i;
			} else {
				sum += i;
				System.out.printf("%d = %d", i, sum);
			}
			i = i + 2;
		}
	}
}
