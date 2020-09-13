package se.dsve;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment1withGUI
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-13}.
 * https://github.com/deskavaenkelt/
 */

public class Calculator {
    public double regularExpression(String expressionToEvaluate) {
        try {
            Expression expression = new ExpressionBuilder(expressionToEvaluate).build();
            return expression.evaluate();
        } catch (Exception e) {
            System.out.println("Could not handle expression");
            return -1;
        }
    }
}
