package Strings;

import java.util.Scanner;

public class Strings_isPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(palindrome(str));
		    
		
	}
	public static boolean palindrome(String str) {
		 str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
		 
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	

}
