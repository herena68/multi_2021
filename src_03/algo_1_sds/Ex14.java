package algo_1_sds;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//14. 약수 알고리즘
		//예제) 자연수 N을 입력받아 약수를 구하는 순서도를 작성하라.
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요..");
		int n = scanner.nextInt();
		
        for(int i=1; i<=n;i++) {
        	if(n % i == 0) System.out.printf("%d ",i); 
        }
	}

	
}
