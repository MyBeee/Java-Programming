package Week_13;

public class Task04 {

	public static void main(String[] args) {
		Car_3 car1 = new Car_3("자가용");
		System.out.println("car1.company : " + car1.comapny);
		System.out.println("car1.model : " + car1.model);
		System.out.println();
		
		Car_3 car2 = new Car_3("자가용", "빨강");
		System.out.println("car2.company : " + car2.comapny);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car_3 car3 = new Car_3("택시", "검정", 200);
		System.out.println("car3.company : " + car3.comapny);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
	}
}
