package Arrays;

import java.util.Scanner;

public class Inverse_of_an_array {

	  public static void main(String args[]) {
	       Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int [] arr=new int[n];
		   for(int i=0; i<arr.length; i++){
			   arr[i]=sc.nextInt();
		   }
		   inverse(arr);
		  for(int k=0; k<arr.length; k++){
			   System.out.print(arr[k] + " ");
		   }

	    }
		public static void inverse(int [] arr){
			int [] arr1=new int [arr.length];
			for(int i=0 ; i<arr.length; i++){
				int idx=arr[i];
				arr1[idx]=i;
			}
			for(int i=0; i<arr.length; i++){
				arr[i]=arr1[i];
			}
		}
	}
