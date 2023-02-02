package Arrays;

import java.util.Scanner;
//A circular array means the end of the array connects to the beginning 
//of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] 
//and the previous element of nums[i] is nums[(i - 1 + n) % n].

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(maximumsum(arr));
		}

	}

	public static int maximumsum(int[] arr) {
		int linear_kadane = kadane(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; // total sum=positive ane negative
			arr[i] = arr[i] * -1;
		}
		int Inverted_kadane = kadane(arr);
		int cir_kadane = Inverted_kadane + sum; // total inverted sum+sum=it will
		// remove negative sum
		return Math.max(linear_kadane, cir_kadane);

	}

	public static int kadane(int[] arr) {
		int prevsum = 0;
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			prevsum = prevsum + arr[i];
			ans = Math.max(ans, prevsum);
			if (prevsum < 0) {
				prevsum = 0;
			}
			
		}
		return ans;
	}
}
