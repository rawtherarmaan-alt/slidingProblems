package com.sliding;

public class slidingProb3 {
	public static void minSum(int [] arr, int k) {
		int i = 0;
		int j = 0;
		int sum = 0 ;
		int minValue = Integer.MAX_VALUE;
		
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				minValue = Math.min(minValue, sum);
				sum -= arr[j];
				i++;
				j++;
			}
			
		}
		System.out.println(minValue);
	}

	public static void main(String[] args) {
		int [] arr = {2,1,5,1,2,3};
		int k = 3;
		minSum(arr, k);
	}

}
