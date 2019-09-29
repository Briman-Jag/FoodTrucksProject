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
		Scanner bk = new Scanner(System.in);
		foodTrucks[0] = truck1;
		foodTrucks[1] = truck2;
		foodTrucks[2] = truck3;
		foodTrucks[3] = truck4;
		foodTrucks[4] = truck5;

		String nameCheck;
		int nextTruckId = 0;
		int truckNum = 0;
		boolean cont = true;

		System.out.println("Welcome to the FoodTruck App where you can "
				+ "enter up to 5 Food Trucks, rate them, and display " + "the highest rated on!");
		System.out.println("Please enter up to 5 Food Trucks to rate: ");
		// User inputs Food Truck 1's information
		System.out.println("Enter name of first Food Truck: ");
		truck1.setName(kb.nextLine());
		nameCheck = truck1.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			System.out.println("Onto next truck");
		} else {
			truck1.setTruckId(nextTruckId++);
			truckNum++;
			System.out.println("Enter the food type: ");
			truck1.setFoodType(kb.nextLine());
			System.out.print("Enter your rating of the Food Truck from 1-10: ");
			truck1.setRating(bk.nextInt());
			while (truck1.getRating() < 1 || truck1.getRating() > 10) {
				System.out.println("Not valid. Please enter a rating on scale from 1-10.");
				truck1.setRating(bk.nextInt());
			}
		}
		// User inputs Food Truck 2's information
		System.out.println("Enter name of second Food Truck: ");
		truck2.setName(kb.nextLine());
		nameCheck = truck2.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			System.out.println("Skipping this truck.");
		} else {
			truck2.setTruckId(nextTruckId++);
			truckNum++;
			System.out.println("Enter the food type: ");
			truck2.setFoodType(kb.nextLine());
			System.out.println("Enter your rating of the Food Truck from 1-10: ");
			truck2.setRating(bk.nextInt());
			while (truck2.getRating() < 1 || truck2.getRating() > 10) {
				System.out.println("Not valid. Please enter a rating on scale from 1-10.");
				truck2.setRating(bk.nextInt());
			}
		}
		// User inputs Food Truck 3's information
		System.out.println("Enter name of third Food Truck: ");
		truck3.setName(kb.nextLine());
		nameCheck = truck3.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			System.out.println("Skipping this truck.");

		} else {
			truck3.setTruckId(nextTruckId++);
			truckNum++;
			System.out.println("Enter the food type: ");
			truck3.setFoodType(kb.nextLine());
			System.out.println("Enter your rating of the Food Truck from 1-10: ");
			truck3.setRating(bk.nextInt());
			while (truck3.getRating() < 1 || truck3.getRating() > 10) {
				System.out.println("Not valid. Please enter a rating on scale from 1-10.");
				truck3.setRating(bk.nextInt());
			}
		}
		// User inputs Food Truck 4th information
		System.out.println("Enter name of fourth Food Truck: ");
		truck4.setName(kb.nextLine());
		nameCheck = truck4.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			System.out.println("Skipping this truck.");
		} else {
			truck4.setTruckId(nextTruckId++);
			truckNum++;
			System.out.println("Enter the food type: ");
			truck4.setFoodType(kb.nextLine());
			System.out.println("Enter your rating of the Food Truck from 1-10: ");
			truck4.setRating(bk.nextInt());
			while (truck4.getRating() < 1 || truck4.getRating() > 10) {
				System.out.println("Not valid. Please enter a rating on scale from 1-10.");
				truck4.setRating(bk.nextInt());
			}
		}
		// User inputs Food Truck 5's information
		System.out.println("Enter name of fifth Food Truck: ");
		truck5.setName(kb.nextLine());
		nameCheck = truck5.getName();
		if (nameCheck.equalsIgnoreCase("quit")) {
			System.out.println("Skipping this truck.");

		} else {
			truck5.setTruckId(nextTruckId++);
			truckNum++;
			System.out.println("Enter the food type: ");
			truck5.setFoodType(kb.nextLine());
			System.out.println("Enter your rating of the Food Truck from 1-10: ");
			truck5.setRating(bk.nextInt());
			while (truck5.getRating() < 1 || truck5.getRating() > 10) {
				System.out.println("Not valid. Please enter a rating on scale from 1-10.");
				truck5.setRating(bk.nextInt());
			}
		}
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
				if (!truck1.getName().equalsIgnoreCase("quit")) {
					System.out.println(truck1.toString());
				}
				if (!truck2.getName().equalsIgnoreCase("quit")) {
					System.out.println(truck2.toString());
				}
				if (!truck3.getName().equalsIgnoreCase("quit")) {
					System.out.println(truck3.toString());
				}
				if (!truck4.getName().equalsIgnoreCase("quit")) {
					System.out.println(truck4.toString());
				}
				if (!truck5.getName().equalsIgnoreCase("quit")) {
					System.out.println(truck5.toString());
				}

				break;
			case 2:
				// Find average rating of all food trucks
				int average = 0;

				average = ((truck1.getRating() + truck2.getRating() + truck3.getRating() + truck4.getRating()
						+ truck5.getRating()) / truckNum);
				System.out.println("Average Food Truck rating is " + average);
				break;
			case 3:
				// Display highest rated food truck
				int highest = 0;
				String highestName = "";
				String highestType = "";
				int highestTruckId = 0;

				if (truck1.getRating() != 0 && truck2.getRating() != 0) {
					if (truck1.getRating() < truck2.getRating()) {
						highest = truck2.getRating();
						highestName = truck2.getName();
						highestType = truck2.getFoodType();
						highestTruckId = truck2.getTruckId();
					}

				}
				if (truck2.getRating() != 0 && truck3.getRating() != 0) {
					if (truck2.getRating() < truck3.getRating()) {
						highest = truck3.getRating();
						highestName = truck3.getName();
						highestType = truck3.getFoodType();
						highestTruckId = truck3.getTruckId();
					}
				}
				if (truck3.getRating() != 0 && truck4.getRating() != 0) {
					if (truck3.getRating() < truck4.getRating()) {
						highest = truck4.getRating();
						highestName = truck4.getName();
						highestType = truck4.getFoodType();
						highestTruckId = truck4.getTruckId();
					}
				}
				if (truck4.getRating() != 0 && truck5.getRating() != 0) {
					if (truck4.getRating() < truck5.getRating()) {
						highest = truck5.getRating();
						highestName = truck5.getName();
						highestType = truck5.getFoodType();
						highestTruckId = truck5.getTruckId();
					}
				}

				System.out.println(
						"Food Truck ID:" + highestTruckId + " " + highestName + " has highest rating of " + highest);
				System.out.println("Food Type: " + highestType);
				break;
			case 4:
				// Quit
				System.out.println("Thanks for rating Food Trucks! Have a great day!");
				cont = false;
				break;
			default:
				System.out.println("Not an option.");
			}

		}
		kb.close();
		System.exit(0);
	}

}
