package Week_13_02;

public class Task05 {

	public static void main(String[] args) {
		Box_1 box1 = new Box_1();
		box1.content = "100";
		
		Box_1 box2 = new Box_1();
		box2.content = "100";
		
		Box_1 box3 = new Box_1();
		box3.content = 100;
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1: " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("result2: " + result2);
	}

}
