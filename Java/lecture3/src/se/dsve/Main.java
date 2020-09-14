package se.dsve;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
//        exercise8();
//        exercise9();
//        exercise10();
//        exercise11();
//        exercise12();
//        exercise13();
//        exercise14();
//        exercise15();
    }

    private static void addALine() {
        System.out.println("--------------------------------------------------");
    }

    private static void exercise1() {
        System.out.println("Exercise1 - Convert from Fahrenheit to Celsius degree.");
        System.out.print("Enter a temperature in Farenheit: ");

        int tempInFahrenheit = scan.nextInt();
        double result = convertFromFahrenheitToCelsius(tempInFahrenheit);

        System.out.println(tempInFahrenheit + " degree Fahrenheit is equal to " + result + " in Celsius");

        addALine();
    }

    static double convertFromFahrenheitToCelsius(double input) {
        return ((input - 32) / 1.8000);
    }

    private static void exercise2() {
        System.out.println("Exercise2 - Convert from inches to meters");
        System.out.print("Enter a number in inches to convert to meters: ");

        int inches = scan.nextInt();
        double result = convertInchesToMeters(inches);

        System.out.println(inches + " inches is " + result + " meters.");
        addALine();
    }

    static double convertInchesToMeters(double input) {
        return (input * 0.0254);
    }

    private static void exercise3() {
        System.out.println("Exercise 3 - Convert minutes into a number of years and days");
        System.out.print("Enter x minutes to convert: ");

        double minutes = scan.nextDouble();
        double years = convertMinutesToYears(minutes);
        double days = convertMinutesToDays(minutes);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        addALine();
    }

    static double convertMinutesToYears(double minutes) {
        double minutesInAYear = 365 * 60 * 24;
        return (int)(minutes/minutesInAYear);
    }

    static double convertMinutesToDays(double minutes) {
        double minutesInDays = minutes / 60 / 24;
        double daysInAYear = 365;
        return (int)(minutesInDays % daysInAYear);
    }

    private static void exercise4() {
        System.out.println("Exercise4 - Print the current time in GMT (+2h for Swedish Summer Time)");

        long totalMilliseconds = System.currentTimeMillis();

        long currentMinute = returnCurrentMinute(totalMilliseconds);
        long currentHour = returnCurrentHour(totalMilliseconds);

        System.out.println("Current time is " + currentHour + ":" + currentMinute);

        addALine();
    }

    static long commonMinutesMethod(long milliSeconds) {
        long totalSeconds = milliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        return totalMinutes;
    }

    static long returnCurrentMinute(long milliSeconds) {
        long totalMinutes = commonMinutesMethod(milliSeconds);
        return (totalMinutes % 60);
    }

    static long returnCurrentHour(long milliSeconds) {
        long totalMinutes = commonMinutesMethod(milliSeconds);
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        currentHour += 2;       // Korr för sommartid
        return currentHour;
    }

    private static void exercise5() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise6() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise7() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise8() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise9() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise10() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise11() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise12() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise13() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise14() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }

    private static void exercise15() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }
}