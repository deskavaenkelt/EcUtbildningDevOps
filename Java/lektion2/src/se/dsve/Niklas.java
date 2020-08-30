package se.dsve;

import java.util.Scanner;

public class Niklas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("input first number: ");
        int number1 = in.nextInt();

        System.out.print("Input second number: ");
        int number2 = in.nextInt();

        System.out.print("Input third number: ");
        int number3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int number4 = in.nextInt();

        System.out.print("Input fifth number: ");
        int number5 = in.nextInt();

        float resultAsAFloat = (float) ((number1 + number2 + number3 + number4 + number5) / 5);

        System.out.println("your average number is: " + resultAsAFloat);
    }
}