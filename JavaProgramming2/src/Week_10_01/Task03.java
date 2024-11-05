package Week_10_01;

public class Task03 {

	public static void main(String[] args) {
		RemoteControl_2 rc;
		
		rc = new Television_1();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio_1();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
