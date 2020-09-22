package se.dsve.controller;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment2
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-20}.
 * https://github.com/deskavaenkelt/
 */

public class Print {
    static String characterStats(int characterIndex) {
        String name = GameLogic.getCharacterName(characterIndex);
        String weapon = GameLogic.currentlyEquippedWeapon(characterIndex);
        int hp = GameLogic.getCurrentHp(characterIndex);

        return name + "'s stats:\n"
                + name + "'s weapon name is: " + weapon + "\n"
                + name + "'s HP = " + hp;
    }

    static String charactersEquippedWeapon(int characterIndex) {
        String weaponName = GameLogic.currentlyEquippedWeapon(characterIndex);
        String characterName = GameLogic.getCharacterName(characterIndex);
        return characterName + "'s weapon name is: " + weaponName;
    }
}
