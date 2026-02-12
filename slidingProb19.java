package com.sliding;

// count the subarray of firsthalf > secondhalf

public class slidingProb19 {
	public static void countfs(int [] arr, int k) {
		int i = 0, j = 0;
		int count = 0;
		int Firsthlf = 0,Secondhlf = 0;
		int half = k/2;
		while(i<arr.length) {
			if(half-1==i) {
			 Firsthlf = arr[half] + arr[i];
			}
			if(half == i) {
				return;
			}
			if(half+1==i) {
			 Secondhlf = arr[half] + arr[i];
			}
			if(i-j+1<k) {
				i++;
			}else {
				if(Firsthlf>Secondhlf) {
					count++;
				}
				i++;
				j++;
			}
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		int [] arr = {4,2,3,8,5,6};
		int k = 3;
		countfs(arr,k);
	}

}
