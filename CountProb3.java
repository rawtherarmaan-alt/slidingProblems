package com.sliding;

public class CountProb3 {
	public static void countnegative(int [] arr, int k) {
		int i = 0, j = 0;
		int sum = 0;
		int negcount = 0;
		while(i<arr.length) {
		if(arr[i]<0) {
			negcount++;
		}
		if(i-j+1==k) {
			sum += negcount;
			System.out.println(negcount);
			
			if(arr[j]<0) {
				negcount--;
			}
		 j++;
		}
		i++;
		}
		System.out.println("Total negative numbers = "+sum);
	}
	public static void main(String[] args) {
		int [] arr = {12,-3,5,-1,4,-6};
		int k = 3;
		countnegative(arr, k);
	}

}
