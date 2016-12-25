package main.algos.strings;

import java.util.Scanner;

public class PangramCheck {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean result = checkPangram(str.toLowerCase());
		
		if (result) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

		in.close();
	}

	private static boolean checkPangram(String str) {
	           if (str.length() < 26)  
	                return false;  
	           else {  
	                for (char ch = 'a'; ch <= 'z'; ch++) {  
	                     if (str.indexOf(ch) < 0) {  
	                          return false;  
	                     }  
	                }  
	           }  
	           return true;  
	      }	
}
