package flow_of_program;

import java.util.Scanner;

public class SumOfTwoNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum of "+ num1 + " and " + num2 + " is: " + (num1+num2));
	}
}
