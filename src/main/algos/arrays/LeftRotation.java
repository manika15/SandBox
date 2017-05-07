package main.algos.arrays;

import java.util.Scanner;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num < 1 || num > 100000) {
			input.close();
			return;
		}
		int rotations = input.nextInt();
		if (rotations < 1 || rotations > num) {
			input.close();
			return;
		}
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			if (rotations > i) {
				array[num - rotations + i] = input.nextInt();
			} else {
				array[i - rotations] = input.nextInt();
			}

		}
		input.close();
		for (int j = 0; j < num; j++) {
			System.out.print(array[j] + " ");
		}
	}
}