package Week_07_02;

public class Task01 {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
	}

}
