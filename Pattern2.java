package test;

import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int count = sc.nextInt();
	 for(int i =1;i<=count;i++) {
		for (int j = 1; j <= count ;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
	}
