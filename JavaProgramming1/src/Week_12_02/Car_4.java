package Week_12_02;

public class Car_4 {
	String comapny = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_4() {}
	Car_4(String model) {
		this.model = model;
	}
	Car_4(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car_4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
