package com.pkg3;



import java.util.Scanner;

public class AddAll {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int fact =1;fact<=num;fact++) {
			
			sum = sum+fact;
			
		}
		
		System.out.println("Addition of " + num + " = " + sum);
		
		

	}

}

