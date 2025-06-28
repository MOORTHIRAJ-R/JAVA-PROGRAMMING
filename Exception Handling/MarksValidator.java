
public class MarksValidator {
  
	public static void validateAge(int marks ) throws InvalidMarkExcetion {
		if (0 > marks || 100 < marks )
			throw new InvalidMarkExcetion("Invalid Mark please Enter Valid Mark")	;
		
		else 
			System.out.println("Mark Accepted : "+ marks);
	}
	
	public static void main(String[] args) {
		try {
             validateAge(88);
		}
		catch(InvalidMarkExcetion e) {
			System.out.println("Exception caught : " + e.getMessage());
		}

	}

}

class InvalidMarkExcetion extends Exception{
	public InvalidMarkExcetion(String msg) {
		super(msg);
	}
}
