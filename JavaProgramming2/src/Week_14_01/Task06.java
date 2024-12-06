package Week_14_01;

public class Task06 {

	public static void main(String[] args) {
		WorkThread workA = new WorkThread("workThreadA");
		WorkThread workB = new WorkThread("workThreadB");
		workA.start();
		workB.start();
		
		try {Thread.sleep(5000); } catch (InterruptedException e) {}
		workA.work = false;
		
		try {Thread.sleep(10000); } catch(InterruptedException e) {}
		workB.work = true;
	}

}
