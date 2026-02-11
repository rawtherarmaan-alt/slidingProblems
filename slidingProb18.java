package com.sliding;

public class slidingProb18 {
	public static void maxskipnegPos(int [] arr, int k) {
		int i = 0, j = 0;
		int sum = 0;
		int max = 0;
		int a = 0;
		while(i<arr.length) {
			if(arr[i]>0) {
			sum += arr[i];
			}
			if(i-j+1<k) {
				i++;
			}else {
				if(sum>max) {
					max = sum;
					a = j;
				} 
				if(arr[j]>0) {
				sum -= arr[j];
				}
				i++;
				j++;
			}
		} 
		System.out.println(max);
		for(int x=a; x<a+k;x++) {
			System.out.print(arr[x]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int [] arr = {-1,13,8,-8,10,21,-3};
		int k = 3;
		maxskipnegPos(arr, k);

	}

}
