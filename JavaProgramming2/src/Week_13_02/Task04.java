package Week_13_02;

public class Task04 {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car_1 car = carAgency.rent();
		car.run();
	}

}
