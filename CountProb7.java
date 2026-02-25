package com.sliding;


public class CountProb7 {
	public static boolean Primenum(int x) {
		if(x<=1) {
			return false;
		}
		for(int num = 2 ; num*num<=x; num++) {
			if(x%num==0) {
				return false;
			}
		}
		return true;
	}
	public static void checkprime(int [] arr, int k) {
		int i = 0, j = 0;
		int count = 0;
		int max = 0;
		int s =0;
		while(i<arr.length) {
			if(Primenum(arr[i])) {
				count++;
			}
			if(i-j+1==k) {
				if(count>max) {
					max = count;
					s=j;
				}
				//System.out.println(count);
				if(Primenum(arr[j])) {
					count--;
				}
				j++;
			}
			i++;
		}
		for(int x = s;x<s+k;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		System.out.println(max);
		
	}
	public static void main(String[] args) {
		int [] arr = {1,2,9,5,4,7};
		int k = 3;
		checkprime(arr, k);
		
	}

}
