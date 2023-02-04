package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->-0) {
		int n=sc.nextInt();
		int [] arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();		
		}
		int target=sc.nextInt();
		Arrays.sort(arr);
		roses(arr,target);
		}
}
	public static void roses(int [] arr, int target) {
		int i=0;
		int j=arr.length-1;
		int min=Integer.MAX_VALUE;
		int a=0;
		int b=0;
		while(i<=j) {
			if(arr[i]+arr[j]==target) {
				int difference =arr[j]-arr[i];
				
				if(min>difference) {
					 a=arr[i];
					 b=arr[j];
					min=difference;
					
				}
				i++;
				j--;
			}
			else if(arr[i]+arr[j]>target) {
				j--;
				
			}
			else {
				i++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + a + " and " + b + ".");
	}

}
