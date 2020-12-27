package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test04_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<int[], Integer> f = new Function<int[], Integer>() {

			@Override
			public Integer apply(int[] t) {
				int sum =0;
				for(int i=0;i<t.length;i++) {
					sum += t[i];
				}
				return sum;
			}
		};

		Function<Integer, Integer> f2 =  t -> t * t;
		System.out.println(f2.apply(4));

		int[] i = {1,2,3,4,5,6,7};
		System.out.println(f.apply(i));
		List<Integer> list = new ArrayList<Integer>();
		
		Function<int[], Integer> f3 = (int[] t) -> {
				int sum =0;
				for(int j=0;j<t.length;j++) {
					sum += t[j];
				}
				return sum;
			
		};
		
		System.out.println(f3.apply(i));

	}

}
