package se.dsve;

import java.util.ArrayList;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment2TDD
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-22}.
 * https://github.com/deskavaenkelt/
 */

public class Game {

    ArrayList<Character> listOfCharacters = new ArrayList<>();

    public void createCharacter(String name, String weapon) {
        listOfCharacters.add(new Character(name, weapon));
    }

    public void changeWeaponTo(int characterIndex, String changeToWeapon) {
        listOfCharacters.get(characterIndex).setWeapon(changeToWeapon);
    }
}
