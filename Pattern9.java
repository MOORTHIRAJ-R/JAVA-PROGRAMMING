package test;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i = 1 ;i <= row ; i++) {
			for (int j = i; j >=1;j --){
			System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
