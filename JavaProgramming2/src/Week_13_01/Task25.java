package Week_13_01;

public class Task25 {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}

}
