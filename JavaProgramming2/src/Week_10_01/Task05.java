package Week_10_01;

public class Task05 {

	public static void main(String[] args) {
		RemoteControl_4 rc;
		
		rc = new Television_3();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio_3();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		RemoteControl_4.changeBattery();
	}

}
