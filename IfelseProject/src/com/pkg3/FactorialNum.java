package com.pkg3;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum=1;
		
		for(int fact =1;fact<=num;fact++) {
			
			sum = sum*fact;
			
		}
		
		System.out.println("factorial of " + num + " = " + sum);
		
		

	}

}
