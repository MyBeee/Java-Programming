package Week_15_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Task14 {

	public static void main(String[] args) {
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = {1, 2, 3};
		
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close();
		fis.close();
		
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}