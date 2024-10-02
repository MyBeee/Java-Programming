package Week_04;

public class Person_2 {
	String name = "정재원";
	int age;
	String sex;
	int weight;
	int height;
	
	Person_2() {}
	
	Person_2(int age) {
		this.age = age;
	}
	
	Person_2(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	Person_2(int age, String sex, int weight) {
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	
	Person_2(int age, String sex, int weight, int height) {
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
	}
}
