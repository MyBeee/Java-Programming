package Week_14_01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task11 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.shutdownNow();
	}

}
