package Week_04;

public class Pet_2 {
	String pet = "고양이";
	String name;
	int age;
	int weight;
	int height;
	
	Pet_2() {}
	
	Pet_2(String name) {
		this.name = name;
	}
	
	Pet_2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Pet_2(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	Pet_2(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
}
