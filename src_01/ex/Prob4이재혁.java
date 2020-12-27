package ex;

import java.util.Arrays;

public class Prob4이재혁 {
	public static void main(String[] args) {
		int[] num = new int[6];
		int[] check = new int[46];
		for(int i=0; i<num.length; i++) {
			while(true) {
				int input=(int)(Math.random()*45+1);
				if(check[input]==0) {
					num[i]=input;
					check[input]=1;
					break;
				}
			}
		}		
		System.out.println(Arrays.toString(num));
		selctionSort(num);
		System.out.println(Arrays.toString(num));
	}
	public static int[] selctionSort(int[] arr) {
		int min=0;
		int changeIdx=0;
		boolean c= false;
		for(int i=0; i<arr.length; i++) {
			min=arr[i];
			for(int j=i+1; j<arr.length; j++) {					
				if(min>arr[j]) {
					min=arr[j];
					changeIdx=j;
					c=true;
				}
			}
			if(c==true) {
				swap(arr,i,changeIdx);	
				c=false;
			}
			
		}	
		
		return arr;
	}
	public static int[] swap(int[] arr,int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		return arr;
	}

}
