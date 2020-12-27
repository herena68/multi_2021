package algo_1_sds;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 8. 서로 다른 두 자연수 사이의 합계 알고리즘
		//단, 합계는 작은 수에서 큰 수로 1씩 증가 시키며 구한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 자연수를 입력하세요..");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = 0;
		if(a > b) {
            int temp = a;
            a = b;
            b = temp;
		}
		
        for(int i=a;i<=b;i++) {
           sum += i;
        }
        
        System.out.println(sum);
         

	}

}
