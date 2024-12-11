package Week_15_02;

import java.io.*;

public class Task11 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new FileReader("src/Week_15_02/Task11.java")
				);
		
		int lineNo = 1;
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close();
	}

}
