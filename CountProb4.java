package com.sliding;

public class CountProb4 {
   public static void countnegsubarr(int [] arr, int k) {
	   int i = 0,j = 0;
	   int count = 0;
	   int answer = 0;
	   while(i<arr.length) {
		   if(arr[i]<0) {
			   count++;
			   
		   }
		   if(i-j+1==k) {
			   
			   if(count > 0) {
				   answer++;
			   }
			   
			   if(arr[j]<0) {
					  count--;  
				   }
			   j++;
		   }
		   i++;
	   }
	   System.out.println("Total number of subarr contains negValue = "+answer);
   }
	public static void main(String[] args) {
		int [] arr = {9,1,2,3,-4,5,2,-4};
		int k = 3;
		countnegsubarr(arr, k);

	}

}
