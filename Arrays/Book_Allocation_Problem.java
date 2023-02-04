package Arrays;

import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int nob=sc.nextInt(); //number of books
			int nos=sc.nextInt();//number of student
			int [] pages=new int [nob];
			for (int i = 0; i < pages.length; i++) {
				pages[i]=sc.nextInt();
				
			}
			System.out.print(readpage(nos,  pages));
		}
		

	}
	public static int readpage(int nos, int [] pages) {
		int lo=0;
		int ans=0;
		int hi=0;
		for (int i = 0; i < pages.length; i++) {
			 hi=hi+pages[i];
		}
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(mid,nos,pages)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
		
	}
	public static boolean isitpossible(int mid,int nos,int[] pages) {
		int student=1;
		int readpage=0;
		int i=0;
		
		while(i< pages.length) {
			if(readpage+pages[i]<=mid) {
				readpage=readpage+pages[i];
				i++;
			}
			else {
				readpage=0;
				student++;
			}
			if(student>nos) {
				return false;
			}
			
		}
		return true;
		
	}

}
