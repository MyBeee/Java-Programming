package Week_15_02;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Task13 {

	public static void main(String[] args) {
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.printf(" %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
		ps.printf(" %6d | %-10s | %10s | \n", 2, "감자바", "학생");
		
		ps.flush();
		ps.close();
	}

}
