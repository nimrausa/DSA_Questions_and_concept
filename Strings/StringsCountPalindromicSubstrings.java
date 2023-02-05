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
			for (int j = i+1; i < str.length(); j++) {
				if(i==j) {
					
				}
				else {
					count++;
				}
				
			}
			
		}
		
	}
	

}
