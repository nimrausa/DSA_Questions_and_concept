package Strings;

import java.util.Scanner;

public class StringsToggleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		toggle(str);
	}

	public static void toggle(String str) {
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ans=ans+(char)(ch+32);
			}
			else {
				ans=ans+(char)(ch-32);
			}
			
		}
		System.out.println(ans);
		
		
	}

}
