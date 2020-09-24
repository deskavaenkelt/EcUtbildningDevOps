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

public class While {
    static String[] beverages = {"Vodka", "Whiskey", "Rum", "Beer"};
    static String[] cars = {"Volvo", "Saab", "Porsche", "Audi"};

    static void example1() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    static void example2() {
        int i = 0;
        while (i < beverages.length) {
            System.out.println(beverages[i]);
            i++;
        }
        System.out.println();
    }

    static void example3() {
        final Long NANOSEC_PER_SEC = 1000L * 1000 * 1000;
        long startTime = System.nanoTime();
        int i = 0;
        while ((System.nanoTime() - startTime) < 1 * 60 * NANOSEC_PER_SEC) {
            System.out.println(i);
            i++;
        }
    }

    static void example4() {
        final Long NANOSEC_PER_SEC = 1000L * 1000 * 1000;
        long startTime = System.nanoTime();
        int i = 0;
        while ((System.nanoTime() - startTime) < 1 * 60 * NANOSEC_PER_SEC) {
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        example1();
        example2();
//        example3();
//        example4();
    }
}
