package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		FoodTruck truck1 = new FoodTruck();
		FoodTruck truck2 = new FoodTruck();
		FoodTruck truck3 = new FoodTruck();
		FoodTruck truck4 = new FoodTruck();
		FoodTruck truck5 = new FoodTruck();

		System.out.println("Welcome to the FoodTruck App where you can "
				+ "enter up to 5 Food Trucks, rate them, and display " + "the highest rated on!");
		System.out.println("Please enter up to 5 Food Trucks to rate: ");
		// User inputs Food Truck 1's information
		System.out.println("Enter name of first Food Truck: ");
		truck1.setName(kb.nextLine());
		if (truck1.getName() == "") {

		}
		truck1.setTruckId(1);
		System.out.println("Enter the food type: ");
		truck1.setFoodType(kb.nextLine());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck1.setRating(kb.nextInt());
		
		// User inputs Food Truck 2's information
		System.out.println("Enter name of second Food Truck: ");
		truck2.setName(kb.nextLine());
		if (truck2.getName() == "") {
			
		}
		truck2.setTruckId(2);
		System.out.println("Enter the food type: ");
		truck2.setFoodType(kb.nextLine());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck2.setRating(kb.nextInt());
		
		// User inputs Food Truck 3's information
		System.out.println("Enter name of third Food Truck: ");
		truck3.setName(kb.nextLine());
		if (truck3.getName() == "") {
			
		}
		truck3.setTruckId(3);
		System.out.println("Enter the food type: ");
		truck3.setFoodType(kb.nextLine());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck3.setRating(kb.nextInt());
		
		// User inputs Food Truck 4th information
		System.out.println("Enter name of fourth Food Truck: ");
		truck4.setName(kb.nextLine());
		if (truck4.getName() == "") {
			
		}
		truck4.setTruckId(4);
		System.out.println("Enter the food type: ");
		truck4.setFoodType(kb.nextLine());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck4.setRating(kb.nextInt());
		
		// User inputs Food Truck 5's information
		System.out.println("Enter name of first Food Truck: ");
		truck5.setName(kb.nextLine());
		if (truck5.getName() == "") {
			
		}
		truck5.setTruckId(5);
		System.out.println("Enter the food type: ");
		truck5.setFoodType(kb.nextLine());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck5.setRating(kb.nextInt());
		

	}
}
