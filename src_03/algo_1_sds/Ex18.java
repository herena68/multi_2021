package algo_1_sds;

public class Ex18 {

	public static void main(String[] args) {
		//18. 최대값, 최소값 구하기 알고리즘
		//예제) 배열 A(5)에 기억된 70, 60, 90, 80, 50의 5개의 수들 중에서 가장 큰 수를 구하는 순서도		
		
		int[] a = {70, 60, 90, 80, 50};
		int max = a[0];
		
		for(int i =1;i<a.length;i++) {
			if(a[i] > max ) max = a[i] ;
		}
		System.out.println(max);
	}

	
}
