package main.algos.strings;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num < 1 || num > 10) {
			input.close();
			return;
		}
		
		String[] str = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = input.next();
			if (str[i].length() < 2 || str[i].length() > 10000) {
				input.close();
				return;
			}
		}

		input.close();
		
		for (int i = 0; i < num; i++) {
			StringBuilder reverse = new StringBuilder();
			int isFunny = 0;
			
			//Reversing the string
			for (int j = str[i].length() - 1; j >= 0; j--) {
				reverse = reverse.append(str[i].charAt(j));
			}
			
			//Comparing adjacent character difference in main string to reversed string
			for (int k = 0; k < str[i].length() - 1; k++) {
				if (Math.abs(str[i].charAt(k + 1) - str[i].charAt(k)) == Math
						.abs(reverse.charAt(k + 1) - reverse.charAt(k))) {
					isFunny++;
				} else {
					continue;
				}
			}
			
			//If difference is same in main and reversed for all characters, print funny
			if (isFunny == str[i].length() - 1) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}

	}
}
