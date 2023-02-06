package Strings;

import java.util.Scanner;

public class StringsMaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		charmax(str);

	}

	private static void charmax(String str) {
		int [] frq=new int [26]; //there are 26 cgaracter in english alphabet
		for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		frq[ch-97]=frq[ch-97]+1;
		}
		int max_i=0;
		for (int i = 1; i < frq.length; i++) {
			if(frq[i]>frq[max_i]) {
				max_i=i;
			}
		}
		char c=(char) (97+max_i);
		System.out.println(c);
	}
	

}
