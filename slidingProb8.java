package com.sliding;

public class slidingProb8 {
	public static void equaltocount(int [] arr, int k, int x) {
		int i = 0, j = 0 ;
		int sum = 0;
		//int maxElement = Integer.MIN_VALUE;
		int count = 0;
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			} else {
				if(sum==x) {
					
					count++;
					//System.out.println(count);
				}
				
				sum -= arr[j];
				
				i++;
				j++;
				
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		int [] arr = {2,3,3,2,3,1,4};
		int k = 3;
		int x = 8;
		equaltocount(arr, k, x);
		
	}

}
