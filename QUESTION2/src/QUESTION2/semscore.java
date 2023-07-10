package QUESTION2;

import java.util.Scanner;

public class semscore {

	public static void main(String[] args) {
		try (Scanner Scanner = new Scanner(System.in)) {
			// asks the user to enter the marks of the five units
			System.out.print("Enter the marks of the  units: ");
			int[] marks = new int[5];
			for (int i = 0; i < 5; i++) {
			  marks[i] = Scanner.nextInt();
			}

			// Computate the average and show it on the screen
			double total = 0;
			for (int i = 0; i < 5; i++) {
			  total += marks[i];
			}
			double average = total / 5;
			System.out.println("The average of the five units is: " + average + ".0");
		}


	}

}
