package se.dsve.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import se.dsve.model.Character;
import se.dsve.model.Weapon;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
 * @since {2020-09-19}.
 * https://github.com/deskavaenkelt/
 */

// Tests not required0 for Assignment 2
public class GameLogicTest {

//    private GameLogic gameLogicTest;

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
//        gameLogicTest = new GameLogic();
//        gameLogicTest.
    }

    @AfterEach
    void tearDown() {
        weaponsList.clear();
        charactersList.clear();
    }

    @Test
    void getWeaponsList() {
        GameLogic.fillWeaponList();
        assertFalse(weaponsList.isEmpty());
    }

    @Test
    void getCharactersList() {
        GameLogic.fillCharacterList();
        assertFalse(charactersList.isEmpty());
    }

    @Test
    void addWeapon() {
        fillWeaponListTest();
        int expectedNumberOfWeapons = weaponNames.length;
        assertEquals(expectedNumberOfWeapons, weaponsList.size());
    }

    @Test
    void addCharacter() {
        fillCharacterListTest();
        int expectedNumberOfCharacters = characterName.length;
        assertEquals(expectedNumberOfCharacters, charactersList.size());
    }

    @Test
    void fillWeaponList() {
        GameLogic.fillWeaponList();
        assertEquals(6, weaponsList.size());
    }

    @Test
    void fillCharacterList() {
        GameLogic.fillCharacterList();
        assertEquals(4, charactersList.size());
    }

    @Test
    void initialSetup() {
        GameLogic.initialSetup();
        assertFalse(weaponsList.isEmpty());
        assertEquals(6, weaponsList.size());
        assertFalse(charactersList.isEmpty());
        assertEquals(4, charactersList.size());
    }

//    @Disabled
//    @Test
//    void printAllWeapons() {
//        fail();
//    }
//
//    @Disabled
//    @Test
//    void printAllCharacters() {
//        fail();
//    }

//    @Test
//    void returnACharactersStats() {
//        fillWeaponListTest();
//        fillCharacterListTest();
//
//        String[] characterStats = GameLogic.returnACharactersStats(1);
//        String name = characterStats[0];
//        String weapon = characterStats[1];
//        String hp = characterStats[2];
//
//        String expectedName = characterName[1];
//        String expectedWeapon = GameLogic.getWeaponName(1);
//        String expectedHp = Integer.toString(characterHp[1]);
//
//        assertEquals(expectedName, name);
//        assertEquals(expectedWeapon, weapon);
//        assertEquals(expectedHp, hp);
//    }

//    @Disabled
//    @Test
//    void printWhatWeaponACharacterHave() {
//        fail();
//    }

    @Test
    void currentlyEquippedWeapon() {
        fillLists();
        assertEquals(weaponNames[0], GameLogic.currentlyEquippedWeapon(0));
    }

    @Test
    void getCharacterName() {
        fillLists();
        assertEquals(characterName[0], GameLogic.getCharacterName(0));
    }

    @Test
    void getWeaponName() {
        fillLists();
        assertEquals(weaponNames[0], GameLogic.getWeaponName(0));
    }

    @Test
    void getWeaponDamage() {
        fillLists();
        assertEquals(weaponDamage[0], GameLogic.getWeaponDamage(0));
        assertNotEquals(weaponDamage[0], GameLogic.getWeaponDamage(1));
    }

    @Test
    void getIndexOfEquippedWeapon() {
        fillLists();
        assertEquals(charactersList.get(0).getEquippedWeapon(), GameLogic.getIndexOfEquippedWeapon(0));
    }

    @Test
    void getCurrentHp() {
        fillLists();
        for (int i = 0; i < charactersList.size(); i++) {
            assertEquals(charactersList.get(i).getHp(), GameLogic.getCurrentHp(i));
        }
    }

    @Test
    void drinkAPotion() {
        fillLists();
        String message;

        int initialHp = charactersList.get(2).getHp();
        message = GameLogic.drinkAPotion(2);
        assertEquals(initialHp + 20, charactersList.get(2).getHp());
        assertEquals(message, "Character3 GAINED 20 HEALTH BY DRINKING A HEALING POTION\n" +
                "Character3 NOW HAS A HEALTH OF 80");

        initialHp = charactersList.get(0).getHp();
        message = GameLogic.drinkAPotion(0);
        assertEquals(initialHp, charactersList.get(0).getHp());
        assertEquals(message, "Character1 GAINED 20 HEALTH BY DRINKING A HEALING POTION\n" +
                "Character1 NOW HAS A HEALTH OF 100");
    }

    @Test
    void someoneAttacks_attackDeadMan() {
        fillLists();
        String message;
        int attackerIndex = 0;
        int defenderIndex = 3;

        assertEquals(characterHp[defenderIndex], GameLogic.getCurrentHp(defenderIndex));
        message = GameLogic.someoneAttacks(attackerIndex, defenderIndex);
        assertEquals(characterHp[defenderIndex], GameLogic.getCurrentHp(defenderIndex));
        assertEquals(message, "CHARACTER ALREADY DEAD!");
    }

    @Test
    void someoneAttacks_normal() {
        fillLists();
        String message;
        int attackerIndex = 2;
        int defenderIndex = 0;

        assertEquals(characterHp[defenderIndex], GameLogic.getCurrentHp(defenderIndex));
        message = GameLogic.someoneAttacks(attackerIndex, defenderIndex);
        assertEquals(characterHp[defenderIndex] - weaponDamage[attackerIndex], GameLogic.getCurrentHp(defenderIndex));
        assertEquals(message, "Character3 STRIKES Character1 WITH A weapon3, IT DOES 25 DAMAGE\n" +
                "Character1 HAS 75 REMAINING HEALTH!");
    }

    @Test
    void someoneAttacks_killingAttack() {
        fillLists();
        String message;
        int attackerIndex = 0;
        int defenderIndex = 1;
        int definitionOfDead = 0;

        assertEquals(characterHp[defenderIndex], GameLogic.getCurrentHp(defenderIndex));
        message = GameLogic.someoneAttacks(attackerIndex, defenderIndex);
        assertEquals(definitionOfDead, GameLogic.getCurrentHp(defenderIndex));
        assertEquals(message, "Character1 STRIKES Character2 WITH A weapon1, IT DOES 100 DAMAGE\n" +
                "Character2 DIED!");
    }

    // Requirements for the grade G

    @Test
    void searchWeapon() {
        fillWeaponListTest();
        for (String weaponName : weaponNames) {
            assertTrue(GameLogic.searchWeapon(weaponName));
        }
        assertFalse(GameLogic.searchWeapon("Excalibur"));
    }

    @Test
    void witchCharacterHasTheWeaponEquipped() {

    }

    @Test
    void isWeaponNameInWeaponList() {
        fillWeaponListTest();
        for (int i = 0; i < weaponsList.size(); i++) {
            assertTrue(GameLogic.isWeaponNameInWeaponList(weaponNames[i]));
        }
        assertFalse(GameLogic.isWeaponNameInWeaponList("Excalibur"));
    }

    @Test
    void weaponNamesMatch() {
        assertTrue(GameLogic.weaponNamesMatch(weaponNames[1], weaponNames[1]));
        assertFalse(GameLogic.weaponNamesMatch(weaponNames[1], weaponNames[2]));
    }

    // Requirements for the grade VG
    @Test
    void equipWeaponIfWeaponIndexExist() {
        fillLists();
        String message;
        message = GameLogic.equipWeaponIfWeaponIndexExist(0, 2);
        assertEquals(message, "Weapon equipped");

        message = GameLogic.equipWeaponIfWeaponIndexExist(0, -1);
        assertEquals(message, "Couldn't find that weapon");
    }

    @Test
    void isWeaponFound() {
        fillLists();
        for (int i = 0; i < weaponsList.size(); i++) {
            assertTrue(GameLogic.isWeaponFound(i));
        }
        assertFalse(GameLogic.isWeaponFound(-1));
    }

    @Test
    void equipNewWeapon() {
        fillLists();
        int characterIndex = 1;
        int oldWeaponIndex = charactersList.get(characterIndex).getEquippedWeapon();
        System.out.println(oldWeaponIndex);

        int equipWeaponOnIndex = 0;
        GameLogic.equipNewWeapon(characterIndex, equipWeaponOnIndex);

        int newWeaponIndex = charactersList.get(characterIndex).getEquippedWeapon();
        System.out.println(newWeaponIndex);
        assertNotEquals(oldWeaponIndex, newWeaponIndex);

        assertEquals(newWeaponIndex,  equipWeaponOnIndex);
    }
}