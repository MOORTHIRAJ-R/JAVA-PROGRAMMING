package test;

public class Gcd {

	public static void main(String[] args) {
		int a = 15,b= 30;
		System.out.println(gcd(a,b));
		

	}
	public static int gcd(int a,int b){
		if (b==0)return a;
		
		return gcd(b,a%b);
				
	}

}
