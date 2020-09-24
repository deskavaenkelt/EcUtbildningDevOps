package se.dsve.loops;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Lecture10
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-24}.
 * https://github.com/deskavaenkelt/
 */

public class ForLoop {

    static void example1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    static void example2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 2);
        }
    }

    static String[] cars = {"Volvo", "Saab", "Porsche", "Audi"};

    static void example3() {
        for (String car : cars) {
            System.out.println(car);
        }
    }

    static void example4() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }

    static void example5() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
        example5();
    }
}
