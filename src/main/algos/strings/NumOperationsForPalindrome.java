package main.algos.strings;

import java.util.Scanner;

public class NumOperationsForPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num < 1 || num > 10) {
			input.close();
			return;
		}
		
		for (int i = 0; i < num; i++) {
			char[] chars = input.next().toCharArray();
			if (chars.length < 1 || chars.length > 10000) {
				input.close();
				return;
			}
			
			int len = chars.length;
			int count = 0;
			
			for (int j = 0; j < len / 2; j++) {
				if (chars[j] == chars[len - 1 - j]) {
					continue;
				} else {
					count = count + Math.abs(chars[j] - chars[len - 1 - j]);
				}
			}
			
			System.out.println(count);
		}
		
		input.close();
	}
}
