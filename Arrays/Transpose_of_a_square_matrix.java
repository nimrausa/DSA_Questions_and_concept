package Arrays;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		int [] [] arr=new int [n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();	
			}
		}
		Transponse(arr);
	}
	public static void Transponse(int [] [] arr) {
		
		for (int col= 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col] + " " );
			}
			System.out.println();
			
		}
		

	}

}
