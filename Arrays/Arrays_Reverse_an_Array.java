package Arrays;

import java.util.Scanner;

public class Arrays_Reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();	
		}
		reverse(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

    }
	public static void reverse(int [] arr){
	int lo=0;
	int hi=arr.length-1;
	while(lo<=hi){
		int temp=arr[lo];
		arr[lo]=arr[hi];
		arr[hi]=temp;
		lo++;
		hi--;
	}

	}
}