package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sample01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("fff");
		list.add("heffflo");
		list.add("helffffo");
		list.add("hsssello");
		
		
		int sum = list.stream().filter(i -> i.length()>5).mapToInt(i->i.length()).sum();
		System.out.println(sum);
		
		int count = (int) list.stream().filter(i -> i.length()>5).count();
		System.out.println(count);

		Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(i -> (i%2==0))
		.forEach(i -> System.out.println(i));
		
		
		System.out.println("~~~");
	}

}

