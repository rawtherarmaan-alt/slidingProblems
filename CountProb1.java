package com.sliding;

public class CountProb1 {
	public static void counteven(int [] arr, int k) {
		int i = 0,j = 0;
		int evencount = 0;
		int sum = 0;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				evencount++;
			}
			if(i-j+1==k) {
				System.out.println(evencount);
				sum += evencount;
				if(arr[j]%2==0) {
					evencount--;
				}
				j++;
			}
			i++;
		}
		System.out.println("total even count = "+ sum);
	}
	
	public static void main(String[] args) {
	int [] arr = {12,1,4,2,6,6};
	int k = 3;
	counteven(arr, k);
	
	}

}
