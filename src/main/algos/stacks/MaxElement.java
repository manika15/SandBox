package main.algos.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaxElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int max = Integer.MIN_VALUE;
		Stack<Integer> s = new Stack<Integer>();
		
		if (num < 1 || num > 100000) {
			input.close();
			return;
		}

		while(num>0){
			int type = input.nextInt();
			if (checkType(type)) {
				if (type == 1) {
					int n = input.nextInt();
					if (n < 1 || n > 1000000000) {
						input.close();
						return;
					}
					max=Math.max(n, max);
					s.push(n);
				} else if (type == 2) {
					if(!s.isEmpty())
					s.pop();
					//reset max
					if(s.isEmpty())
						max = Integer.MIN_VALUE;
					else
						max = getStackMax(s.toArray());
				} else if (type == 3) {
					if(!s.isEmpty())
					System.out.println(max);
				}
			} else {
				input.close();
				return;
			}
			num--;
		}
		input.close();
	}

	private static int getStackMax(Object[] s) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length; i++) {
			max = Math.max(max, (Integer) s[i]);
		}
		return max;
	}

	private static boolean checkType(int type) {
		if (type == 1 || type == 2 || type == 3) {
			return true;
		}
		return false;
	}
}
