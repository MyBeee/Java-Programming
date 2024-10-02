package Week_04;

public class Task08 {

	public static void main(String[] args) {
		Car_4 car1 = new Car_4("자가용");
		
		System.out.println("car2.company: " + car1.company);
		System.out.println("car2.model: " + car1.model);
		System.out.println();
		
		Car_4 car2 = new Car_4("자가용", "빨강");
		
		System.out.println("car3.company: " + car2.company);
		System.out.println("car3.model: " + car2.model);
		System.out.println("car3.color: " + car2.color);
		System.out.println();
		
		Car_4 car3 = new Car_4("택시", "검정", 200);
		System.out.println("car4.company: " + car3.company);
		System.out.println("car4.model: " + car3.model);
		System.out.println("car4.color: " + car3.color);
		System.out.println("car4.maxSpeed: " + car3.maxSpeed);
	}

}
