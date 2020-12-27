package lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Lamda_04 {

	public static void main(String[] args) {
		String[] names = {"hong","kim","park","lee"};
		List<String> list = Arrays.asList(names);

		list.forEach(name -> System.out.print(name+" "));
		System.out.println();
		
		Stream<String> stream = list.stream();
		
		//stream.sorted().forEach(name -> System.out.print(name+" "));
		//stream.sorted().forEach( System.out::println);

		
		stream.filter(name -> name.equals("lee")||name.equals("kim")).forEach( System.out::println);
	}
}
