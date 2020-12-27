package chap01;

public class Test3_부분집합2 {
	public static void main(String[] args) {
		char[] c = {'A','B','C','D'};
        print(c,c.length);
	}
	public static void print(char[] c , int n) {
        for(int i=0;i<(1<<n);++i) {
        	if(count(i)==2) {
	        	System.out.printf("{");
	            for(int j=0;j<n;++j) {
	            	if((i & (1 << j)) != 0) System.out.printf("%s ",c[j]);
	            }
	        	System.out.printf("}%n");
        	}
        }
	}
	public static int count(int value) {
		int count = 0;
        while (value > 0) {
			if((value & 1) == 1) count++;
			value = value >> 1;
		}
        return count;
	}
	static int bitCount(int value){
    	int count = 0;
    	for(int i=0;i<8;i++) {
    		int t = (value & 1<<i) >0?1:0;
    		count = count+t;
    	}
    	return count;
    }
}
/*            i           1<<j
 * 0        0000          0001
 * 1        0001          0010
 * 2        0010          0100
 * 3        0011          1000
 * 4        0100
 * 5        0101
 * 6        0110
 * 7        0111
 * 8        1000
 * 9        1001
 * 10       1010
 * 11       1011
 * 12       1100
 * 13       1101
 * 14       1110
 * 15       1111
 */