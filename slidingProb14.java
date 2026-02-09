package com.sliding;

public class slidingProb14 {
	public static void absolutesum(int [] arr, int k) {
	 	   int i = 0, j =0;
	 	   int sum = 0;
	 	   int max = Integer.MIN_VALUE;
	 	   while(i<arr.length) {
	 		   sum += arr[i];
	 		   if(i-j+1<k) {
	 			   i++;
	 		   }else {
	 			   if(Math.abs(sum) > max)
	 				   max = Math.abs(sum);
	 			   sum -= arr[j];
	 			   i++;
	 			   j++;
	 		   }
	 	   }
	 	  System.out.println(max);
	    }
	public static void main(String[] args) {
		int [] arr = {4,-10,3};
		int k =2;
		absolutesum(arr, k);

	}

}
