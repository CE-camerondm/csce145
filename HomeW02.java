//written by Cameron McGIll

import java.util.Scanner;

public class HomeW02 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a 4-bit binary number");
		String number=keyboard.nextLine();
		
		String firstNum= number.substring(0, 1);
		int realNum= Integer.parseInt(firstNum);
		
		
		String firstNum1= number.substring(1, 2);
		int realNum1= Integer.parseInt(firstNum1);
		
		
		String firstNum2= number.substring(2,3);
		int realNum2= Integer.parseInt(firstNum2);
		
		String firstNum3= number.substring(3);
		int realNum3= Integer.parseInt(firstNum3);
		
		
//		System.out.println(realNum * 8);
//		
//		System.out.println(realNum1 * 4);
//		
//		System.out.println(realNum2 * 2);
//		
//		System.out.println(realNum3 * 1);
		
		int sum= realNum * 8 + realNum1 * 4 + realNum2 * 2 + realNum3 * 1;
		
		
		
		System.out.println("Enter another 4-bit binary number");
		String number1=keyboard.nextLine();
		
		String firstNum11= number1.substring(0, 1);
		int realNum11= Integer.parseInt(firstNum11);
		
		
		String firstNum111= number1.substring(1, 2);
		int realNum111= Integer.parseInt(firstNum111);
		
		
		String firstNum21= number1.substring(2,3);
		int realNum21= Integer.parseInt(firstNum21);
		
		String firstNum31= number1.substring(3);
		int realNum31= Integer.parseInt(firstNum31);
		
		int sum1= realNum11 * 8 + realNum111 * 4 + realNum21 * 2 + realNum31 * 1;
		
		System.out.println("The first number is: " +sum); 
		System.out.println("The second number is: " + sum1);
		
		int sumFinal = sum  + sum1;
		
		System.out.println("Added together is: " + sumFinal);
//		System.out.println("Enter another ")
		
		
		
		
//		String number1=keyboard.nextLine();
//		
//		String firstNum1= number1.substring(0, 3);
//		int realNum1= Integer.parseInt(firstNum1);
//		
//		System.out.println(realNum1);
		
		
//		System.out.println("The first number is" + i);
//		System.out.println("The second number is" + i);
		
		
		
		
	}

}
