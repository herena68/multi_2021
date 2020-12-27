package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lamda_02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		
		list.forEach( i ->	System.out.print(i+" "));
		System.out.println();
		
		list.removeIf(i -> i%2==0);
		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		list.replaceAll(i -> i*10);
		list.forEach(i -> System.out.print(i+" "));
		System.out.println();
	}
}
