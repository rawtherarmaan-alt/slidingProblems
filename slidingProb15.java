package com.sliding;

public class slidingProb15 {
	public static void secndSum(int [] arr, int k) {
	 	   int i = 0, j =0;
	 	   int sum = 0;
	 	   int sec = Integer.MIN_VALUE;
	 	   int max = Integer.MIN_VALUE;
	 	   while(i<arr.length) {
	 		   sum += arr[i];
	 		   if(i-j+1<k) {
	 			   i++;
	 		   }else {
	 			   if(sum>max) {
	 				   sec = max;
	 				   max =sum;
	 			   } else if (sum>sec && sum!=max)
	 				   sec = sum;
	 				   
	 			   sum -= arr[j];
	 			   i++;
	 			   j++;
	 		   } 
	 	   }   
	 	  System.out.println(sec);
		  System.out.println(max);
	  }	
	public static void main(String[] args) {
		int [] arr = {4,10,5,12,2};
		int k =2;
	    secndSum(arr, k);

	}

}
