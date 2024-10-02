package Week_04;

public class Car_3 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_3() {}
	Car_3(String model) {
		this.model = model;
	}
	Car_3(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car_3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
