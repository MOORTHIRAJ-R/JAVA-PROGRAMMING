package test;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String spaces ;
		spaces = "  ";
		for(int i=1;i<=count;i++) {
			for(int j =1;j<=count;j++) {
				if(i==1||i==count||j==1||j==count) {
				System.out.print("* ");
			}
				else {
					System.out.print(spaces);
				}
				}
			
			System.out.println();
		}
	}

}
