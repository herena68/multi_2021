package algo_1_sds;

public class Ex12 {

	public static void main(String[] args) {
		DT[1]=1;
		DT[2]=1;
		//12. 피보나치수열 알고리즘
		//예제) 1+1+2+3+5+8+13+21+34의 결과를 구하는 순서도를 완성하라.
		int a = 1,b=1,t=2 , c=0;
        for(int i=1; ;i++) {
        	c= a+b;
        	t = t+c;
        	a=b;
        	b=c;
        	if(c >= 34) break;  
        }
        System.out.println(t);
        
        System.out.println("==========================");
//        System.out.println(f(9));
        int sum = 0;
        for(int i=1; ;i++) {
        	sum += f(i);
        	if(f(i) == 34) break;  //100으로 변환하면 수행 시간이 ~~~ 
        }
        System.out.println(sum);
        
        System.out.println("==========================");

        int ss = 0;
        for(int i=1; ;i++) {
        	ss += ff(i);
        	if(ff(i) == 34) break;
        }
        System.out.println(ss);
	}

	public static int f(int n) {
		if(n<=2)
			return 1;
		return f(n-1)+f(n-2);
	}
	/*f(int n) ==>  값이 1증가할 때마다 시간은 약 1.6배씩 증가한다. 이 알고리즘
	에서 100을 입력으로 하면 대략 26,000년의 시간이 걸린다. 이 알고리즘의 효율이 어느 정
	도 인지 알 수 있다*/
	
	//동적 알고 리즘      dt[n] = n번째 피보나치 수
	static int[] DT= new int[100001];

	public static int ff(int n) {
		if(n<=2)
			return 1;
		if(DT[n]==0) DT[n]=ff(n-1)+ff(n-2);
		return DT[n];
	}
}
