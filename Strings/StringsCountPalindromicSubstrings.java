package Strings;

import java.util.Scanner;

public class StringsCountPalindromicSubstrings {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			System.out.println(palindromicSubstring(str));
			    
			
		}

	private static int palindromicSubstring(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				String s=str.substring(i,j);
				if(validPalindrome(s)==true) {
					count++;
				}
			}
			
		}
		return count;
		
	}
	public static boolean validPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		return true;
	}
	

}
