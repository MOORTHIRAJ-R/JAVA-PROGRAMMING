package test;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int n = row;
for (int i = 0; i < row ; i ++) {
	for (int j = 0; j <row ; j ++) {
		System.out.print(n + " ");
		n=n+row;//n = 5+5 ==> n=10+5
	}
	System.out.println();
}

	}

}
