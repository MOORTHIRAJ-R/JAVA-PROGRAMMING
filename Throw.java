package test;

import java.io.IOException;

public class Throw {
   int age ;
	public  void CheckAge(int age ) {
		if (age < 18) {
			throw new IllegalArgumentException("not match");
		}
		else {
			System.out.println("accepted");
		}
	}
	public static void main(String[] args)  {
		Throw t = new Throw();
		t.CheckAge(15);

	}

}
