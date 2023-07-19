package clasassignment;
import java.util.Scanner;
public class getdimensions {
	public static void getdimensions() {
		
		//declaring variables
		
		int length, width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length");
		
		length = input.nextInt();
		
System.out.println("Enter the width");
		
		width = input.nextInt();
		
		compute(length, width);
		
		
		
	}
	
	public static void compute(int length, int width) {
		int area , perimeter;
		
		area = length*width;
		perimeter = 2*(length+width);
		
		display(area,perimeter);
	}
	
	public static void display(int area, int perimeter) {
		System.out.println("the area is :"+area);
		System.out.println("the perimeter is:"+perimeter);
		
	}
	

	public static void main(String[] args) {
		//calling methods
		getdimensions();
	}

}
