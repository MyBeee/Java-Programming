package Week_15_01;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}
	
}
