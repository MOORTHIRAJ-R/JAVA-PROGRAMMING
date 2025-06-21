package test;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 1 ;i<= count ;i++) {
  int num =  rm.nextInt(10);
  System.out.println(num);
		}
	}
}
