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

public class ForEach {

    static String[] beverages = {"Vodka", "Whiskey", "Rum", "Beer"};
    static String[] cars = {"Volvo", "Saab", "Porsche", "Audi"};

    static void example1() {
        for (String beverage : beverages) {
            System.out.println(beverage);
        }
    }

    static void example2() {
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        example1();
        example2();
    }
}
