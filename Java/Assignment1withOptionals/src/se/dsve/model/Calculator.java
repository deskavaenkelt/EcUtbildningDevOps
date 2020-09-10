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

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

public class Calculator {
    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public double division(double number1, double number2) {
        return number1 / number2;
    }

    public double sin(double degrees) {
        double degreeToRadians = Math.toRadians(degrees);
        return Math.sin(degreeToRadians);
    }

    public double cos(double degrees) {
        double degreeToRadians = Math.toRadians(degrees);
        return Math.cos(degreeToRadians);
    }

    public double tan(double degrees) {
        double degreeToRadians = Math.toRadians(degrees);
        return Math.tan(degreeToRadians);
    }

    public void regularExpression(String expressionToEvaluate) {
        try {
            Expression expression = new ExpressionBuilder(expressionToEvaluate).build();
            double result = expression.evaluate();
            System.out.println(expressionToEvaluate + " = " + result);
        } catch (Exception e) {
            System.out.println("Could not handle expression");
        }

    }
}
