package arrayProgram;

import java.util.Scanner;

public class PercentageProgram {

	public static void main(String[] args) {
//	Take input from user and calculate percentage  

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of subject ");
		int size = sc.nextInt();

		int total = size * 100;
		System.out.println("Enter the Total Marks - " + total);

		System.out.println("Enter the marks af " + size + " Subjects");
		int[] marks = new int[size];

		int sum = 0;
		for (int i = 0; i <= size - 1; i++) {
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}

		System.out.println("Average of the marks is " + (sum * 100) / total + "%");

	}

}
