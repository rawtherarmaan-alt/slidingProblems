package com.sliding;

public class slidingProb24 {
		public static void maxProdEle(int [] arr, int k) {
			int i = 0, j = 0;
			int sum = 1;
			int max = Integer.MIN_VALUE;
			while(i<arr.length) {
				sum *= arr[i];
				if(i-j+1<k) {
					i++;
				} else {
					max = Math.max(max, sum);
					sum /= arr[j];
				   i++;
				   j++;
				}
			}
			System.out.println(max);
		}
	public static void main(String[] args) {
		int [] arr = { -1, -2, -3, -4 };
		int k = 2;
		maxProdEle(arr, k);
	}

}
