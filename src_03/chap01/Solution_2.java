package chap01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2{

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/1_1.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int t,r,c;
		char arr[][] = new char[100][100];
		t = Integer.parseInt(in.readLine());
		st = new StringTokenizer(in.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		for(int i=0;i<r;++i) {
			String msg = in.readLine();
			for(int j=0;j<c;++j) {
				arr[i][j] = msg.charAt(j);
			}
		}
		System.out.printf("%d%n%d %d %n",t,r,c);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
                System.out.printf("%c",arr[i][j]);
			}
			System.out.println();
		}
	}

}
