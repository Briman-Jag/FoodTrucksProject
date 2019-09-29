## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

### Overview
This is the second project of the Skill Distillery Full Stack Developer course within the Java fundamentals portion. This program takes in user input to name up to 5 food trucks, enter their food type, and rate the Food Truck on a scaled from 1 to 10. The program also generates an ID for each of the trucks, calculates the average of all of the food trucks ratings, and can display the highest rated food truck along with its details.

The grading requirements for this project are:
- There are no static methods other than the one main method.
- When a FoodTruck is created, its constructor assigns its id field the current value of a static field (such as (nextTruckId) and then increments the static field.
- The user can input up to five food trucks.
- The user can stop inputing trucks before entering five by entering quit as the truck name, after which all input stops and the program continues.
- When a menu item is chosen the list of all trucks entered is displayed. If less than five were input, only those trucks that were created are displayed.
- When another menu item is chosen the average rating based on the number of trucks entered is displayed.
- When another menu item is chosen the winning truck - the one that was input with the highest rating - is displayed with all its properties.
- Food trucks are displayed by printing its toString, which includes all FoodTruck fields.
- When the quit menu item is chosen, the program ends with a message.

### How to run
The prompts the user to enter details of up to 5 food trucks and give them a rating. If the user wishes to rate less than 5 food trucks they can type "quit" to skip onto the next food truck rating. Once all the details are input the user is lead to a menu where they have 4 options. The first lists the Food trucks, the second prints the calculated average rating of all the food trucks entered, the third prints the highest rated food truck with its details, and the fourth option allows the user to quit.

### Technologies/Topics Applies
Technologies and topics used in this project were: Arrays, getters & setters, method calling, while loops, switch, toString, booleans, menu interface, and nest if statements.

### Lessons Learned
A part that gave me difficulty was figuring out how to get the highest rated food truck by comparing them to each other and skipping ones that did not have a rating. Another issue was with the scanner when getting input from the user using .nextLine for the food type and then .nextInt for the rating. It would skip the user input for setting the Type of food. This was fixed by adding another new scanner variable(bk) and using that on the .nextInt inputs from the user. I had made a lot of different versions of code for finding averages, displaying the highest rate, and setting the truck ID that didn't help with meeting the grading requirements, so it has taught me to really pay attention to what's required and write down ideas to meet them.
