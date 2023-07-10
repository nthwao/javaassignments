package QUESTION3;
import java.util.Scanner;

public class divisibility {

	public static void main(String[] args) {
	

		        try (Scanner scanner = new Scanner(System.in)) {
					System.out.print("Enter an integer: ");
					int number = scanner.nextInt();

					for (int i = 0; i <= 9; i++) {
					    if (isDivisible(number, i)) {
					        System.out.println("The number is divisible by " + i);
					    }
					}
				}
		    }

		    public static boolean isDivisible(int number, int divisor) {
		        if (divisor == 0) {
		            // Avoid division by zero
		            return false;
		        }

		        if (divisor == 2 || divisor == 5) {
		            // Check divisibility by 2 and 5 based on the last digit
		            return number % 10 == 0 || number % 10 == divisor;
		        } else {
		            // Check divisibility by other divisors
		            return number % divisor == 0;
		        }
		    
		


		    }

}
