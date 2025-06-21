package test;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		// TODO Auto-generated method stub
		for(int i = 0 ; i < row ;i++) {
			for(int j = row ;j >=row-i ;j --) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
