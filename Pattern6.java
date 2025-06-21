package test;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int row = sn.nextInt();
		for(int i = 0 ; i <= row ; i++) {
			for(int j = 1 ; j <=row-i ;j++) {
				System.out.print(j);
			}
			if(i != row) {
			System.out.println();
			}
		}
		for(int i = 1 ; i <= row ;i++)
		{
			
		for(int j = 1; j <=i ;j ++) 
		{
			System.out.print(j);
			
		}
		System.out.println();
		}
	}

}
