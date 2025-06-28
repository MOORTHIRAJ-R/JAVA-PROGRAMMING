

public class NestedTryCatch {

	public static void main(String[] args) {
	try {
		String UserName = null;
		try {
			int AccBal = 3000;
			int devide = 0 ;
			int res = AccBal/devide;
		}
		catch(ArithmeticException e) {
			System.out.println( "can't devide" + e.getMessage());
		}
		System.out.println(UserName.toLowerCase());
	}
 catch(NullPointerException ex) {
	 System.out.println("null" + ex.getMessage());
 }
	}

}
