package com.oops1;

public class Car {

	int number;
	int price;
	String colour;

	// constructor ---> method which have same name as class name and it does not
	// have any
	// return type
	

	public Car() {
		System.out.println("I'm constructor");
	}

	public Car(int number, int price, String colour) {
		this.number = number;
		this.price = price;
		this.colour = colour;

	}

	void display() {

		System.out.println(number + " " + price + " " + colour);
	}

	public static void main(String[] args) {

		Car car1 = new Car(101, 50000, "red");
		car1.display();
		Car car2 = new Car(102, 5667, "yello");
		car2.display();
		Car car3 = new Car(103, 6757, "green");
		car3.display();

	}

}
