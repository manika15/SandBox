package main.algos.strings;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		if (str.length() == 1) {
			System.out.println(str);
		} else {
			StringBuilder output = new StringBuilder(str);
			int i = 0;
			int len = str.length();
			while (len > 0) {
				if (i + 1 == output.length()) {
					break;
				}
				if (output.length() > 2 && output.charAt(i) == output.charAt(i + 1)) {
					output.delete(i, i + 2);
					i = 0;
				} else {
					i++;
					len = output.length();
				}
			}
			if (output.length() == 0) {
				System.out.println("Empty String");
			} else if (output.length() == 2 && output.charAt(0) == output.charAt(1)) {
				System.out.println("Empty String");
			} else {
				System.out.println(output);
			}
		}
		scan.close();
	}
}
