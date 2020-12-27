package ex;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		long start;
        long end;
        Integer[] data = new Integer[100000];
        for(int i=0;i<data.length;i++) {
        	data[i] = (int) (Math.random()+100000);
        }
        
		//String[] data = {"g","k","a","m","z","p","t","y"};
		
		/*Account[] data = {
		   new Account("2017-1", 900),		
		   new Account("2018-7", 9000),		
		   new Account("2011-9", 100),		
		   new Account("2010-1", 80),		
		   new Account("2018-9", 1111100)		
		};*/
		
        start = System.currentTimeMillis();
        Sort.bubbleSort(data);
        end = System.currentTimeMillis();
        System.out.println("bubbleSort : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.selectionSort1(data);
        end = System.currentTimeMillis();
        System.out.println("selectionSort1 : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.selectionSort2(data);
        end = System.currentTimeMillis();
        System.out.println("selectionSort2 : "+(end-start)+" ms");
        
        start = System.currentTimeMillis();
        Sort.insertionSort(data);
        end = System.currentTimeMillis();
        System.out.println("insertionSort : "+(end-start)+" ms");
        

		//System.out.println(Arrays.toString(data));
        Sort.temp = new Comparable[data.length];
		start = System.currentTimeMillis();
		Sort.mergeSort(data, 0, data.length-1);
        end = System.currentTimeMillis();
        System.out.println("mergeSort : "+(end-start)+" ms");
       // System.out.println(Arrays.toString(data));
	}
}








