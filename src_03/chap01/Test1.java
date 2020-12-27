package chap01;

public class Test1 {

	public static void main(String[] args) {
        for(int i=0;i<16;++i) {
	         System.out.printf("%d => ",i);
	         System.out.printf("%d ",i & 1<<0);
	         System.out.printf("%d ",i & 1<<1);
	         System.out.printf("%d ",i & 1<<2);
	         System.out.printf("%d ",i & 1<<3);
	         System.out.println();
        }
        
		int used = 0;
        for(int i=0;i<6;++i) {

            System.out.printf("used= %s , %s  %n",used,used & (1 << i));
            used = used | (1 << i);
           // System.out.println(used | (1 << i));
            System.out.println("-----------");
        }
	}

}
