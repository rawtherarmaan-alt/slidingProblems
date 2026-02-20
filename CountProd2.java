package com.sliding;

public class CountProd2 {
	public static void coundOdd(int [] arr, int k) {
		int i = 0, j = 0;
		int sum = 0;
		int oddcount = 0;
		while(i<arr.length) {
		if(arr[i]%2!=0) {
			oddcount++;
		}
		if(i-j+1==k) {
			sum += oddcount;
			System.out.println(oddcount);
			
			if(arr[j]%2!=0) {
				oddcount--;
			}
			j++;
		}
		i++;
		}
		System.out.println("Total odd numbers = "+sum);
	}
	
	public static void main(String[] args) {
		int [] arr = {12,3,5,1,4,6};
		int k = 3;
		coundOdd(arr, k);
	}

}
