package Week_15_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task04 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		for(int i=1; i<=5; i++) {
			Product product = new Product(i, "상품" + i, "멋진회사", (int)(10000*Math.random()));
			list.add(product);
		}
		
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
