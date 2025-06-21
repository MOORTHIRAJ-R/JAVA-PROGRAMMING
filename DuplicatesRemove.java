package collectionDemo;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicatesRemove {

	public static void main(String[] args) {
		String original;
		Scanner scan = new Scanner(System.in);
		original = scan.nextLine();
		
		String Result = remvDups(original);
	System.out.println(Result);
	scan.close();
}
	public static String remvDups(String original) {
		boolean flag = true;
		for(int i = 0 ; i<original.length();i++) {
			
		if(flag == true) {
			char result = original.charAt(i);
			flag = false;
		}
			}
		
		return original;
		
	}
}
