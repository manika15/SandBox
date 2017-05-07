package main.algos.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num < 1 || num > 1000) {
			input.close();
			return;
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < num; i++) {
			String str = input.next();
			if (str.length() < 1 || str.length() > 20) {
				input.close();
				return;
			}
			if (map.keySet().contains(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		int queries = input.nextInt();
		if (queries < 1 || queries > 1000) {
			input.close();
			return;
		}

		for (int i = 0; i < queries; i++) {
			String s = input.next();
			if (s.length() < 1 || s.length() > 20) {
				input.close();
				return;
			}
			if (map.keySet().contains(s)) {
				System.out.println(map.get(s));
			} else {
				System.out.println("0");
			}
		}
		input.close();
	}
}
