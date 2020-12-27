package ex;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 6, 3, 9, 1, 5 };
		System.out.println(Arrays.toString(n));
		int count = 0;
		for (int i = 0; i < n.length - 1; i++) {
			int mindex = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[mindex] > n[j]) {
					mindex = j;
				}
			}
			if (mindex != i) {
				int temp = n[i];
				n[i] = n[mindex];
				n[mindex] = temp;
				count++;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(n));
	}

}
