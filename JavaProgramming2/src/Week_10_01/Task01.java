package Week_10_01;

public class Task01 {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
