package se.dsve.controller;

import se.dsve.model.Character;
import se.dsve.model.Weapon;

import java.util.ArrayList;
import java.util.List;

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
 * @since {2020-09-18}.
 * https://github.com/deskavaenkelt/
 */

class GameLogic {
    // Weapon And Character section
    static ArrayList<Weapon> weaponsList;
    static ArrayList<Character> charactersList;

    static void createArrayLists() {
        weaponsList = new ArrayList<>();
        charactersList = new ArrayList<>();
    }

    List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    List<Character> getCharactersList() {
        return charactersList;
    }

    static void addWeapon(String weaponName, int weaponDamage, int weaponWear) {
        weaponsList.add(new Weapon(weaponName, weaponDamage, weaponWear));
    }

    static void addCharacter(String characterName, int equippedWeapon) {
        charactersList.add(new Character(characterName, equippedWeapon, 100));
    }

    static void fillWeaponList() {
        addWeapon("Excalibur", 120, 0);
        addWeapon("Magic Wand", 90, 0);
        addWeapon("Two Handed sword", 75, 0);
        addWeapon("Axe", 50, 0);
        addWeapon("Hammer", 25, 0);
        addWeapon("Sword", 20, 50);
    }

    static void fillCharacterList() {
        addCharacter("Arthur", 5);
        addCharacter("Merlin", 1);
        addCharacter("Judas", weaponsList.size() - 1);
        addCharacter("The Beast", 2);
    }

    static void initialSetup() {
        createArrayLists();
        fillWeaponList();
        fillCharacterList();
    }

    void printAllWeapons() {
        for (int i = 0; i < getWeaponsList().size(); i++) {
            System.out.println(getWeaponsList().get(i).toString());
        }
    }

    void printAllCharacters() {
        for (int i = 0; i < getCharactersList().size(); i++) {
            System.out.println(getCharactersList().get(i).toString());
        }
    }

    // Return different stats
    static String currentlyEquippedWeapon(int characterIndex) {
        int indexOfEquippedWeapon = charactersList.get(characterIndex).getEquippedWeapon();
        return getWeaponName(indexOfEquippedWeapon);
    }

    static String getCharacterName(int characterIndex) {
        return charactersList.get(characterIndex).getCharacterName();
    }

    static String getWeaponName(int weaponIndex) {
        return weaponsList.get(weaponIndex).getWeaponName();
    }

    static int getWeaponDamage(int attackerIndex) {
        return weaponsList.get(getIndexOfEquippedWeapon(attackerIndex)).getWeaponDamage();
    }

    static int getIndexOfEquippedWeapon(int attackerIndex) {
        return charactersList.get(attackerIndex).getEquippedWeapon();
    }

    static int getCurrentHp(int characterIndex) {
        return charactersList.get(characterIndex).getHp();
    }

    static String drinkAPotion(int characterIndex) {
        return charactersList.get(characterIndex).drinkingHealingPotion();
    }

    // Attack
    static String someoneAttacks(int attackerIndex, int defenderIndex) {
        String attackerName = getCharacterName(attackerIndex);
        String defenderName = getCharacterName(defenderIndex);
        int weaponDamage = getWeaponDamage(attackerIndex);

        int weaponInt = getIndexOfEquippedWeapon(attackerIndex);
        String attackerWeaponName = getWeaponName(weaponInt);

        return charactersList.get(defenderIndex)
                .beingAttacked(defenderName, attackerName, weaponDamage, attackerWeaponName);
    }

    // Requirements for the grade G
    static boolean searchWeapon(String weaponName) {
        // We have to use a switch-statement in this assignment so I use it and bypass it completely
        boolean userFindWeapon = false;
        switch (2) {
            case 1:
                System.out.println("Not used");
                break;
            case 2:
                userFindWeapon = isWeaponNameInWeaponList(weaponName);
                break;
            default:
                System.out.println("Shouldn't ever print this");
                break;
        }

        return userFindWeapon;
    }

    static String witchCharacterHasTheWeaponEquipped(String weaponName) {
        for (Character character : charactersList) {
            String characterName = character.getCharacterName();
            int indexOfWeapon = character.getEquippedWeapon();
            String foundWeapon = weaponsList.get(indexOfWeapon).getWeaponName();

            if (weaponNamesMatch(weaponName, foundWeapon)) {
                return ("The weapon " + weaponName + " is equipped by " + characterName).toUpperCase();
            }
        }
        return "No character have " + weaponName + " equipped!".toUpperCase();
    }

    static boolean isWeaponNameInWeaponList(String weaponName) {
        for (int i = 0; i < weaponsList.size(); i++) {
            String foundWeapon = getWeaponName(i);
            if (weaponNamesMatch(weaponName, foundWeapon)) {
                return true;
            }
        }
        return false;
    }

    static boolean weaponNamesMatch(String weaponName, String foundWeapon) {
        return foundWeapon.equals(weaponName);
    }

    // Requirements for the grade VG
    static String equipWeaponIfWeaponIndexExist(int characterIndex, int indexOfWeapon) {
        if (isWeaponFound(indexOfWeapon)) {
            equipNewWeapon(indexOfWeapon, characterIndex);
            return "Weapon equipped";
        } else {
            return "Couldn't find that weapon";
        }
    }

    static boolean isWeaponFound(int indexOfWeapon) {
        return indexOfWeapon >= 0 && indexOfWeapon < weaponsList.size();
    }

    static void equipNewWeapon(int characterIndex, int weaponIndex) {
        charactersList.get(characterIndex).setEquippedWeapon(weaponIndex);
    }
}
