package Week_14_03;

public class MethodExcample {

	public static void main(String[] args) {
		Person_1 person = new Person_1();
		
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		
		person.action(com :: instanceMethod);
	}
}
