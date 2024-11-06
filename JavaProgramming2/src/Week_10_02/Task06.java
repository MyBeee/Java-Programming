package Week_10_02;

public class Task06 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus_1 bus = new Bus_1();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
