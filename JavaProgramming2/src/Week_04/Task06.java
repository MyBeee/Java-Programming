package Week_04;

public class Task06 {

	public static void main(String[] args) {
		Korean_1 k1 = new Korean_1("박자바", "011225-1234567");
		
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println();
		
		Korean_1 k2 = new Korean_1("김자바", "930525-0654321");
		
		System.out.println("k2.nation:" + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
	}

}
