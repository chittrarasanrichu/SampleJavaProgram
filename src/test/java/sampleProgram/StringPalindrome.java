package sampleProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your String ");
		String s =sc.nextLine();
		String rev ="";
		int a = s.length();
		for(int i = a-1; i>=0;i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println("original string is "+s);
		System.out.println("reversed string is "+rev);
		
		if(s.equals(rev)) {
			System.out.println(s +" is a palindrome");
		}
		else
		{
			System.out.println(s +" is not a palindrome");
		}

	}

}
