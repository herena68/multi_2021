package ex;

import java.util.StringTokenizer;

public class t {

	public static void main(String[] args) {

		String data = "java/900-90-90";
		StringTokenizer s = new StringTokenizer(data, "/-");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
		s = new StringTokenizer(data, "/-");
		while(s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}
	}

}
