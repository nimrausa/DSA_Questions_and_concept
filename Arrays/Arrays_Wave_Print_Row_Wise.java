package Arrays;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [] [] arr=new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		wave_row(arr);
	}
	public static void wave_row(int [] [] arr) {
		int row=0;
		int  col=0;
		for(  row=0; row<arr.length ; row++) {
			if(row%2==0) {
			for( col=0; col<arr[0].length; col++) {
				System.out.print(arr[row][col]+ ", ");		
			}
		}
			else {
				for(col=arr[0].length-1; col>=0; col--) {
					System.out.print(arr[row][col]+ ", ");	
				}
		}
		}
		System.out.println("END");
}
}
