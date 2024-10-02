package Week_04;

public class Hometask11 {

	public static void main(String[] args) {
		Person_2 p1 = new Person_2();
		
		System.out.println("이름: " + p1.name);
		System.out.println();
		
		Person_2 p2 = new Person_2(23);
		
		System.out.println("이름: " + p2.name);
		System.out.println("나이: " + p2.age);
		System.out.println();
		
		Person_2 p3 = new Person_2(26, "여자", 54);
		
		System.out.println("이름: " + p3.name);
		System.out.println("나이: " + p3.age);
		System.out.println("몸무게: " + p3.weight);
		System.out.println();
		
		Person_2 p4 = new Person_2(23, "남자", 80, 168);
		
		System.out.println("이름: " + p4.name);
		System.out.println("나이: " + p4.age);
		System.out.println("몸무게: " + p4.weight);
		System.out.println("키: " + p4.height);
	}

}
