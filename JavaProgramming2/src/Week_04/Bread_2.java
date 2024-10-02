package Week_04;

public class Bread_2 {
	String name = "모카빵";
	int count;
	int kcal;
	int price;
	
	Bread_2() {}
	
	Bread_2(int count) {
		this.count = count;
	}
	
	Bread_2(int count, int kcal) {
		this.count = count;
		this.kcal = kcal;
	}
	
	Bread_2(int count, int kcal, int price) {
		this.count = count;
		this.kcal = kcal;
		this.price = price;
	}
}
