package main.algos.strings;

import java.util.Scanner;

public class NumWordsInCamelCaseString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count + 1);
		in.close();
	}
}
