package chap01;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_1{

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/1_1.txt"));
		Scanner sc = new Scanner(System.in);
		int t,r,c;
		char arr[][] = new char[100][100];
		t = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();

		for(int i=0;i<r;++i) {
			String msg = sc.next();
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
