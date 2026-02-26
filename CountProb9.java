package com.sliding;

public class CountProb9 {
	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}
	public static void findexactVowels(String str, int k) {
		int i = 0,j = 0;
		int count = 0;
		int volcount = 0;
		while(i<str.length()) {
			char ch = str.charAt(i);
			if(isVowel(ch)) {
				count++;
			}
			if(i-j+1==k) {
				if(count == 2) {
					volcount++;
				}
				//System.out.println(volcount);
				
				char leftChar = str.charAt(j);
				if(isVowel(leftChar)) {
					count--;
				}
				j++;
			}
			i++;
		}
		System.out.println(volcount);
	}
	public static void main(String[] args) {
		String str = "aeiou";
		int k = 3;
		findexactVowels(str, k);
	}

}
