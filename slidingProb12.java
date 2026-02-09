package com.sliding;

public class slidingProb12 {
	public static void countdivbyk(int [] arr,int k,int x) {
		int i = 0, j = 0;
		int sum = 0;
		int count = 0;
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum%x==0) {
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
		int [] arr = {2,4,6,1,3};
		int k = 2;
		int x = 4;
		countdivbyk(arr, k,x);

	}

}
