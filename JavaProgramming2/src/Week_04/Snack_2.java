package Week_04;

public class Snack_2 {
	String kind = "대용량";
	String name;
	int count;
	int price;
	
	Snack_2() {}
	
	Snack_2(String name) {
		this.name = name;
	}
	
	Snack_2(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	Snack_2(String name, int count, int price) {
		this.name = name;
		this.count = count;
		this.price = price;
	}
}
