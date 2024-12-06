//Written by Cameron McGill

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		
		Scanner keyboard = new Scanner(System.in);
		int number=keyboard.nextInt();
		
		
		if ( number<=-1 )
		{
			System.out.println("Invalid.");
		}
		for (int i=0; i<number; i++)
		{
			for(int j=0; j<=i; j++)
				
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		//think of this as another triangle not reversing it.
		//Start as if you want this triangle to be less than the greatest value of the other triangle.
		//This should be a triangle with only rows mirroring the other
		for (int t=number - 1; t>=1; t--)
		{
			
			
			for(int y=1; y<=t; y++)
			{
				System.out.print("*");
				
				
			}
			
			System.out.println();
			
		}
		

	}

}
