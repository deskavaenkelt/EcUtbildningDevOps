package se.dsve;
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
 * Assignment 1 Simple - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-09-05.
 * https://github.com/deskavaenkelt/
 */

public class Main {

    static final Scanner scanner = new Scanner(System.in);
    static boolean PLAYING = true;

    public static void main(String[] args) {
        viewLogo();
        startCalculator();
        closeScanner();
    }

    // ###################
    // # Calculator Loop #
    // ###################
    static void startCalculator() {
        while (PLAYING) {
            viewMenu();
            int input = getNumberInt();
            choiceMenu(input);
        }
    }

    // ###################
    // # User Navigation #
    // ###################
    static void choiceMenu(int input) {
        switch (input) {
            case 1:
                logicAddition();
                break;
            case 2:
                logicSubtraction();
                break;
            case 3:
                logicMultiplication();
                break;
            case 4:
                logicDivision();
                break;
            case 0:
                exit();
                break;
            default:
                startCalculator();
                break;
        }
    }

    // ##################
    // #     Logic      #
    // ##################
    static double enterANumber() {
        viewEnterNumber();
        return getNumberDouble();
    }

    static double[] enterNumberInputs() {
        double firstNumber = enterANumber();
        double secondNumber = enterANumber();
        return new double[]{firstNumber, secondNumber};
    }

    static void printResult(double firstNumber, double secondNumber, String operator, double result) {
        viewResult();
        System.out.println(firstNumber + operator + secondNumber + " = " + result);
        System.out.println();
        System.out.println("######################");
        System.out.println();
    }

    static void logicAddition() {
        viewAddition();
        double[] doubleInputs = enterNumberInputs();
        double result = addition(doubleInputs[0], doubleInputs[1]);
        printResult(doubleInputs[0], doubleInputs[1], " + ", result);
    }

    static void logicSubtraction() {
        viewSubtraction();
        double[] doubleInputs = enterNumberInputs();
        double result = subtraction(doubleInputs[0], doubleInputs[1]);
        printResult(doubleInputs[0], doubleInputs[1], " - ", result);
    }

    static void logicMultiplication() {
        viewMultiplication();
        double[] doubleInputs = enterNumberInputs();
        double result = multiplication(doubleInputs[0], doubleInputs[1]);
        printResult(doubleInputs[0], doubleInputs[1], " * ", result);
    }

    static void logicDivision() {
        viewDivision();
        double[] doubleInputs = enterNumberInputs();
        double result = division(doubleInputs[0], doubleInputs[1]);
        printResult(doubleInputs[0], doubleInputs[1], " / ", result);
    }

    static void exit() {
        viewExit();
        PLAYING = false;
    }

    // ##################
    // #      Math      #
    // ##################
    static double addition(double number1, double number2) {
        return number1 + number2;
    }

    static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    static double division(double number1, double number2) {
        return number1 / number2;
    }

    // ##################
    // #   User input   #
    // ##################

    static String userInput() {
        return scanner.nextLine();
    }

    // *************
    // *  Integer  *
    // *************
    static int getNumberInt() {
        String stringInput = userInput();
        return parseStringToInt(stringInput);
    }

    // Check if input is an integer
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
    static double getNumberDouble() {
        String stringInput = userInput();
        return parseStringToDouble(stringInput);
    }

    // Check if input is an double
    static double parseStringToDouble(String passedString) {
        try {
            return Double.parseDouble(passedString);
        } catch (NumberFormatException ex) {
            System.out.println("Not a number!");
            return -1;
        }
    }

    static void closeScanner() {
        scanner.close();
    }

    // ##################
    // #      Menu      #
    // ##################
    static void viewMenu() {
        System.out.println("+--------------------+");
        System.out.println("|     Calculator     |");
        System.out.println("+--------------------+");
        System.out.println("| 1. Addition        |");
        System.out.println("| 2. Subtraction     |");
        System.out.println("| 3. Multiplication  |");
        System.out.println("| 4. Division        |");
        System.out.println("|                    |");
        System.out.println("| 0. Exit            |");
        System.out.println("+------------dsve.se-+");
        System.out.print("Choose: ");
    }

    static void viewAddition() {
        System.out.println("+--------------------+");
        System.out.println("|      Addition      |");
        System.out.println("+--------------------+");
    }

    static void viewSubtraction() {
        System.out.println("+--------------------+");
        System.out.println("|    Subtraction     |");
        System.out.println("+--------------------+");
    }

    static void viewMultiplication() {
        System.out.println("+--------------------+");
        System.out.println("|   Multiplication   |");
        System.out.println("+--------------------+");
    }

    static void viewDivision() {
        System.out.println("+--------------------+");
        System.out.println("|      Division      |");
        System.out.println("+--------------------+");
    }

    static void viewResult() {
        System.out.println("+--------------------+");
        System.out.println("|       Result       |");
        System.out.println("+--------------------+");
    }

    static void viewEnterNumber() {
        System.out.print("Enter number: ");
    }

    static void viewExit() {
        System.out.println("See you later alligator");
        System.out.println();
        viewLogo();
    }

    static void viewLogo() {
        System.out.println("  __");
        System.out.println(" /\\ \\");
        System.out.println(" \\_\\ \\    ____  __  __     __");
        System.out.println(" /'_` \\  /',__\\/\\ \\/\\ \\  /'__`\\");
        System.out.println("/\\ \\L\\ \\/\\__, `\\ \\ \\_/ |/\\  __/");
        System.out.println("\\ \\___,_\\/\\____/\\ \\___/ \\ \\____\\");
        System.out.println(" \\/__,_ /\\/___/  \\/__/   \\/____/");
        System.out.println();
    }
}
