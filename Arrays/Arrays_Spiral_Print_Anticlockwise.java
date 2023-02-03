package Arrays;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int m=sc.nextInt();
			int [] [] arr=new int[n][m];
			int total =n*m;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			rowWise(arr,total);
		}
		public static void rowWise(int [] [] arr,int total) {
		
			int count=0;
			int minr=0;
			int maxr=arr.length-1;
			int minc=0;
			int maxc=arr[0].length-1;
			while(count<total) {
				for(int i=minr; i<=maxr && count<total ; i++) {
					System.out.print(arr[i][minc] + ", ");
					count++;
				}
				minc++;
				for(int i=minc; i<=maxc && count<total; i++) {
					System.out.print(arr[maxr][i]+ ", ");
					count++;
				}
				maxr--;
				for (int i=maxr; i>=minr && count<total ; i--) {
					System.out.print(arr[i][maxc]+ ", ");
					count++;
				}
				maxc--;
				for (int i=maxc; i>=minc && count<total; i--) {
					System.out.print(arr[minr][i] + ", ");
					count++;
				}
				minr++;
			}
			System.out.print("END");
		}
	}
