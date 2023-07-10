package QUESTION4;

import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {
		// program to display all multiples of 2,3,7
		  Scanner sc = new Scanner(System.in);
//ask the user to input values
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num <= 70) {
	            System.out.print(num + " is a multiple of 3 and 7.\n");
	        } else if (num >= 71 && num <= 149) {
	            System.out.print(num - 70 + " is a multiple of 3.\n");
	        } else if (num >= 71 && num <= 149) {
	            System.out.print(num - 70 + " is a multiple of 7.\n");
	        } else {
	        	//tells the user the entered value is not within range
	            System.out.println("Number is not in the range 71 to 150.");
	        }

	        sc.close();

	}

}
