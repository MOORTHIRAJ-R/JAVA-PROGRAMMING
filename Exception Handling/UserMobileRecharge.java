

import java.util.Scanner;

public class UserMobileRecharge {
	
	static void recharge(int Amount) throws InvalidRechargeAmontException {
		if(Amount > 1000  || Amount < 10 ) 
			throw new InvalidRechargeAmontException("Invalid Recharge Amount Please Try another..");
			
			System.out.println(" Your Recharge " +Amount + "$ has been Successfully Completed");
		
		
	}
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int Amount = sc.nextInt();
		try {
		recharge(Amount);
		}
		catch(InvalidRechargeAmontException e) {
			System.out.println("Exception Found : " + e.getMessage());
		}

	}

}
class InvalidRechargeAmontException extends Exception{
	public InvalidRechargeAmontException(String msg) {
		super(msg);
	}
}