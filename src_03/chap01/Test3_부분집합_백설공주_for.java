package chap01;

import java.util.ArrayList;
import java.util.List;

//진행 방법 : 소회의실로 보내기   정올 1810 문제풀기 
//==> 제일먼저 pass한 사람이 조원들에게 풀이과정 간단하게 설명 

public class Test3_부분집합_백설공주_for {
	public static void main(String[] args) {
		int[] c = {7,8,10,13,15,19,20,23,25};
		System.out.printf("주준집합갯수  :  %d %n",1 << c.length );
        print(c,c.length);
	}
	public static void print(int[] c , int n) {
        for(int i=0;i<(1<<n);++i) {
        	List<Integer> r = new ArrayList<Integer>();
        	int sum = 0;
        	if(count(i)==7) {
	            for(int j=0;j<n;++j) {
	            	if((i & (1 << j)) != 0) {
	            		r.add(c[j]);
	            		sum += c[j];
	            	}
	            }
	        	if(sum == 100) { System.out.println(r);}
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
    	for(int i=0;i<9;i++) {
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