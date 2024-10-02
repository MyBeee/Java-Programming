package Week_04;

public class Hometask12 {

	public static void main(String[] args) {
		Pet_2 p1 = new Pet_2();
		
		System.out.println("종: " + p1.pet);
		System.out.println();
		
		Pet_2 p2 = new Pet_2("건이");
		
		System.out.println("종: " + p2.pet);
		System.out.println("이름: " + p2.name);
		System.out.println();
		
		Pet_2 p3 = new Pet_2("순이", 1);
		
		System.out.println("종: " + p3.pet);
		System.out.println("이름: " + p3.name);
		System.out.println("나이: " + p3.age);
		System.out.println();
		
		Pet_2 p4 = new Pet_2("건이", 1, 5);
		
		System.out.println("종: " + p4.pet);
		System.out.println("이름: " + p4.name);
		System.out.println("나이: " + p4.age);
		System.out.println("몸무게: " + p4.weight);
		System.out.println();
		
		Pet_2 p5 = new Pet_2("순이", 1, 6, 50);
		
		System.out.println("종: " + p5.pet);
		System.out.println("이름: " + p5.name);
		System.out.println("나이: " + p5.age);
		System.out.println("몸무게: " + p5.weight);
		System.out.println("키: " + p5.height);
	}

}
