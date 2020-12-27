package algo_1_sds;

public class Ex19 {

	public static void main(String[] args) {
		//19. 특정 수와 가장 가까운 수 구하기 알고리즘
		//예제 배열에 저장된 개의 정수 중에서 ) 10 10에 가장 가까운 수를 출력하는 순서도를 작성하라..
		//단, 배열에 기억된 정수는 500이하이다.
		
		int[] t = {70,341,110,30, 60, 90, 80, 50,167,456};
		int m = 500;
		int c = 0;
		int res = 0;
		for(int i =1;i<t.length;i++) {
			c = t[i]>10? t[i] - 10 :10-t[i]  ;
			if(m > c) {
				m=c;
				res = t[i];
			}
		}
		System.out.println(res);
		
	}

	
}
