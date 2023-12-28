package arrayProgram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// Take a input from user and reverse the array

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size ");
		int size = sc.nextInt();

		System.out.println("Enter the marks - " + size);
		int[] marks = new int[size];

		for (int i = 0; i <= size - 1; i++) {
			marks[i] = sc.nextInt();
		}

		// ---- Reverse Array ----
		System.out.println("Reverse Array ");
		for (int j = size - 1; j >= 0; j--) {

			System.out.println((marks[j]));

		}

	}

}
