package Week_15_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		Stream<String> paralle1Stream = list.parallelStream();
		paralle1Stream.forEach( name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
