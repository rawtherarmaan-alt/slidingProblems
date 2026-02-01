package com.sliding;

public class slidingProb5 {
	public static void countgrea(int [] arr, int k,int x) {
		int i = 0;
		int j = 0;
		int sum = 0 ;
		int count = 0;
		
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum>x) {
					count++;
				}
				sum -= arr[j];
				i++;
				j++;
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int [] arr = {3,1,2,1,4,3};
		int k = 3;
		int x = 5;
		countgrea(arr, k, x);
	}

}
