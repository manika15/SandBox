package main.java.strings;

import java.util.Scanner;

public class JavaStringReverseIsPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		// Reverse string and compare to original
		String reverse = new StringBuilder(s).reverse().toString();

		System.out.println(s.equals(reverse) ? "Yes" : "No");
	}

}