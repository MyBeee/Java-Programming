package Week_12_02;

public class Task06 {

	public static void main(String[] args) {
		Car_4 car1 = new Car_4();
		System.out.println("car1.company : " + car1.comapny);
		System.out.println();
		
		Car_4 car2 = new Car_4("자가용");
		System.out.println("car2.company : " + car2.comapny);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car_4 car3 = new Car_4("자가용", "빨강");
		System.out.println("car3.company : " + car3.comapny);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car_4 car4 = new Car_4("택시", "검정", 200);
		System.out.println("car4.company : " + car4.comapny);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
