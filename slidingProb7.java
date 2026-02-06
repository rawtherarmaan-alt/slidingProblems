package com.sliding;

import java.util.ArrayList;
import java.util.List;

public class slidingProb7 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int k = 3;
		
		int i = 0;
		int j = 0;
		//int sum = 0;
		
		List<Integer> list = new ArrayList<>();
		while(i<arr.length) {
			//sum+=arr[i];
			
			if(i-j+1<k) {
				i++;
			}else {
				for(int a=j; a<=i;a++) {
					list.add(arr[a]);
				}
				System.out.println(list);
				//sum -= arr[j];
				i++;
				j++;
				list.clear();
			}
		}
 	}

}
