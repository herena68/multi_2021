package algo_1_sds;

public class Ex05 {

	public static void main(String[] args) {
		 // 5.  직삼각형 그래프 알고리즘
         char[][] a = new char[3][3];
         for(int i=0;i<a.length;i++) {
        	 for(int j=0;j<=i;j++) {
        		 a[i][j] = '*';
        	 }
         }
         
         for(int i=0;i<a.length;i++) {
        	 for(int j=0;j<a[i].length;j++) {
        		 System.out.printf("%c ",a[i][j]);
        	 }
        	 System.out.println();
         }

	}

}
