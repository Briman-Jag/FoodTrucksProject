package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	private static final int MAX = 5;

	public static void main(String[] args) {
		FoodTruck[] foodTrucks = new FoodTruck[MAX];
		FoodTruck truck1 = new FoodTruck();
		FoodTruck truck2 = new FoodTruck();
		FoodTruck truck3 = new FoodTruck();
		FoodTruck truck4 = new FoodTruck();
		FoodTruck truck5 = new FoodTruck();
		Scanner kb = new Scanner(System.in);
		foodTrucks[0] = truck1;
		foodTrucks[1] = truck2;
		foodTrucks[2] = truck3;
		foodTrucks[3] = truck4;
		foodTrucks[4] = truck5;

		String nameCheck;
		int nextTruckId = 0;
		boolean cont = true;

		System.out.println("Welcome to the FoodTruck App where you can "
				+ "enter up to 5 Food Trucks, rate them, and display " + "the highest rated on!");
		System.out.println("Please enter up to 5 Food Trucks to rate: ");
		// User inputs Food Truck 1's information
		System.out.println("Enter name of first Food Truck: ");
		truck1.setName(kb.next());
		nameCheck = truck1.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			
		} else {
			truck1.setTruckId(nextTruckId);
			System.out.println("Enter the food type: ");
			truck1.setFoodType(kb.next());
			System.out.print("Enter your rating of the Food Truck from 1-10: ");
			truck1.setRating(kb.nextInt());
		}
		// User inputs Food Truck 2's information
		System.out.println("Enter name of second Food Truck: ");
		truck2.setName(kb.next());
		if (nameCheck.equalsIgnoreCase("quit")) {
			
		} else {
		truck2.setTruckId(nextTruckId);
		System.out.println("Enter the food type: ");
		truck2.setFoodType(kb.next());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck2.setRating(kb.nextInt());
		}
		// User inputs Food Truck 3's information
		System.out.println("Enter name of third Food Truck: ");
		truck3.setName(kb.next());
		if (nameCheck.equalsIgnoreCase("quit")) {
			
		} else {
		truck3.setTruckId(nextTruckId);
		System.out.println("Enter the food type: ");
		truck3.setFoodType(kb.next());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck3.setRating(kb.nextInt());
		}
		// User inputs Food Truck 4th information
		System.out.println("Enter name of fourth Food Truck: ");
		truck4.setName(kb.next());
		if (nameCheck.equalsIgnoreCase("quit")) {
			
		} else {
		truck4.setTruckId(nextTruckId);
		System.out.println("Enter the food type: ");
		truck4.setFoodType(kb.next());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck4.setRating(kb.nextInt());
		}
		// User inputs Food Truck 5's information
		System.out.println("Enter name of fifth Food Truck: ");
		truck5.setName(kb.next());
		if (truck5.getName() == "") {

		}
		truck5.setTruckId(nextTruckId);
		System.out.println("Enter the food type: ");
		truck5.setFoodType(kb.next());
		System.out.println("Enter your rating of the Food Truck from 1-10: ");
		truck5.setRating(kb.nextInt());

		while (cont) {
			int menuInput;
			System.out.println("_____Main Menu_____");
			System.out.println("Type the number for desired option:");
			System.out.println("1. List Food Trucks");
			System.out.println("2. Food Trucks Average Rating");
			System.out.println("3. Highest rated");
			System.out.println("4. Quit");
			menuInput = kb.nextInt();

			switch (menuInput) {
			case 1:
				// Call string to list all food trucks
				System.out.println(truck1.toString());
				System.out.println(truck2.toString());
				System.out.println(truck3.toString());
				System.out.println(truck4.toString());
				System.out.println(truck5.toString());

				break;
			case 2:
				// Find average rating of all food trucks
				int average = 0;
				average = ((truck1.getRating() + truck2.getRating() + truck3.getRating() + truck4.getRating()
						+ truck5.getRating()) / 5);
				System.out.println("Average Food Truck rating is " + average);
				break;
			case 3:
				// Display highest rated food truck
				int highest = 0;
				String highestName = "";
				if (truck1.getRating() < truck2.getRating()) {
					highest = truck2.getRating();
					highestName = truck2.getName();
				}
				if (truck2.getRating() < truck3.getRating()) {
					highest = truck3.getRating();
					highestName = truck3.getName();
				}
				if (truck3.getRating() < truck4.getRating()) {
					highest = truck4.getRating();
					highestName = truck4.getName();
				}
				if (truck4.getRating() < truck5.getRating()) {
					highest = truck5.getRating();
					highestName = truck5.getName();
				}

				System.out.println(highestName + " with the highest rating is " + highest);
				break;
			case 4:
				// Quit
				System.out.println("Thanks for rating Food Trucks! Bye!");
				cont = false;
				break;
			default:
				System.out.println("Not an option.");
			}

		}
		kb.close();
		System.exit(0);
	}

	public int calculateAvg(int rate) {

		return rate;
	}

	public int calcHighestRating(int rate) {
		int hiRate = 0;

		return rate;
	}

}
