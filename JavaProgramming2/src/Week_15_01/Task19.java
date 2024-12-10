package Week_15_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task19 {

	public static void main(String[] args) {
		List<Student_1> totalList = new ArrayList<>();
		
		totalList.add(new Student_1("홍길동", "남", 92));
		totalList.add(new Student_1("김수영", "여", 87));
		totalList.add(new Student_1("감자바", "남", 95));
		totalList.add(new Student_1("오해영", "여", 93));
		
		Map<String, List<Student_1>> map = totalList.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
						);
		
		List<Student_1> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student_1> femaleList = map.get("여");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
	}

}
