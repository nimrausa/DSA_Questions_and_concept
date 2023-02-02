package Arrays;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		while(q-->0) {
			int price =sc.nextInt();
			int items=sc.nextInt();
			if(possible(price,items,arr)==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
		}
		public static boolean possible(int price,int items,int [] arr) {
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if(price%arr[i]==0 ) {
					count++;
				}
			}
			if(count>=items) {
				return true;
			}	
				return false;
		}
	}

//public static int maximumsum(int [] arr) {
//	int linearKadane=kadana(arr);
//	
//	int sum=0;
//	for (int i = 0; i < arr.length; i++) {
//		sum=sum+arr[i];
//		arr[i]=arr[i]*(-1);
//		
//	}
//	int InvertedKadana=kadana(arr);
//	int Cirl_Kadana=sum+InvertedKadana;
//	return Math.max(linearKadane, Cirl_Kadana);
//		
//	}
//	public static int kadana(int [] arr) {
//		int prevsum=0;
//		int ans=Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			prevsum=prevsum+arr[i];
//			if(prevsum<0) {
//				prevsum=0;
//			}
//			ans=Math.max(ans,prevsum);
//		}
//		
//		return ans;
//	}

