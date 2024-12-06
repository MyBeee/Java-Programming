package Week_14_03;

public class Sample {

	public static void main(String[] args) {
		Person_2 person = new Person_2();
		
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}

}
