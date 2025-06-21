package test;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int sc = sn.nextInt();
		for(int i = 0;i < sc ; i ++) {
			// spaces
			for(int j = 1 ; j <= sc -i; j++) {
				System.out.print(" ");
			}
			
			// dec num
			for(int j =i +1  ; j> 0   ; j--) {
				System.out.print(j);
			}
			// increasing num
			
			 for (int j = 2; j <= i + 1; j++) {
	                System.out.print(j);
	            }
		
			System.out.println();
		}

	}

}
