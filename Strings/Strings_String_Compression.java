package Strings;

public class Strings_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		palindrome(s);
	}

	public static void palindrome(String s) {
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			int j = i + 1; 
			
				
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
				else {
					count=0;
				}
				
					System.out.print(s.charAt(i) + count);
				

			}

		

	}

	
}
