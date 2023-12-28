package arrayProgram;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// Take input from user and Print Sum of the mark

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size ");
		int size = sc.nextInt();

		int[] marks = new int[size];
		System.out.println("Enter marks of " + size + " student");

		int sum = 0;
		for (int i = 0; i <= size - 1; i++) {

			System.out.println("Enter Marks " + i);
			marks[i] = sc.nextInt();

			sum = sum + marks[i];
		}
		System.out.println("sum of marks is - " + sum);
	}

}
