package Strings;

import java.util.Scanner;

public class Form_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int [] arr=new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
				
			}
			
			biggest(arr,n);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
		
	}
	public static void biggest(int [] arr, int n) {
		for (int turn = 1; turn < arr.length; turn++) {
			for(int i=0; i<arr.length-turn; i++) {
				if(compare(arr[i],arr[i+1])>0) {
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
					
				}
			}
			
		}
	}
	public static int compare(int x1,int x2) {
		
		String s1= "" + x1 + x2;
		String s2= "" + x2+ x1;
		if(Long.parseLong(s2)>Long.parseLong(s1)) {
			return 1;
			
		}
		else {
			return -1;
		}
		
	}

}





