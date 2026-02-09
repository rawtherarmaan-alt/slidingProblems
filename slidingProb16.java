package com.sliding;

public class slidingProb16 {
	public static void sumofsubliesinLR(int [] arr, int k, int l,int r) {
	 	   int i = 0, j =0;
	 	   int sum = 0;
	 	   int count = 0;
	 	   while(i<arr.length) {
	 		   sum += arr[i];
	 		   if(i-j+1<k) {
	 			   i++;
	 		   }else {
	 			   if(l<=sum && sum<=r) {
	 				   count++;
	 			   }
	 				  
	 			   sum -= arr[j];
	 			   i++;
	 			   j++;
	 		   }
	 	   }
	 	   System.out.println(count);
	    }
	public static void main(String[] args) {
		int [] arr = {4,1,5,12,2};
		int k =2;
		int l = 3;
		int r = 6;
		sumofsubliesinLR(arr,k,l,r);

	}

}
