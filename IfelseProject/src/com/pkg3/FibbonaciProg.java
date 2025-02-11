package com.pkg3;

public class FibbonaciProg {

	public static void main(String[] args) {
		
		int num1=0,num2=1,count=10;
		int num3=0;
		
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<=count;i++) {
			
			if(i==5) {
				break;
			}
			
			num3 = num1+num2; // 0 1 //2 //1+2 =3
			System.out.println(num3);
			num1 =num2; //1 //1 //1
			num2=num3; //1 //2 //3
			
			
			
			
		}

	}

}
