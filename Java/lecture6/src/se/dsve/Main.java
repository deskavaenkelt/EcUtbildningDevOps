package se.dsve;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * lecture6
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-14}.
 * https://github.com/deskavaenkelt/
 */

public class Main {

    public static void main(String[] args) {
        Game niceGuy = new Game("The Beast", "Death Bringer", 20, 100);
        Game evilGuy = new Game("Dr. Evil", "Fingers of Death", 666, 100);

        printHealth(niceGuy.getCharacterName(), niceGuy.getHp());
        printHealth(evilGuy.getCharacterName(), evilGuy.getHp());

        niceGuy.beingAttacked(evilGuy.getCharacterName(), niceGuy.getCharacterName(), evilGuy.getWeaponDamage(), evilGuy.getWeaponName());

        printHealth(niceGuy.getCharacterName(), niceGuy.getHp());
        printHealth(evilGuy.getCharacterName(), evilGuy.getHp());

        evilGuy.beingAttacked(niceGuy.getCharacterName(), evilGuy.getCharacterName(), niceGuy.getWeaponDamage(),
                niceGuy.getWeaponName());

        printHealth(niceGuy.getCharacterName(), niceGuy.getHp());
        printHealth(evilGuy.getCharacterName(), evilGuy.getHp());
    }

    private static void printHealth(String name, int health) {
        System.out.println(name + "'s hp is: " + health);
    }
}
