package algo_1_sds;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//16. 소수 알고리즘
		//예제) 자연수 N을 입력받아 소수여부를 출력하는 순서도를 작성하라.
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요..");
		int n = scanner.nextInt();
		
		String res = "소수아님";
        for(int i=2; i<n;i++) {
        	if(n % i == 0) {
        		res = "소수";
        		break;
        	}
        }
        System.out.printf("%d => %s",n,res);
        System.out.println("=============  고민 ?========================");
	}

	
}
