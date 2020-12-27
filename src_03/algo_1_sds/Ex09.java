package algo_1_sds;

public class Ex09 {

	public static void main(String[] args) {
		 // 9. 순차적 부호변환 합산 알고리즘
		//예제) 1-2+3-4+5-6+7-8+9의 결과를 구하는 순서도를 작성하라
		int sum = 0;
		int num = 9;
        for(int i=1;i<=num;i++) {
           int t = i;	
           if(t % 2 == 0) {
        	   t = -1 * t;
           }
           sum += t;
        }
        
        System.out.println(sum);

	}

}
