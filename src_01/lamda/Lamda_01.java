package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lamda_01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		for(Integer data:list) {
			System.out.print(data+" ");
		}
		System.out.println();
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
		System.out.println();
		
		
		list.forEach(
			(Integer t) ->{
				System.out.print(t+" ");
			}
		);
		System.out.println();
		list.forEach( i ->	System.out.print(i+" "));
		list.forEach( System.out::print);

	}
}
