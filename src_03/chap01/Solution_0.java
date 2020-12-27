package chap01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Solution_0 {
	static int t,r,c;
    static char[][] arr;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/1_1.txt"));
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		arr = new char[r][c];
		for(int i=0;i<r;++i) {
			String msg = sc.next();
			for(int j=0;j<c;++j)
				arr[i][j] = msg.charAt(j);
		}
		System.out.printf("%d\n%d %d%n",t,r,c);
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j)
			     System.out.printf("%c",arr[i][j]);
			System.out.println();
		}
		sc.close();
	}
}
/*
 10
 5 10
 0000000000
 0123456789
 0000000000
 0000000000
 0000000000
 
 
 */
