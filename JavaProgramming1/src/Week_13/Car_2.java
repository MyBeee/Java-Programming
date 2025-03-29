package Week_13;

public class Car_2 {
	String comapny = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_2() {}
	Car_2(String model) {
		this.model = model;
	}
	Car_2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car_2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
