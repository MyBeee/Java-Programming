package Week_08;

public class Hometask04 {

	public static void main(String[] args) {
		int num = 1;
        int total = 0;

        do {
            total += num;
            num++;
        } while (num <= 10);

        System.out.println("1부터 10까지의 덧셈: " + total);
	}

}
