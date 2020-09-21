package se.dsve.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.dsve.model.Character;
import se.dsve.model.Weapon;

import static org.junit.jupiter.api.Assertions.*;
import static se.dsve.controller.GameLogic.*;

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
 * @since {2020-09-21}.
 * https://github.com/deskavaenkelt/
 */

class PrintTest {

    private final String[] weaponNames = {"weapon1", "weapon2", "weapon3"};
    private final int[] weaponDamage = {100, 50, 25};
    private final int[] weaponWear = {50, 20, 10};

    void fillWeaponListTest() {
        for (int i = 0; i < weaponNames.length; i++) {
            weaponsList.add(new Weapon(weaponNames[i], weaponDamage[i], weaponWear[i]));
        }
    }

    private final String[] characterName = {"Character1", "Character2", "Character3", "Dead Character"};
    private final int[] characterEquippedWeapon = {0, 1, 2, 2};
    private final int[] characterHp = {100, 80, 60, 0};

    void fillCharacterListTest() {
        for (int i = 0; i < characterName.length; i++) {
            charactersList.add(new Character(characterName[i], characterEquippedWeapon[i], characterHp[i]));
        }
    }

    void fillLists() {
        fillWeaponListTest();
        fillCharacterListTest();
    }

    @BeforeEach
    void setUp() {
        createArrayLists();
    }

    @AfterEach
    void tearDown() {
        weaponsList.clear();
        charactersList.clear();
    }

    @Test
    void characterStats() {
        fillLists();
        String message = Print.characterStats(1);
        assertEquals(message, "Character2's stats:\n" +
                "Character2's weapon name is: weapon2\n" +
                "Character2's HP = 80");
        assertNotEquals(message, "Character3's stats:\n" +
                "Character3's weapon name is: weapon2\n" +
                "Character3's HP = 80");
    }

    @Test
    void equippedWeapon() {
        fillLists();
        String message = Print.equippedWeapon(1);
        assertEquals(message, "Character2's weapon name is: weapon2");
        assertNotEquals(message, "Character3's weapon name is: weapon2");
    }
}