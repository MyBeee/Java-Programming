package Week_06;

public class Car_1 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		Car_1 myCar = new Car_1();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car_1 myCar = new Car_1();
		
		myCar.speed = 60;
		myCar.run();
	}

}
