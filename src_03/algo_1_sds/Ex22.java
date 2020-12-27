package algo_1_sds;

import java.util.Arrays;

public class Ex22 {

	public static void main(String[] args) {
		//22. 선택정렬(Selection Sort) 알고리즘
		//예제) 배열 A에 기억된 N건의 자료를 선택정렬을 이용하여 오름차순 정렬하는 순서도를 작성하라
		
		int[] t = {70,341,110,30, 60, 90, 80, 50,167,456};
		System.out.println(Arrays.toString(t));
		for(int i =0;i<t.length-1;i++) {
			for(int j =i+1;j<t.length;j++) {
				if(t[i] > t[j]) {
					int temp = t[i];
					t[i] = t[j];
					t[j] = temp;
				}
 
			}
		}
		System.out.println(Arrays.toString(t));
		System.out.println("-----------------------");
		int[] t1 = {70,341,110,30, 60, 90, 80, 50,167,456};
		System.out.println(Arrays.toString(t1));

		int min = 9999;
		for(int i =0;i<t1.length-1;i++) {
			min = i;
			for(int j =i+1;j<t1.length;j++) {
				if(t1[min] > t1[j]) {
					min = j;
				}
			}
			if(i != min) {
				int temp = t1[i];
				t1[i] = t1[min];
				t1[min] = temp;
			}
		}
		System.out.println(Arrays.toString(t1));

	}

	
}
