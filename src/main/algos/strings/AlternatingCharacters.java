package main.algos.strings;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
		if (num < 1 || num > 10) {
			input.close();
			return;
		}
        
		for (int i = 0; i < num; i++) {
			char[] chars = input.next().toCharArray();
			if (chars.length < 1 || chars.length > 100000) {
				input.close();
				return;
			}
	
          int deletion=0;
          for (int k = 0; k < chars.length-1; k++) {
              if(chars[k]!='A' && chars[k]!='B'){
            	  input.close();
                  return;
              }
              if(chars[k]==chars[k+1]){
                  deletion++;
              }
          }
            System.out.println(deletion);     
        }
        input.close();
    }
}
