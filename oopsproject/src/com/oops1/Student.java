package com.oops1;

public class Student {
	
	int id;
	String name;
	String address;
	
	
	void display() {
		
		System.out.println(id + " " + name + " " + address);
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id=45;
		student1.name="shubham";
		student1.address ="nagpur";
		
		student1.display();
		
		Student student2 = new Student();
		student2.id=46;
		student2.name="chaitanya";
		student2.address ="mumbai";
	
		student2.display();
		
	}

}
