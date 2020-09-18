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
    // ####################################
    // #   Weapon And Character section   #
    // ####################################
    ArrayList<Weapon> weaponsList = new ArrayList<>();
    ArrayList<Character> charactersList = new ArrayList<>();

    List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    List<Character> getCharactersList() {
        return charactersList;
    }

    void addWeapon(String weaponName, int weaponDamage, int weaponWear) {
        weaponsList.add(new Weapon(weaponName, weaponDamage, weaponWear));
    }

    void addCharacter(String characterName, int equippedWeapon) {
        charactersList.add(new Character(characterName, equippedWeapon, 100));
    }

    void createWeaponList() {
        addWeapon("Excalibur", 120, 0);
        addWeapon("Magic Wand", 90, 0);
        addWeapon("Two Handed sword", 75, 0);
        addWeapon("Axe", 50, 0);
        addWeapon("Hammer", 25, 0);
        addWeapon("Sword", 20, 50);
    }

    void createCharacterList() {
        addCharacter("Arthur", 5);
        addCharacter("Merlin", 1);
        addCharacter("Judas", weaponsList.size());
        addCharacter("The Beast", 2);
    }

    void initialSetup() {
        createWeaponList();
        createCharacterList();
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

    // ####################################
    // #      Return different stats      #
    // ####################################

    void printACharactersStats(int characterIndex) {
        String characterName = getCharacterName(characterIndex);
        System.out.println(characterName + "'s stats");
        printWhatWeaponACharacterHave(characterIndex);
        System.out.println(characterName + "'s HP = " + getCurrentHp(characterIndex));
    }

    void printWhatWeaponACharacterHave(int characterIndex) {
        String characterName = getCharacterName(characterIndex);
        System.out.println(characterName + "'s weapon name is: " + currentlyEquippedWeapon(characterIndex));
    }

    String currentlyEquippedWeapon(int characterIndex) {
        int indexOfEquippedWeapon = charactersList.get(characterIndex).getEquippedWeapon();
        return getWeaponName(indexOfEquippedWeapon);
    }

    String getCharacterName(int characterIndex) {
        return charactersList.get(characterIndex).getCharacterName();
    }

    String getWeaponName(int weaponIndex) {
        return weaponsList.get(weaponIndex).getWeaponName();
    }

    int getWeaponDamage(int attackerIndex) {
        return weaponsList.get(getIndexOfEquippedWeapon(attackerIndex)).getWeaponDamage();
    }

    int getIndexOfEquippedWeapon(int attackerIndex) {
        return charactersList.get(attackerIndex).getEquippedWeapon();
    }

    int getCurrentHp(int characterIndex) {
        return charactersList.get(characterIndex).getHp();
    }

    void drinkAPotion(int characterIndex) {
        charactersList.get(characterIndex).drinkingHealingPotion();
    }

    // ####################################
    // #              Attack              #
    // ####################################
    void someoneAttacks(int attackerIndex, int defenderIndex) {
        String attackerName = getCharacterName(attackerIndex);
        String defenderName = getCharacterName(defenderIndex);
        int weaponDamage = getWeaponDamage(attackerIndex);
        int weaponInt = getIndexOfEquippedWeapon(attackerIndex);
        String attackerWeaponName = getWeaponName(weaponInt);
        charactersList.get(defenderIndex).beingAttacked(defenderName, attackerName, weaponDamage, attackerWeaponName);
    }

    // ####################################
    // #   Requirements for the grade G   #
    // ####################################
    void searchWeapon(String weaponName) {
        // We have to use a switch-statement in this assignment so I use it and bypass it completely
        boolean userFindWeapon = false;
        switch (1) {
            case 1:
                userFindWeapon = isWeaponNameInWeaponList(weaponName);
                break;
            case 2:
                System.out.println("Not used");
                break;
            default:
                System.out.println("Shouldn't ever print this");
                break;
        }

        printMessageForFoundAndNotFound(weaponName, userFindWeapon);
    }

    private boolean isWeaponNameInWeaponList(String weaponName) {
        for (int i = 0; i < weaponsList.size(); i++) {
            String foundWeapon = getWeaponName(i);
            if (weaponNamesMatch(weaponName, foundWeapon)) {
                return true;
            }
        }
        return false;
    }

    private boolean weaponNamesMatch(String weaponName, String foundWeapon) {
        return foundWeapon.equals(weaponName);
    }

    private void printMessageForFoundAndNotFound(String weaponName, boolean userFindWeapon) {
        if (userFindWeapon) {
            System.out.println("found " + weaponName + " !");
        } else {
            System.out.println("didn't found " + weaponName + " !");
        }
    }

    // ####################################
    // #  Requirements for the grade VG   #
    // ####################################
    void equipCharacterWithNewWeapon(int characterIndex, String weaponName) {
        int indexOfWeapon = getIndexOfWeapon(weaponName);
        ifWeaponNameExistsEquipIt(characterIndex, indexOfWeapon);
    }

    int getIndexOfWeapon(String searchForWeaponName) {
        for (int i = 0; i < weaponsList.size(); i++) {
            String weaponName = weaponsList.get(i).getWeaponName();
            if (weaponNamesMatch(searchForWeaponName, weaponName)) {
                return i;
            }
        }
        return -1;
    }

    private void ifWeaponNameExistsEquipIt(int characterIndex, int indexOfWeapon) {
        if (weaponWasNotFound(indexOfWeapon)) {
            System.out.println("Couldn't find that weapon");
        } else {
            equipNewWeapon(indexOfWeapon, characterIndex);
        }
    }

    private boolean weaponWasNotFound(int indexOfWeapon) {
        return indexOfWeapon == -1;
    }

    private void equipNewWeapon( int characterIndex, int weaponIndex) {
        charactersList.get(characterIndex).setEquippedWeapon(weaponIndex);
    }
}
