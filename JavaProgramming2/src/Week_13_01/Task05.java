package Week_13_01;

public class Task05 {

	public static void main(String[] args) {
		Member_1 m = new Member_1("winter", "눈송이", 25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());
		System.out.println();
		
		Member_1 m1 = new Member_1("winter", "눈송이", 25);
		Member_1 m2 = new Member_1("winter", "눈송이", 25);
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hashCode(): " + m2.hashCode());
		System.out.println("m1.equals(m2): " + m1.equals(m2));
	}

}
