# CODE_ALPHA_TASK1

This Java program is a simple Student Grade Tracker that allows users to manage and analyze grades.

The grades are stored in a static ArrayList<Double> called grades.
The program uses a Scanner to interact with the user. It presents a menu with four options:

Add Grade: Prompts the user to enter a grade, which is then added to the grades list.

Display Grades: Prints all the grades currently in the list.

Display Statistics: Computes and displays the average, highest, and lowest grades using helper methods.

Exit: Terminates the program.

Helper Methods:

computeAverage(): Calculates and returns the average of the grades. If the list is empty, it returns 0.

computeHighest(): Finds and returns the highest grade in the list. If the list is empty, it returns 0.

computeLowest(): Finds and returns the lowest grade in the list. If the list is empty, it returns 0.

Program Loop: The program runs in an infinite loop until the user chooses to exit (option 4). Invalid menu choices prompt an error message and re-display the menu.
