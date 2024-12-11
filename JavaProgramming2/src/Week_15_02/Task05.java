package Week_15_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Task05 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read();
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
