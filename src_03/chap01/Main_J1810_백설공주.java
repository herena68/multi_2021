package chap01;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

// 문제은행 : 백설공주
/*
7
8
10
13
15
19
20
23
25
*/
public class Main_J1810_백설공주 {   //부분집합의 합을 구하는 문제    백트랭키    가지치기 

	static int[] data = new int[9];
	static boolean[] V = new boolean[9];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/1810.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		sc=null;
		//System.out.println(Arrays.toString(data));
		
		solve(0,0,0);
	}

	private static void solve(int idx, int cnt, int sum) {
		if(sum > 100) return;
		if(cnt==7 && sum==100) {
			//System.out.println(Arrays.toString(V));
			for(int i=0;i < data.length;i++) {
				if(V[i]) System.out.println(data[i]);
			}
            System.exit(0);
		}
		if(cnt==7||idx==9) {
			//System.out.println("~~~");
			return;
		}
		
        V[idx] =true;
		solve(idx+1, cnt+1, sum+data[idx]);
		
		V[idx] =false;
		solve(idx+1, cnt, sum);
	}
	
	
}


/*
일곱난장이와 백설공주의 일과는 매일 같다. 
일곱난장이는 일하러 가고 백설공주는 7명분의 식사를 준비한다. 
그런데 어느 날 9명의 난장이가 왔다. 2명의 난장이는 가족이 아니므로 골라내야 한다.

어떻게 할 까 고민하던 공주에게 기막힌 생각이 떠올랐다.
난장이들은 모자에 번호를 써서 다니는데 백설공주의 일곱난장이들의 번호의 합은 정확히 100이었다. 

따라서 9명의 난장이들 중에 모자에 적힌 번호의 합이 100이 되는 7명을 고르면 되는 것이다.

공주를 도와 7명을 고르는 프로그램을 작성해보자.




*/