package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private int truckId;
	private String name;
	private String foodType;
	private int numTrucks = 0;
	private int rating;
	
public FoodTruck() {
	
}

public int getTruckId() {
	return truckId;
}

public void setTruckId(int truckId) {
	this.truckId = truckId;
	truckId = numTrucks + 1;
	
}

public int incrementTruckId() {
	return truckId++;
}

public String getName() {
	return name;
}

public void setName(String name) {
	if (name == "") {
		
	}
	this.name = name;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("FoodTruck [Truck ID: ");
	builder.append(truckId);
	builder.append(", Name: ");
	builder.append(name);
	builder.append(", Food Type: ");
	builder.append(foodType);
	builder.append(", Rating: ");
	builder.append(rating);
	builder.append("]");
	return builder.toString();
}



}
