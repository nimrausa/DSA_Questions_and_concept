package Strings;

import java.util.Scanner;

public class StringsStringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		compression(str);
		
		

	}
	public static void compression(String str) {
		int count=1;
		String ans="";
		char prev=str.charAt(0);
		for (int i=1; i < str.length(); i++) {
			char curr=str.charAt(i);
			
			if(curr==prev) {
				count++;
			}
			else {
				ans=ans+prev;
				if(count>1) {
					ans=ans+count;	
				}
				prev=curr;
				count=1;
			}
		}
		ans=ans+str.charAt(str.length()-1);
		if(count>1) {
			ans=ans+count;
		}
		System.out.println(ans);
		
		
	}

}
