package Week_10_01;

public class Task04 {

	public static void main(String[] args) {
		RemoteControl_3 rc;
		
		rc = new Television_2();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		System.out.println();
		
		rc = new Audio_2();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
	}

}
