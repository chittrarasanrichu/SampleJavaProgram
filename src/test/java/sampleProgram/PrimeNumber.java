package sampleProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i,m,n=43,flag=0; m=n/2; 
		 * if(n==0||n==1) {
		 * System.out.println("not a prime");} 
		 * else 
		 * { 
		 * for(i=2;i<=m;i++) 
		 * { if(n%i==0) 
		 * {
		 * System.out.println("not a prime"); 
		 * flag=1; 
		 * break;
		 *  }
		 * 
		 * 
		 * } if(flag==0) { System.out.println(" a prime"); } }
		 */
Scanner sc = new Scanner(System.in);
System.out.println("enter the number : "
		);
int n = sc.nextInt();
int m=n/2;
boolean IsPrime = true ;
if(n==0||n==1) {
	System.out.println(n+" is not prime number");}
	
	else {
		
		for(int i=2;i<m;i++) {

	int temp;
	temp = n%i;
	if(temp==0) {
		IsPrime = false;
		System.out.println(n+" is not prime number");
		break;
	}
	else 
		if(IsPrime) {
		System.out.println(n+" is a prime number");
	}
	
}
}
	

}
}
