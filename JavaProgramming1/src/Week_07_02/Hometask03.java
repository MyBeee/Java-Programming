package Week_07_02;

public class Hometask03 {

	public static void main(String[] args) {
		int i = 7;
		int j = 1;
		
		System.out.printf("-----%d단-----\n", i);
		while(j<=9) {
			System.out.printf("%d X %d = %d\n", i, j, i*j);
			j++;
		}
	}
}
