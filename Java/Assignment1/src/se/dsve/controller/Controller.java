package se.dsve.controller;

/*
  __
 /\ \
 \_\ \    ____  __  __     __
 /'_` \  /',__\/\ \/\ \  /'__`\
/\ \L\ \/\__, `\ \ \_/ |/\  __/
\ \___,_\/\____/\ \___/ \ \____\
 \/__,_ /\/___/  \/__/   \/____/

*/

import se.dsve.model.Calculator;
import se.dsve.model.UserInput;
import se.dsve.view.UserInterfaceCli;

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

public class Controller {

    public static boolean PLAYING = true;
    private final Calculator calculator = new Calculator();

    public void start() {
        while (PLAYING) {
            UserInterfaceCli.menu();
            int input = UserInput.getNumberInt();
            choiceInMenu(input);
        }

        UserInput.closeScanner();
    }

    private void choiceInMenu(int input) {
        switch (input) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                UserInterfaceCli.art();
                break;
            case 0:
                exit();
                break;
            default:
                start();
                break;
        }
    }

    private static double addOneNumber() {
        UserInterfaceCli.enterNumber();
        return UserInput.getNumberDouble();
    }

    private void printResult(double firstNumber, double secondNumber, String operator, double result) {
        UserInterfaceCli.result();
        System.out.println(firstNumber + operator + secondNumber + " = " + result);
        System.out.println();
        System.out.println("######################");
        System.out.println();
    }

    private void addition() {
        UserInterfaceCli.addition();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.addition(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " + ", result);
    }

    private void subtraction() {
        UserInterfaceCli.subtraction();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.subtraction(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " - ", result);
    }

    private void multiplication() {
        UserInterfaceCli.multiplication();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.multiplication(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " * ", result);
    }

    private void division() {
        UserInterfaceCli.division();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.division(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " / ", result);
    }

    private void exit() {
        UserInterfaceCli.exit();
        PLAYING = false;
    }
}
