package day20;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
      
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Result of addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result of subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }
    }
}
