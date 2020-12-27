package algo_1_sds;

public class Ex10 {

	public static void main(String[] args) {
		// 10. 부분합계의 누적 알고리즘
		//예제) 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)의 결과를 구하는 순서도를 작성하라
		int sum = 0;
		int total = 0;
        for(int i=1;i<=5;i++) {
           sum += i;
           total += sum;
        }
        
        System.out.println(total);

	}

}
