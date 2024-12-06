//Written by Cameron McGill
import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Welcome to the matrix adder program!");
		System.out.println("Please enter the length and width of the first matrix.");
		
		int number1=keyboard.nextInt();
		int number2=keyboard.nextInt();
		
		int[][] matrix = new int[number1][number2];
		
//		System.out.println("Enter value at index 0");
		
		for (int i=0; i< number1; i++)
			for (int j=0; j < number2; j++ ) 
	{
		{
			System.out.println("Enter value at index "+i+"\n"+j);
			matrix[i][j] = keyboard.nextInt();
		
//			total=array[i]+total;
		}		
		
	}
		
System.out.println("Please enter the length and width of the second matrix.");
		
		int number3=keyboard.nextInt();
		int number4=keyboard.nextInt();
		
		int[][] matrix2 = new int[number3][number4];
		
//		System.out.println("Enter value at index 0");
		
		for(int i=0; i< number3; i++)
		{
			for (int j=0; j < number4; j++ )
				{
					System.out.println("Enter value at index "+i+"\n"+j);
					matrix2[i][j] = keyboard.nextInt();

				}
		}
		
		int[][] matrix3 = new int [number1][number2];
		
		for (int i=0; i< number1; i++)
			for (int j=0; j < number2; j++ ) 
			{
				matrix3[i][j] = matrix[i][j] + matrix2[i][j];
			}
		
		System.out.println("=");
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
		
		

	}

}
