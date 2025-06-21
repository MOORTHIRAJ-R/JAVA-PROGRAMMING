package test;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = 1; 	 // starting num
		int count = sc.nextInt();
		
		for(int i = 1 ; i <= count;i++) {
			for(int j = 1 ; j <= count ; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
			
		}

	}

}
