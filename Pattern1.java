package test;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		

			
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			for(int i = 1 ; i <= count;i++){
		       for(int j=count;j>=i;j--) {
		    	   System.out.print(" ");
		       }
		       for(int l=1;l<i;l++) {
		    	   System.out.print(l);
		       }
		       for(int k=i;k>=1;k--) {
		    	   System.out.print(k);
		       }
		      
		        System.out.println();
			}
			
			}

}
