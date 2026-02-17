package com.sliding;


public class slidingProb22 {
	
	public static boolean isPrime(int num) {
		if(num<2) return false;
		
	for(int x=2;x<num;x++) {
		if(num%x==0) {
			return false;
		}
		
	}
	return true;
	
	}
	public static void maxPrime(int [] arr, int k) {
		int i = 0, j = 0;
		//int sum = 0;
		int a=0;
		int prime =0;
		int max = Integer.MIN_VALUE;
		while(i<arr.length) {
			if(isPrime(arr[i])) {
			 prime++;
			}
			if(i-j+1<k) {
				i++;
			} else {
				
				max = Math.max(prime, max);
				
				if(isPrime(arr[j])) {
					prime--;
				}
				
				i++;
				j++;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int [] arr = {3,2,8,3,3,9,5,5};
		int k = 3;
		maxPrime(arr, k);
		

	}

}
