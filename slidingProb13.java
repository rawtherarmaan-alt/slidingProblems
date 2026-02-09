package com.sliding;

public class slidingProb13 {
	public static void oddminsum(int [] arr, int k) {
 	   int i = 0, j =0;
 	   int sum = 0;
 	   int min = Integer.MAX_VALUE;
 	   while(i<arr.length) {
 		   sum += arr[i];
 		   if(i-j+1<k) {
 			   i++;
 		   }else {
 			   if(sum%2!=0 && sum<min)
 				   min = sum;
 			   sum -= arr[j];
 			   i++;
 			   j++;
 		   }
 	   }
 	
 	   System.out.println(min);
    }
	public static void main(String[] args) {
		int [] arr = {2,2,3,4,1,5,6};
		int k = 3;
		oddminsum(arr, k);

	}

}
