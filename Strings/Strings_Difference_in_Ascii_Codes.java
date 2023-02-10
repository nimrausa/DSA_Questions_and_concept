package Strings;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    difference_Asci(str);

	}

	private static void difference_Asci(String str) {
		String ans="";
		char prev=str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char curr=str.charAt(i);
			ans=ans+prev +(curr-prev);
			prev=curr;
			
		}
		ans=ans+prev;
		System.out.println(ans);
		
	}
	
}
