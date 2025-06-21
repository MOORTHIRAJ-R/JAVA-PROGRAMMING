package test;
import java.util.Scanner;
public class DownTriange {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int count = sc.nextInt();
    
    for(int i = 1;i<= count;i++) {
    	
       for(int j=1; j<=i;j++) {
    		
    		System.out.print(" ");
    	}
    	
      	for(int k=5;k>=i;k--) {
    		
    		System.out.print("* ");
    		
    	}
    	
    	System.out.println();
    }
    
	}
}