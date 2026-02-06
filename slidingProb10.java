package com.sliding;

import java.util.ArrayList;
import java.util.List;

public class slidingProb10 {
	
	public static void equalprintsub(int [] arr, int k, int x) {
		int i = 0, j = 0;
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			sum += arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				if(sum-x==0) {
					for(int a=j; a<=i;a++) {
						list.add(arr[a]);
						
					}
					System.out.println(list);
				}
				
				sum-=arr[j];
				j++;
				i++;
				list.clear();
				
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {3,3,3,2,3,7,8};
		int k = 3;
		int x = 8;
		equalprintsub(arr, k, x);
		
	}

}
