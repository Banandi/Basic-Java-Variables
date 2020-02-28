package com.perscholas.basicjavavariables;

//import java.util.Scanner;

public class Carpool {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
		
		int cars = 100;
		int drivers = 30;
		int passengers = 90;
		int cars_not_driven = 70;		
		double carpool_capacity = 120.0;
		double average_passengers_per_car = 3.1;
		double money_saved = 93.3;		
		//311.42 -
		/*
		 * cars_not_driven = cars - drivers; cars_driven = drivers; carpool_capacity =
		 * cars_driven * space_in_a_car; gas_cost_per_trip = (average_miles_driven *
		 * gas_cost_per_gallon) / average_miles_per_gallon; money saved =
		 * (gas_cost_per_trip * cars) - (gas_cost_per_trip * cars_driven);
		 */
		
		System.out.println("//Output\r\n" + 
				"There are " + cars + " cars available.\r\n" + 
				"There are only " + drivers + " drivers available.\r\n" + 
				"That means there will be " + cars_not_driven + " empty cars today!\r\n" + 
				"We can transport " + carpool_capacity + " people today.\r\n" + 
				"Out of that, we're transporting " + passengers + " today.\r\n" + 
				"So we'll need to put about " + average_passengers_per_car + " in each car.\r\n" + 
				"Long story short, today, we'll be saving about $" + money_saved + "!\r\n");
		

	
//		input.close();
	}

}

