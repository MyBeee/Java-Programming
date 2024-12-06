package Week_14_01;

public class Task10 {

	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		auto.setDaemon(true);
		auto.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}

}
