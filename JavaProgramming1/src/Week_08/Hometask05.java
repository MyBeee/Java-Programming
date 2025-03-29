package Week_08;

public class Hometask05 {

	public static void main(String[] args) {
		int num = 1;
        int product = 1;

        do {
            product *= num;
            num++;
        } while (num <= 10);

        System.out.println("1부터 10까지의 곱은: " + product);
	}

}
