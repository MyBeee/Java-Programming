package Week_04;

public class Car_4 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car_4(String model) {
		this(model, "은색", 250);
	}
	
	Car_4(String model, String color) {
		this(model, color, 250);
	}
	
	Car_4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
