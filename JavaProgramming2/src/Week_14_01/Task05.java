package Week_14_01;

public class Task05 {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}

}