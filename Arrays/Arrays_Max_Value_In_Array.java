package Arrays;

import java.util.Scanner;

public class Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<arr.length ; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print(maxvalue(arr, n));
	}
	public static int maxvalue(int [] arr, int n){
	int ans=arr[0];
	for(int i=1; i<arr.length; i++){
		if(ans<arr[i]){
			ans=arr[i];
		}
	}
	return ans;
	}

}