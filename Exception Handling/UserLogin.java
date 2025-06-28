import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) throws LoginFailedException {
		
		Scanner sc = new Scanner(System.in);
		
		String Username = "Admin" , Password = "1234";
		int Attempts =0;
		
		while(Attempts < 3) {
			
			System.out.println("Enter Username : ");
			String usern = sc.nextLine();
			System.out.println("Enter Password : ");
			String passw = sc.nextLine();
			
			if(usern.equals(Username) && passw.equals(Password)) {
				System.out.println(" Login Successfull ! Thank You ...");
				return;
			}
			else {
				Attempts++;
				System.out.println(" Username or Password is Wrong ! Please retry ");
				System.out.println("Attempts Remaining : " + (3 - Attempts));
			}
			
			}
		try {
			throw new LoginFailedException("Login Failed You Have tried too many Attempts");
		
		}
			catch(LoginFailedException e ) {
				System.out.println("Login Blocked : " + e.getMessage());
		}		
		

	}

}
class LoginFailedException extends Exception{
	public LoginFailedException(String msg) {
		super(msg);
	}
}