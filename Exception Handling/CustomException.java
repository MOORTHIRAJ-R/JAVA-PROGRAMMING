
public class CustomException {
  
   static  void devide(int a , int b) throws ArithmaticException{
	   if(b==0) throw new ArithmaticException("Can't Devide By 0 ");
	   
	   else
		   System.out.println(a /b)  ;
   }
	public static void main(String[] args) {
		try {
		devide(4, 2);
		}
		catch(ArithmaticException e ) {
			System.out.println("Alert ! Please Check Number , "+e.getMessage());
		}
	}

}
class ArithmaticException extends Exception{
	public ArithmaticException(String msg) {
		super(msg);
	}
}