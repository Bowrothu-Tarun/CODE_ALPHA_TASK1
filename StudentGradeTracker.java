import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    private static ArrayList<Double> grades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grade Tracker");
            System.out.println("1. Add Grade");
            System.out.println("2. Display Grades");
            System.out.println("3. Display Statistics");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter grade: ");
                    double grade = sc.nextDouble();
                    grades.add(grade);
                    break;
                case 2:
                    System.out.println("Grades:");
                    for (double g : grades) {
                    System.out.println(g);
                    }
                    break;
                case 3:
                    System.out.println("Average Grade: " + computeAverage());
                    System.out.println("Highest Grade: " + computeHighest());
                    System.out.println("Lowest Grade: " + computeLowest());
                    break;
                case 4:
                    System.out.println("Exiting....."); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
            sc.close();
        }
    }

    private static double computeAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    private static double computeHighest() {
        if (grades.isEmpty()) {
            return 0;
        }
        double highest = Double.MIN_VALUE;
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static double computeLowest() {
        if (grades.isEmpty()) {
            return 0;
        }
        double lowest = Double.MAX_VALUE;
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}