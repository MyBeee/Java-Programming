package Week_14_03;

public class Person_2 {
	public Member getMember1(Creatable1 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id,  name);
		return member;
	}
}
