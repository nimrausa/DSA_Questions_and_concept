package Arrays;

import java.util.Scanner;

public class Replace_all_0_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		
		while(n!=0) {
			int rem=n%10;
			if(rem==0) {
				rem=5;	
			}
			a=a*10+rem;
			n=n/10;
		}
		
		System.out.println(a);
		

	}

}
