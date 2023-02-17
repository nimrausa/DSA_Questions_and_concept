package Strings;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="692239";
		printsubstring(str);
	}
		public static void printsubstring(String str) {
		int count=0;
		boolean[] vis=new boolean[str.length()];
		for(int len=1; len<=str.length() ; len++) {
			for(int j=len; j<=str.length(); j++) {
				int i=j-len;
				String s=str.substring(i,j);
				//System.out.println(str.substring(i,j)); // to print substring 
				//length wise
				if(CBnumber(Long.parseLong(s))==true && isvisited(vis,i,j-1)==true) {
					count++;
					for(int k=i; k<j; k++) {
						
						vis[k]=true;
						
					}
				}
			}
		}
		System.out.print(count);
		
	}

	public static boolean isvisited(boolean[] vis, int i, int j) {
		for (int k = i; k <= j; k++) {
			if(vis[k]==true) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean CBnumber(long n) {
		if(n==0 || n==1) {
			return false;
		}
		int [] arr= {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				return true;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0) {
				return false;
			}	
	}
		return true;
}
}
