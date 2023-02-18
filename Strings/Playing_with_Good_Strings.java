package Strings;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "fmaeiounmgjaeiomncaeoiou";
		 System.out.println(goodString(str));

	}

	public static int goodString(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			if (isvowel(ch) == true) {
				while (i < str.length() && isvowel(str.charAt(i)) == true) {
					count++;
					i++;

				}
				ans = Math.max(ans, count);
			}

		}
		return ans;

	}

	public static boolean isvowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
