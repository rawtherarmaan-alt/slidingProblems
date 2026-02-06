package com.sliding;

public class SlidingProb9 {
    public static void EvenEle(int[] arr, int k) {
    	int i=0,j=0;
    	int sum=0;
    	while(i<arr.length) {
    		sum+=arr[i];
    		
    		if(i-j+1<k) {
    			i++;
    		}else {
    			if(sum%2==0) {
    				System.out.print(sum+" ");
    			}
    			sum-=arr[j];
    			i++;
    			j++;
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,2,5,7,4,10,10,12};
		int k =3;
		EvenEle(arr,k);

	}

}
