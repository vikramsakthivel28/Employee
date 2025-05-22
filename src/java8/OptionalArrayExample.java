package java8;


import java.util.Optional;
import java.util.Scanner;

public class OptionalArrayExample {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the array size from user
	        System.out.print("Enter number of elements in the array: ");
	        int size = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        Object[] objArray = null;

	        // Ask user if they want to enter values or leave it null
	        System.out.print("Do you want to enter values into the array? (yes/no): ");
	        String response = scanner.nextLine();

	        if (response.equalsIgnoreCase("yes")) {
	            objArray = new Object[size];
	            for (int i = 0; i < size; i++) {
	                System.out.print("Enter string for index " + i + ": ");
	                objArray[i] = scanner.nextLine();
	                } 
	        }
	        // Wrap array in Optional
	        Optional<Object[]> optionalArray = Optional.ofNullable(objArray);

	        // Check and process
	        if (optionalArray.isEmpty()) {
	            System.out.println("given Array is null");
	        } else {
	            for (Object obj : optionalArray.get()) {
	                if (obj instanceof String) {
	                    String str = (String) obj;
	                    System.out.println("Uppercase: " + str.toUpperCase());
	                    System.out.println("Length: " + str.length());
	                } else {
	                    System.out.println("Non-string object found.");
	                }
	            }
	        }
         scanner.close();
	    }
	}

