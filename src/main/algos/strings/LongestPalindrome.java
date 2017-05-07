package main.algos.strings;

public class LongestPalindrome {
	private int l, maxLength;

	public String longestPalindrome(String s) {

		if (s.length() < 2) {
			return s;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			expandPalindrome(i, i, s);
			expandPalindrome(i, i + 1, s);
		}
		return s.substring(l, l + maxLength);
	}

	private void expandPalindrome(int j, int k, String s) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLength < (k - j - 1)) {
			l = j + 1;
			maxLength = k - j - 1;
		}
	}
}
