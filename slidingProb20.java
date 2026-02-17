package com.sliding;

import java.util.ArrayList;
import java.util.List;

public class slidingProb20 {
	public static void square(int [] arr, int k) {
	int i = 0, j = 0;
	int sum = 0;
	int max = Integer.MIN_VALUE;
	int startIndex = 0;
	List<Integer> list = new ArrayList<>();
		
		while(i<arr.length) {
			int square = arr[i]*arr[i];
			sum += square;
			if(i-j+1<k) {
				i++;
			} else {
				if(sum>max) {
					max = sum;
					startIndex = j;
				}
				sum -= arr[j]*arr[j];
				i++;
				j++;
			}	
		}
		for(int a=startIndex; a<startIndex+k;a++) {
			list.add(arr[a]);
		}
		System.out.println(list);
		System.out.println(max);
	}
	public static void main(String[] args) {
	int [] arr = {2,4,5,6,3};
	int k = 3;
	square(arr, k);

	}

}
