package Week_13_02;

public class CarAgency implements Rentable<Car_1> {
	@Override
	public Car_1 rent() {
		return new Car_1();
	}
}
