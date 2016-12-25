package main.algos.strings;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int numEncryption = input.nextInt();
		if(numEncryption==0){
            System.out.println(str);
    		input.close();
            return;
        }
		char[] charArray = str.toCharArray();
		StringBuilder output = new StringBuilder();
		for (char c : charArray) {
           int intVal = (int) c;
			int nextVal = intVal + numEncryption;

			if (intVal >= 65 && intVal <= 90){
				if (nextVal > 90) {
					nextVal = (nextVal - 90) + 65 - 1;
				}
				c = (char) nextVal;
			}else if(intVal >= 97 && intVal <= 122){
				if(nextVal>122){
					nextVal = (nextVal - 122) + 97 - 1 ;
				}
				c = (char) nextVal;
			}
			
			output.append(c);
			}
		System.out.println(output);
		input.close();
	}
}
