package Week_12_02;

public class Car_5 {
	String comapny = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_5(String model) {
		this(model, "은색", 250);
	}
	Car_5(String model, String color) {
		this(model, color, 250);
	}
	Car_5(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
