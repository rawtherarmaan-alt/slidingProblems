package com.sliding;

public class slidingProb21 {
	public static void weightedSumMax(int [] arr, int k) {
		int i = 0, j = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		while(i<arr.length) {
			
			sum += max;
			
			if(i-j+1<k) {
				i++;
			} else {
				if(sum>max) {
					max = sum;
				}
				i++;
				j++;
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int [] arr = {3,4,5,5,2,7};
		int k = 3;
		weightedSumMax(arr, k);
	}

}
