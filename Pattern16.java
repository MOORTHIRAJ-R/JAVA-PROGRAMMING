package test;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Choice = Sc.nextInt();
		for(int i = 1 ; i<=Choice; i ++) {
			for(int k=Choice;k>=i;k--) {

					System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) 
			{
				if(j==1||i==j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
                   System.out.println();
			}
           for(int i = 1 ; i<Choice; i ++) {
			for(int k=0;k<=i;k++) {

					System.out.print(" ");
			}
			for(int j = Choice-1; j>=i;j--) 
			{
				if(i==j||j==Choice-1||j==1) {
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

