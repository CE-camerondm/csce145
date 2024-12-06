//Written by Cameron McGill

import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		
		 
		
		Scanner keyboard=new Scanner(System.in);
		//double average = keyboard.nextDouble();
		
		
		double total=0;
		
		
		double array[]=new double[10];
		
		System.out.println("Welcome to the below average temperature tester program!");
		
		for (int i=0; i<array.length; i++)
		{
			System.out.println("Please enter the temperature for day " +  (i + 1) + ": ");
			array[i] = keyboard.nextInt();
			total=array[i]+total;
		}
		
		
		double average =total/10;
		
		
		
		
		for (int i=0; i < array.length; i++)
		{
			System.out.println("The average temperture was: ");
			System.out.println(average);
			break;
			
		}
		
		System.out.println("The days that were below average were" + ":");
		
		for (int i=0; i < array.length; i++)
		{
			
			if (array[i] <= average )
			{
				System.out.println("Day " + (i +1) + " with " + array[i]);	
			}
			
		}
		
		

	}

}
