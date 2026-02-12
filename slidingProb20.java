package com.sliding;

public class slidingProb20 {
	public static void square(int [] arr, int k) {
	int i = 0, j = 0;
	int sum = 0;
	int max = Integer.MIN_VALUE;
		
		while(i<arr.length) {
			int square = arr[i]*arr[i];
			sum += square;
			if(i-j+1<k) {
				i++;
			} else {
				if(sum>max) {
					max = sum;
				}
				sum -= arr[j]*arr[j];
				i++;
				j++;
			}	
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
	int [] arr = {2,4,5,6,3};
	int k = 3;
	square(arr, k);

	}

}
