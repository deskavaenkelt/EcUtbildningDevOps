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

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

import se.dsve.model.Calculator;
import se.dsve.model.UserInput;
import se.dsve.view.UserInterfaceCli;

public class CalculateStuff {

    private final Calculator calculator = new Calculator();
    private final UserInterfaceCli userInterface = new UserInterfaceCli();
    private final UserInput userInput = new UserInput();

    private void printResult(double firstNumber, double secondNumber, String operator, double result) {
        userInterface.result();
        System.out.println(firstNumber + operator + secondNumber + " = " + result);
        printResultSeparator();
    }

    private void printResultSinCosTan(String trigonometricalFunction, double enteredValue, double calculatedValue) {
        System.out.println(trigonometricalFunction + enteredValue + ") = " + calculatedValue);
        printResultSeparator();
    }

    private void printResultSeparator() {
        System.out.println("######################");
        System.out.println();
    }

    private double addOneNumber() {
        userInterface.enterNumber();
        return userInput.getNumberDouble();
    }

    void addition() {
        userInterface.addition();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.addition(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " + ", result);
    }

    void subtraction() {
        userInterface.subtraction();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.subtraction(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " - ", result);
    }

    void multiplication() {
        userInterface.multiplication();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.multiplication(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " * ", result);
    }

    void division() {
        userInterface.division();
        double firstNumber = addOneNumber();
        double secondNumber = addOneNumber();
        double result = calculator.division(firstNumber, secondNumber);
        printResult(firstNumber, secondNumber, " / ", result);
    }

    void sin() {
        userInterface.sin();
        double numberOfDegrees = userInput.getNumberDouble();
        double calculatedValue = calculator.sin(numberOfDegrees);
        printResultSinCosTan("sin(", numberOfDegrees, calculatedValue);
    }

    void cos() {
        userInterface.cos();
        double numberOfDegrees = userInput.getNumberDouble();
        double calculatedValue = calculator.cos(numberOfDegrees);
        printResultSinCosTan("cos(", numberOfDegrees, calculatedValue);
    }

    void tan() {
        userInterface.tan();
        double numberOfDegrees = userInput.getNumberDouble();
        double calculatedValue = calculator.tan(numberOfDegrees);
        printResultSinCosTan("tan(", numberOfDegrees, calculatedValue);
    }

    void regularExpression() {
        userInterface.regularExpression();
        String expressionToEvaluate = userInput.getString();
        calculator.regularExpression(expressionToEvaluate);
        printResultSeparator();
    }
}
