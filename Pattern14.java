package test;

import java.util.Scanner;

public class Pattern14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String spaces =" "; 
		for(int i = 1; i <=count;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=count;j>=i;j--){
				//for(int k =count;k>1;k--) {
				if(i==1||j==1||i==count||j==count) {
					System.out.print("* ");
				}
				else{
					System.out.print(spaces);
				}
				//}
			}
			System.out.println();
		}

	}

}
