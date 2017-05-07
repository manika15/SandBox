package main.java.strings;

import java.util.Scanner;

public class JavaStringCompare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int n = input.nextInt();
		input.close();
		String min = s.substring(0, n);
		String max = min;
		for (int i = 0; i <= s.length() - n; i++) {
			String sub = s.substring(i, i + n);
			min = min.compareTo(sub) < 0 ? min : sub;
			max = max.compareTo(sub) > 0 ? max : sub;
		}
		System.out.println(min);
		System.out.println(max);
	}
}