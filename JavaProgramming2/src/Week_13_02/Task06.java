package Week_13_02;

public class Task06 {
	
	public static <T> Box_2<T> boxing(T t) {
		Box_2<T> box = new Box_2<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		Box_2<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box_2<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
