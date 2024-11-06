package Week_10_02;

public class Task05 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}

}
