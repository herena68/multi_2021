package chap01;

public class Test2 {

	public static void main(String[] args) {
        for(int i=-5;i<6;++i) {
        	System.out.printf("%3d=",i);
            print(i);
        	System.out.println();
        }
        
        System.out.println(1<<4);
	}

	public static void print(int n) {
        for(int i=7;i>=0;--i) {
        	if((n & (1 << i)) != 0) System.out.printf("1");
        	else System.out.printf("0");
        }
	}
}
