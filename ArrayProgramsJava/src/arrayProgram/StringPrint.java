package arrayProgram;

import java.util.Scanner;

public class StringPrint {

	public static void main(String[] args) {
		// Take input from user and print 10 name

		Scanner sc = new Scanner(System.in);

		System.out.println("How many Name you want to print ?");
		int size = sc.nextInt();

		String[] name = new String[size];
		System.out.println("Enter name of " + size + " student");

		for (int i = 0; i <= size - 1; i++) {

			name[i] = sc.next();
		}
		// -- name print --
		System.out.print("Your names is - ");

		for (int i = 0; i <= size - 1; i++) {
			System.out.print(name[i] + ", ");
		}

	}

}
