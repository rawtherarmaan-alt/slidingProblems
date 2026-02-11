package com.sliding;

public class slidingProb17 {
	public static void minskipPos(int [] arr, int k) {
		int i = 0, j = 0;
		int sum = 0;
		//int max = 0;
		int min = Integer.MAX_VALUE;
		int a = 0;
		while(i<arr.length) {
			if(arr[i]<0) {
			sum += arr[i];
			}
			if(i-j+1<k) {
				i++;
			}else {
				if(sum<min) {
					min = sum;
					a = j;
				} 
				if(arr[j]<0) {
				sum -= arr[j];
				}
				i++;
				j++;
			}
		} 
		
		System.out.println(min);
		for(int x=a; x<a+k;x++) {
			System.out.print(arr[x]+" ");
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,10,4,8,1,2,3};
		int k = 3;
		minskipPos(arr, k);
	}
}
