package Week_10_02;

public class Task01 {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("https://www.youtube.com");
	}

}
