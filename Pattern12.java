package test;

import java.util.Scanner;

public class Pattern12 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		for(int i = 0;i<count;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k = count;k>i;k--) {
				
					System.out.print(" *");
		
		}
			System.out.println();
	}
		

	}
	
	}
