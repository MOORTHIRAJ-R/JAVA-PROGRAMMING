package test;
class help{
	private String sol ;
	public  String getName() {
		
		return sol;
		
	}
	public  void  setName(String sol) {
		this.sol= sol;
		
	}
}

public class GettSett {

    public static void main(String[] args) {
    
    help h = new help();
	h.setName("Solution");
     //System.out.println(h.getName());
	h.getName();
     
    }
}