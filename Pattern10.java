package test;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pattern10 {
	public String toString(String al) {
		return " " ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] Arr = {"hi","da","dei"};
;
//int[] nums = {1,2,3,4,5,6,7,8,9};
//int[] newnum = new int[5];


//System.arraycopy(nums, 4, newnum, 0,5 );
//for(int j = 0; j <newnum.length;j ++) {
//System.out.println(newnum[j]);
//}
//
//int [][] arr1 = {{2,4,5},{2,4,6}};
//int[][] arr2 = {{3,5,6},{7,5,7}};
//
//
String that = "that is  a string";
String thats = "thats my car";
System.out.println(that.concat(thats));
int arr[][] = new int[2][3];
for(int i = 0;i < 2;i++) {
	for(int j = 0;j<3;j++) {
		// arr[i][j] = arr1[i][j]+arr2[i][j];
		
		System.out.print(arr+" ");
	}
	System.out.println();
}

for (int i = 0; i <Arr.length;i++) {
	System.out.println(Arr[i]);
}

	System.out.println(Arr.equals(Arr));
	System.out.println(Arr.getClass().getName());
	StringBuffer buf = new StringBuffer();
	buf.append("hi da venna ");
	System.out.println(buf);
	buf.append(false)
	;
	System.out.println(buf);
	System.out.println(buf.charAt(7));
	
	System.out.println(buf.reverse());
	

//	
//		int a;
//		String s;
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter your name");
//		s=obj.nextLine();
//		System.out.println("Enter your age");
//		a=obj.nextInt();
//		myId(s,a);
//	
//
//	
	ArrayList al = new ArrayList();
	al.add(Arr);
	al.add(al)
	//al.add(newnum);
	//al.add(nums);
	;
	

//	}static void myId(String name,int age){
//		if(age>=18) System.out.println(name + " UR ELIGIBLE TO VOTE");
//		else System.out.println(name + " UR NOT ELIGIBLE TO VOTE");
	}
	
}
