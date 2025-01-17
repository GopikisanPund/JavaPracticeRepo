package StringProgram;

public class StringPalindrome {

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();

		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "abba";

		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not palindrome" );
		}

	}

}
