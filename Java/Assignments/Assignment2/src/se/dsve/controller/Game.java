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
 * @since {2020-09-16}.
 * https://github.com/deskavaenkelt/
 */

public class Game {
    GameLogic gameLogic = new GameLogic();
    private final int ARTHUR_CHARACTER_INDEX = 0;
    private final int THE_BEAST_CHARACTER_INDEX = 3;
    private final int EXCALIBUR_WEAPON_INDEX = 0;

    public void start() {
        GameLogic.initialSetup();
        gameLogic.printAllWeapons();
        gameLogic.printAllCharacters();
        printLineSeparator();


        whatCharacterHasACertainWeaponEquipped();

        printArthurStats();
        printTheBeastStats();

        arthurAttackTheBeast();
        theBeastDrinksAPotion();

        theBeastSearchForAWeapon();
        theBeastAttacksArthur();
        arthurDrinksPotionFourTimes();

        arthurSearchForExcalibur();
        arthurEquipsExcalibur();

        arthurAttackTheBeast();
    }

    private void printLineSeparator() {
        System.out.println("----------------------------------------------------------------------------");
    }

    private void whatCharacterHasACertainWeaponEquipped() {
        String name = "Bastard Sword";
        String message = GameLogic.witchCharacterHasTheWeaponEquipped(name);
        System.out.println(message);

        name = "Excalibur";
        message = GameLogic.witchCharacterHasTheWeaponEquipped(name);
        System.out.println(message);

        name = "Magic Wand";
        message = GameLogic.witchCharacterHasTheWeaponEquipped(name);
        System.out.println(message);
        printLineSeparator();
    }

    private void printArthurStats() {
        System.out.println(Print.characterStats(ARTHUR_CHARACTER_INDEX));
        printLineSeparator();
    }

    private void printTheBeastStats() {
        System.out.println(Print.characterStats(THE_BEAST_CHARACTER_INDEX));
        printLineSeparator();
    }

    private void arthurAttackTheBeast() {
        String message = GameLogic.someoneAttacks(ARTHUR_CHARACTER_INDEX, THE_BEAST_CHARACTER_INDEX);
        System.out.println(message);
        printLineSeparator();
    }

    private void theBeastDrinksAPotion() {
        String message = GameLogic.drinkAPotion(THE_BEAST_CHARACTER_INDEX);
        System.out.println(message);
        printLineSeparator();
    }

    private void theBeastSearchForAWeapon() {
        System.out.println("The Beast searches for a new weapon...");
        String name = "Bastard Sword";
        boolean theBeastFindWeapon = GameLogic.searchWeapon(name);

        System.out.print("Arthur ");
        if (theBeastFindWeapon) {
            System.out.println("found " + name + " !");
        } else {
            System.out.println("didn't found " + name + " !");
        }
        printLineSeparator();
    }

    private void theBeastAttacksArthur() {
        String message = GameLogic.someoneAttacks(THE_BEAST_CHARACTER_INDEX, ARTHUR_CHARACTER_INDEX);
        System.out.println(message);
        printLineSeparator();
    }

    private void arthurDrinksPotionFourTimes() {
        for (int i = 0; i < 4; i++) {
            String message = GameLogic.drinkAPotion(ARTHUR_CHARACTER_INDEX);
            System.out.println(message);
        }
        printLineSeparator();
    }

    private void arthurSearchForExcalibur() {
        System.out.println("Arthur searches for a new weapon...");
        String weaponName = GameLogic.getWeaponName(EXCALIBUR_WEAPON_INDEX);
        boolean arthurFindWeapon = GameLogic.searchWeapon(weaponName);

        System.out.print("Arthur ");
        if (arthurFindWeapon) {
            System.out.println("found " + weaponName + " !");
        } else {
            System.out.println("didn't found " + weaponName + " !");
        }
        printLineSeparator();
    }

    private void arthurEquipsExcalibur() {
        printEquippedWeapon(ARTHUR_CHARACTER_INDEX);

        arthurChangeWeapon();

        printEquippedWeapon(ARTHUR_CHARACTER_INDEX);
        printLineSeparator();
    }

    private void arthurChangeWeapon() {
        System.out.println("Arthur throws his old weapon on the ground and equips Excalibur");
        String message = GameLogic.equipWeaponIfWeaponIndexExist(ARTHUR_CHARACTER_INDEX, EXCALIBUR_WEAPON_INDEX);
        System.out.println(message);
    }

    private void printEquippedWeapon(int characterIndex) {
        System.out.println(Print.charactersEquippedWeapon(characterIndex));
    }
}
