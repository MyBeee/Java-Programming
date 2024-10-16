package Week_07_02;

public class Task02 {

	public static void main(String[] args) {
		Parent_1 parent = new Child_1();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child_1 child = (Child_1) parent;
		
		child.field2 = "data2";
		child.method3();
	}

}
