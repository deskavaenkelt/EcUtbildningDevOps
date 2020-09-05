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

    private static int readNumberInteger() {
        String stringInput = userInput();
        return parseStringToInt(stringInput);
    }

    // Check if input is an integer (Package Private)
    static int parseStringToInt(String passedString) {
        try {
            return Integer.parseInt(passedString);
        } catch (NumberFormatException ex) {
            System.out.println("Enter a valid number!");
            return -1;
        }
    }

    // ************
    // *  Double  *
    // ************
    public static double getNumberDouble() {
        return readNumberDouble();
    }
    // Private function
    private static double readNumberDouble() {
        String stringInput = userInput();
        return parseStringToDouble(stringInput);
    }

    // Check if input is an double (Package Private)
    static double parseStringToDouble(String passedString) {
        try {
            return Double.parseDouble(passedString);
        } catch (NumberFormatException ex) {
            System.out.println("Not a number!");
            return -1;
        }
    }

    // Close scanner
    public static void closeScanner() {
        scanner.close();
    }

}
