package test;
import java.util.Scanner;

public class Pattern4 {
	 
	    public static void main(String[] args) {
	        int numRows = 5; // Number of rows in the pattern

	        for (int i = 0; i < numRows; i++) {
	            // Print leading spaces
	            for (int j = 1; j < numRows - i ; j++) {
	                System.out.print("  ");
	            }

	            // Print decreasing numbers
	            for (int j = i + 1; j > 0; j--) {
	                System.out.print(j);
	            }

	            // Print increasing numbers
	            for (int j = 2; j <= i + 1; j++) {
	                System.out.print(j);
	            }

	            // Move to the next line
	            System.out.println();
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
