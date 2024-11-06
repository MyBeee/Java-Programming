package Week_10_02;

public class Task07 {

	public static void main(String[] args) {
		Taxi_1 taxi = new Taxi_1();
		Bus_2 bus = new Bus_2();
		
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	public static void ride(Vehicle_2 vehicle) {
		if(vehicle instanceof Bus_2 bus) {
			bus.checkFare();
		}
	}
}
