package day02;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Test06_Scanner {
    static boolean[] V = null;
    static int[][] G = null;
    static int N = 0;
    static int E = 0;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/dfs.txt"));
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		G = new int[N][N];
		V=new boolean[N];
		
		E = sc.nextInt();
		for(int i=0;i<E;i++) {
			int a  = sc.nextInt();
			int b  = sc.nextInt();
			G[a][b] = G[b][a]=1;   //인접 행렬로 표시 
		}
		for(int i=0;i<N;i++) {
           System.out.println(Arrays.toString(G[i]));
		}
		dfs(0);
	}

	static void dfs(int node) {
		V[node]=true;
		System.out.print(node+" ");
		for(int next = 0;next<N;next++) {
			if(!V[next] && G[node][next]!=0) dfs(next);
		}
	}
}

/*
 7 8
0 1 0 2 1 3 1 4 3 5 4 5 5 6 2 6

            0
           /  \
          1    2
         / \   |
        3   4  | 
         \ /   |      
          5  --6    
          
      
 */


