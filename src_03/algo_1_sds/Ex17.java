package algo_1_sds;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		//17. 10진 자연수의 2진수, 8진수 변환 알고리즘
		//예제) 임의의 10진 자연수 N을 입력받아 2진수로 변환하여 출력하는 순서도를 작성하라.
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요..");
		int n = scanner.nextInt();
		
		int digit = 2;
		
		int[] a = new int[10];
		int idx=0;
		
		while(true) {
			a[idx++] = n% digit ;
			n= n/digit;
			if(n==0) break;
		}
        for(int i=idx; i>=0;i--) {
        	System.out.print(a[i]);
        }
	}

	
}
