package com.pkg1;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
		int x=55;
		int y=77;
		int z =9;
		
		if(x>y) {
			if(x>z) {
				System.out.println("x is greater");
			}
		}else if(y>z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
			
			
		}

	}

}
