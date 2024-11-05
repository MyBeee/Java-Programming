package Week_10_01_Hometask;

public interface RemoteControl {
	void turnOn();
	void turnOff();
	
	default void mute() {
		System.out.println("무음 처리되었습니다.");
	}
}
