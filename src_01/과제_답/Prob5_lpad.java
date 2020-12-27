package ex;

public class Prob5 {
    
	public static String leftPad(String str, int size, char padChar) {
		 if(str.length() >= size) {
			 return str;
		 }
		 StringBuilder sb = new StringBuilder();
		 int cnt = size - str.length();
		 for(int i=0;i<cnt;i++) {
			 sb.append(padChar);
			 //str = padChar+str;
		 }
		 sb.append(str);
         return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(leftPad("SDS", 6, '#'));
		System.out.println(Prob5.leftPad("SDS", 5, '$'));
		System.out.println(Prob5.leftPad("SDS", 2, '&'));
	}

	public static void main(String[] args) {
		Prob5 p = new Prob5();
		Prob5 p1 = new Prob5();
		Prob5 p2 = new Prob5();
		
		System.out.println(p.leftPad("SDS", 6, '#')) ;
		System.out.println(p1.leftPad("SDS", 5, '$')) ;
		System.out.println(p2.leftPad("SDS", 2, '&')) ;

	}


}
