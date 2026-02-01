package com.sliding;

public class slidingProb4 {
	public static void Average(int [] arr, int k) {
		int i = 0;
		int j = 0;
		int sum = 0 ;
		float aver = 0;
		//int minValue = Integer.MAX_VALUE;
		
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				//minValue = Math.min(minValue, sum);
				aver = (float)sum/k;
				System.out.println(aver);
				sum -= arr[j];
				i++;
				j++;
			}
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int [] arr = {6,6,5,1,2,3};
		int k = 3;
		Average(arr, k);
	}

}
