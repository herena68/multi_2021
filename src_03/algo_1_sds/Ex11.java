package algo_1_sds;

public class Ex11 {

	public static void main(String[] args) {
		// 11. 펙토리얼 알고리즘
		//예제) 5!(1×1×2×3×4×5)의 결과를 구하는 순서도를 작성하라.
		int f = 1;
        for(int i=1;i<=5;i++) {
           f *= i;
        }
        System.out.println(f);
        System.out.println("------------");
        System.out.println(f(5));

	}

	public static int f(int n) {
		if(n == 1) {
			return 1;
		}
		return n*f(n-1);
	}
	
}
