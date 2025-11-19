package Pattern;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
     int n =sc.nextInt();
		
     //Print Square Pattern 
		for(int i=0;i<n ;i++) {
			for(int j=0;j<n;j++) {
				
				System.out.print(" * ");
				
				
			}
			System.out.println();
		}
		System.out.println();
		
		//Print number Square pattern 
		for(int i=0;i<n ;i++) {
			for(int j=0;j<n;j++) {
				
				System.out.print(" "+j+" ");
				
				
			}
			System.out.println();
		}
		
		
		//Print triangle
		//Print number Square pattern 
				for(int i=0;i<=n ;i++) {
					for(int j=0;j<i;j++) {
						
						System.out.print(" "+"*"+" ");
						
						
					}
					System.out.println();
				}
				System.out.println();
				
				//Print reverse triangle
				//Print number Square pattern 
						for(int i=n;i>0 ;i--) {
							for(int j=0;j<i;j++) {
								
								System.out.print(" "+"*"+" ");
								
								
							}
							System.out.println();
						}
				
						
						
						System.out.println();
						
						//Print Equilateral triangle
						//Print number Square pattern 
								
						
	}

}