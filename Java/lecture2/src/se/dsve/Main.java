package se.dsve;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
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
//        exercise16();
//        exercise31();
//        exercise32();
        exercise19();
        exercise20();
    }

    private static void addALine() {
        System.out.println("-------------------------");
    }

    private static void exercise1() {
        System.out.println("exercise1");
        System.out.println("Hello");
        System.out.println("Lars");
        addALine();
    }

    private static void exercise2() {
        System.out.println("exercise2");
        int num1 = 12;
        int num2 = 15;
        int sum = num1 + num2;
        System.out.println("Summa = " + sum);
        addALine();
    }

    private static void exercise3() {
        System.out.println("exercise3");
        int num1 = 33;
        int num2 = 15;
        int div = num1 / num2;
        System.out.println("Summa = " + div);
        addALine();
    }

    private static void exercise4() {
        System.out.println("exercise4");
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        addALine();
    }

    private static void exercise5() {
        System.out.println("exercise5");
        System.out.print("Input a number: ");
        int num1 = scan.nextInt();
        System.out.print("Input a number: ");
        int num2 = scan.nextInt();
        int multiply = num1 * num2;

        System.out.println("multiply = " + multiply);
        addALine();
    }

    private static void exercise6() {
        System.out.println("exercise6");
        System.out.print("Input a number: ");
        int num1 = scan.nextInt();
        System.out.print("Input a number: ");
        int num2 = scan.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        addALine();
    }

    private static void exercise7() {
        System.out.println("exercise7");
        System.out.print("Input a number: ");
        int num1 = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            int multiplyBy = i + 1;
            int factor = num1 * multiplyBy;
            System.out.println(num1 + " x " + multiplyBy + " = " + factor);
        }
        addALine();
    }

    private static void exercise8() {
        System.out.println("exercise8");
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        addALine();
    }

    private static void exercise9() {
        System.out.println("exercise9");
        double number = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(number);
        addALine();
    }

    private static void exercise10() {
        System.out.println("exercise10");
        double number = (4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
        System.out.println(number);
        addALine();
    }

    private static void exercise11() {
        System.out.println("exercise11");
        double radius = 7.5;
        double pi = 3.1415;
        double perimeter = (2 * pi * radius);
        double area = (pi * (radius * radius));
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        addALine();
    }

    private static void exercise12() {
        System.out.println("exercise12");

        System.out.print("Input a number: ");
        int num1 = scan.nextInt();
        System.out.print("Input a number: ");
        int num2 = scan.nextInt();
        System.out.print("Input a number: ");
        int num3 = scan.nextInt();

        int total = num1 + num2 + num3;
        int average = total / 3;

        System.out.println("average = " + average);

        addALine();
    }

    private static void exercise13() {
        System.out.println("exercise13");
        double width = 5.5;
        double height = 8.5;

        double perimeter = (width + height) * 2;
        double area = width * height;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        addALine();
    }

    private static void exercise14() {
        System.out.println("exercise14");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        addALine();
    }

    private static void exercise15() {
        System.out.println("exercise15");
        int a = 5;
        int b = 4;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("swap");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        addALine();
    }

    private static void exercise16() {
        System.out.println("exercise16");
        System.out.println(" +\" \"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        addALine();
    }

    private static void exercise31() {
        System.out.println("exercise31");
        String javaVersion = System.getProperty("java.version");
        String javaRuntimeVersion = System.getProperty("java.runtime.version");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");
        String javaClassPath = System.getProperty("java.class.path");

        System.out.println("Java Version: " + javaVersion);
        System.out.println("Java Runtime Version: " + javaRuntimeVersion);
        System.out.println("Java Home: " + javaHome);
        System.out.println("Java Vendor: " + javaVendor);
        System.out.println("Java Vendor Url: " + javaVendorUrl);
        System.out.println("Java Class Path: " + javaClassPath);

        addALine();
    }

    private static void exercise32() {
        System.out.println("exercise32");
        System.out.println("Enter 2 numbers to compare");
        int num1;
        num1 = returnNumber();
        int num2;
        num2 = returnNumber();

        if (num1 == num2) {
            System.out.println("Numbers are equal");
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " > " + num2);
        }


        addALine();
    }
    private static int returnNumber() {
        System.out.print("Enter a number: ");
        return scan.nextInt();
    }

    private static void exercise33() {
        System.out.println("exercise33");
        System.out.println("x");
        addALine();
    }

    private static void exercise20() {
        System.out.println("exercise20");
        System.out.println("x");
        addALine();
    }
}
