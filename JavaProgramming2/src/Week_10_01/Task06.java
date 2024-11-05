package Week_10_01;

public class Task06 {

	public static void main(String[] args) {
		Service service = new ServiceImplements();
		
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		service.staticMethod1();
		System.out.println();
		service.staticMethod2();
		System.out.println();
	}

}
