package QUESTION1;

import java.util.Scanner;

public class age1 {

	public static void main(String[] args) {
		// program that ask user to enter age and surname
		
				try (Scanner scanner = new Scanner(System.in)) {
					System.out.print("Enter your surname: ");
					String surname = scanner.nextLine();
					System.out.print("Enter your age: ");
					int age = scanner.nextInt();

					// Calculating the number of characters in the surname
					int length = surname.length();

					// Determine whether the age is even or odd
					int sign = age % 2;

					// Print the result
					System.out.println("Your surname has " + length + " characters.");
					System.out.println("Your current age is an " + (sign == 0 ? "even" : "odd") + " number.");
				}
				

	}

}
