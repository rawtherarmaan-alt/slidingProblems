package com.sliding;

public class slidingProb23 {
	public static void minmaxgrtr_equX(int [] arr, int k , int x) {
		int i = 0, j = 0;
		//int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count = 0;
		while(i<arr.length) {
			if(i-j+1<k) {
				i++;
			} else {
				
//				int max = Integer.MIN_VALUE;
//				int min = Integer.MAX_VALUE;
				
				for (int a=j; a<=i; a++) {
					max = Math.max(max, arr[a]);
					min = Math.min(min, arr[a]);
				}
				
				
				if(max-min<=x) {
					count++;
				}
			
				i++;
				j++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int [] arr = {9,1,2,4,5,2,7};
		int k = 3;
		int x = 7;
		minmaxgrtr_equX(arr, k, x);
		
	}

}
