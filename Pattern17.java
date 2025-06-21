package test;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Choice = Sc.nextInt();
		for(int i = 0 ; i<=Choice; i ++) {
			for(int k=Choice;k>=i;k--) {

					System.out.print(" ");
			}
			for(int j = 1; j<=i;j++) 
			{
				if(i==1||j==1||i==j) {
				System.out.print("1 ");
				}
				else {
					System.out.print(i + " ");
				}
			}
		                   System.out.println();
			}
      }
}
