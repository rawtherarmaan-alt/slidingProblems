package com.sliding;

public class CountProb5 {
   public static void evencount(int [] arr, int k , int x) {
	   int i = 0, j = 0;
	   int count = 0;
	   int result = 0;
	   while(i<arr.length) {
		   if(arr[i]%2==0) {
			   count++;
		   }
		   if(i-j+1==k) {
			   if(count>=x) {
				   result++;
			   }
			   if(arr[j]%2==0) {
				   count--;
			   }
			   j++;
		   }
		   i++;
	   }
	   System.out.println(result);
   }
	public static void main(String[] args) {
		int [] arr = {1,2,8,4,5,6};
		int k = 3;
		int x = 2;
		evencount(arr, k, x);
	}

}
