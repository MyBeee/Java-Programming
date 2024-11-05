package Week_10_01_Hometask;

public interface Service {
	default void process() {
		log();
	}
	
	private void log() {
		System.out.println("처리가 시작됩니다.");
	}
}
