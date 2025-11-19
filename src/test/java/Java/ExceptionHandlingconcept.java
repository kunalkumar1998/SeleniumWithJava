package Java;

import java.util.Scanner;

public class ExceptionHandlingconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a number :");
		int  a = sc.nextInt();		
		System.out.println(100/a);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled: Invalid input "+ e.getMessage());
		}
		System.out.println("Program run all lines Sucessfully");
		
		//example 2 
		int a[] =new int[4];
		
		try {
		System.out.println("enter index value from 0-3");
		int pos = sc.nextInt();
		
		System.out.println("Enter data value");
		int val =sc.nextInt();
		
		a[pos]= val;
		
		System.out.println(a[pos]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled: "+ e.getMessage());
		}

	}

}
