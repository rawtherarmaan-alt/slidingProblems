package com.sliding;

public class slidingProb1 {
	public static void maxSum(int [] arr, int k) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int maxValue = Integer.MIN_VALUE;
		
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				maxValue = Math.max(maxValue, sum);
				sum -= arr[j];
				i++;
				j++;
				
			}
			
		}
		System.out.println(maxValue);
	}
	
	
	public static void main(String[] args) {
		int [] arr = {2,1,5,1,3,2};
		int k = 3;
		slidingProb1.maxSum(arr, k);
		
	}

}
