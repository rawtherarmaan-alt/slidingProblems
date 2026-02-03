package com.sliding;

import java.util.ArrayList;
import java.util.List;

public class slidingProb6 {
	public static void equalsub(int [] arr, int k,int x) {
		int i = 0;
		int j = 0;
		int sum = 0 ;
		//int count = 0;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum==x) {
					System.out.println(sum);
					for(int m=j;m<=i;m++) {
						list.add(arr[m]);
					}
					
					System.out.println(list);
					break;
				}
				sum -= arr[j];
				i++;
				j++;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {3,1,2,1,2,3};
		int k = 3;
		int x = 6;
		equalsub(arr, k, x);
	}

}
