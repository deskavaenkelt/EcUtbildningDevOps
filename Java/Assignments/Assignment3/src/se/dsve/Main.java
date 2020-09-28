package se.dsve;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment3EcUtbildning
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-25}.
 * https://github.com/deskavaenkelt/
 */

public class Main {

    private static void requirementsForG() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.print("Enter a Number: ");
        try {
            userInput = scanner.nextInt();
            scanner.nextLine();
            System.out.println("userInput = " + userInput);
        } catch (InputMismatchException e) {
            System.err.println("Something went Wrong " + e);
        }
    }

    private static void requirementsForVg() {
        Calculator calc = new Calculator();

        System.out.println(calc.add(3, Math.PI));
        System.out.println(calc.sub(3, Math.PI));
        System.out.println(calc.multi(3, Math.PI));
        System.out.println(calc.div(3, Math.PI));
    }

    public static void main(String[] args) {
        requirementsForG();
        requirementsForVg();

    }
}
