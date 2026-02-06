package com.sliding;

public class slidingProb11 {
       public static void evenmaxsum(int [] arr, int k) {
    	   int i = 0, j =0;
    	   int sum = 0;
    	   int max = Integer.MIN_VALUE;
    	   while(i<arr.length) {
    		   sum += arr[i];
    		   if(i-j+1<k) {
    			   i++;
    		   }else {
    			   if(sum%2==0 && sum>max)
    				   max = sum;
    			   sum -= arr[j];
    			   i++;
    			   j++;
    		   }
    	   }
    	
    	   System.out.println(max);
       }
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,1,5,6};
		int k = 3;
		evenmaxsum(arr, k);
	}

}
