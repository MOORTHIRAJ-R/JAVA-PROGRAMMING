package test;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Choice = Sc.nextInt();
		for(int i = 1 ; i<=Choice; i ++) {
			for(int k=1;k<=i;k++) {

					System.out.print(" ");
			}
			for(int j = i; j<=Choice;j++) 
			{
				if(i==1||i==Choice||j==1||j==Choice||i==j) {
					if(i==Choice&&j==1) {
						System.out.println(" ");
					}
					else {
				System.out.print("* ");
				}
				}
				else {
					System.out.print("  ");
				}
			}
                System.out.println();
			}
         for(int i = 1 ; i<=Choice; i ++) {
			for(int k=Choice;k>=i;k--) {

					System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) 
			{
				if(i==Choice||j==1||j==Choice||i==j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		
			System.out.println();
			}

	}

	}
