package Week_15_01;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task06 {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get(Task06.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}

}
