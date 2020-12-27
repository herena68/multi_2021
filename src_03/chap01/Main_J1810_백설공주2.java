package chap01;

import java.util.Arrays;


public class Main_J1810_백설공주2 {   //부분집합의 합을 구하는 문제    백트랭키    가지치기 

	static int[] data = {1,2};
	static boolean[] V = new boolean[2];

	public static void main(String[] args) throws Exception {
		solve(0,0);
	}

	private static void solve(int idx, int cnt) {
		if(cnt==2||idx==2) {
			System.out.println(Arrays.toString(V));
			return;
		}
        V[idx] =true;
		solve(idx+1, cnt+1);
		
		V[idx] =false;
		solve(idx+1, cnt);
	}
	
	
}
