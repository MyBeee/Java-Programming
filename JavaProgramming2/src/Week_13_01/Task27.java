package Week_13_01;

public class Task27 {

	public static void main(String[] args) {
		Class clazz = Car_2.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
