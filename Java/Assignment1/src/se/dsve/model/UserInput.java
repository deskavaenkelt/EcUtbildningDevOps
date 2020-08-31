package se.dsve.model;

/*
  __
 /\ \
 \_\ \    ____  __  __     __
 /'_` \  /',__\/\ \/\ \  /'__`\
/\ \L\ \/\__, `\ \ \_/ |/\  __/
\ \___,_\/\____/\ \___/ \ \____\
 \/__,_ /\/___/  \/__/   \/____/

*/

import java.util.Scanner;

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

public class UserInput {
    // Start the scanner
    private static final Scanner scanner = new Scanner(System.in);

    // Call public function to get user input string
    public static String getString() {
        return userInput();
    }
    // Private function
    private static String userInput() {
        return scanner.nextLine();
    }

    // *************
    // *  Integer  *
    // *************
    public static int getNumberInt() {
        return readNumberInteger();
    }
    // Private function
    private static int readNumberInteger() {
        // Read input as a string
        String input = userInput();

        // return -1 if not an integer
        int number = -1;

        // Call isInteger to check if input is a number, catch exception
        if (isInteger(input)) {
            // If true parseInt
            number = Integer.parseInt(input);
        }
        return number;
    }

    // Check if input is an integer
    static boolean isInteger(String passedString) {
        // Validate so that input is an int
        boolean isValidInteger = false;
        try {
            Integer.parseInt(passedString);        // passedString is a valid integer
            isValidInteger = true;
        }
        catch (NumberFormatException ex) {
            // passedString is not an integer
            System.out.println("Enter a valid number!");
        }
        return isValidInteger;
    }

    // ************
    // *  Double  *
    // ************
    public static double getNumberDouble() {
        return readNumberDouble();
    }
    // Private function
    private static double readNumberDouble() {
        // Read input as a string
        String input = userInput();

        // return -1 if not an integer
        double number = -1;

        // Call isInteger to check if input is a number, catch exception
        if (isDouble(input)) {
            // If true parseInt
            number = Double.parseDouble(input);
        }
        return number;
    }

    // Check if input is an double
    static boolean isDouble(String passedString) {
        boolean isValidDouble = false;
        try {
            Double.parseDouble(passedString);
            isValidDouble = true;
        }
        catch (NumberFormatException ex) {
            // passedString is not an double
            System.out.println("Not a number!");
        }
        return isValidDouble;
    }


    // Close scanner
    public static void closeScanner() {
        scanner.close();
    }

}
