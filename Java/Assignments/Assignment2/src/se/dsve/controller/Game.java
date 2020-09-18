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
        gameLogic.initialSetup();
        gameLogic.printAllWeapons();
        gameLogic.printAllCharacters();

        printArthurStats();
        arthurAttackTheBeast();
        theBeastDrinksAPotion();
        theBeastAttacksArthur();
        arthurDrinksPotionFourTimes();
        arthurSearchForExcalibur();
        arthurEquipsExcalibur();
        arthurAttackTheBeast();
    }

    private void printArthurStats() {
        gameLogic.printACharactersStats(ARTHUR_CHARACTER_INDEX);
        System.out.println("--------------------------------------");
    }

    private void arthurAttackTheBeast() {
        gameLogic.someoneAttacks(ARTHUR_CHARACTER_INDEX, THE_BEAST_CHARACTER_INDEX);
    }

    private void theBeastAttacksArthur() {
        gameLogic.someoneAttacks(THE_BEAST_CHARACTER_INDEX, ARTHUR_CHARACTER_INDEX);
    }

    private void theBeastDrinksAPotion() {
        gameLogic.drinkAPotion(THE_BEAST_CHARACTER_INDEX);
    }

    private void arthurDrinksPotionFourTimes() {
        for (int i = 0; i < 4; i++) {
            gameLogic.drinkAPotion(ARTHUR_CHARACTER_INDEX);
        }
    }

    private void arthurSearchForExcalibur() {
        System.out.println("Arthur searches for a new weapon...");
        System.out.print("Arthur ");
        String weaponName = gameLogic.getWeaponName(EXCALIBUR_WEAPON_INDEX);
        gameLogic.searchWeapon(weaponName);
        System.out.println("--------------------------------------");
    }

    private void arthurEquipsExcalibur() {
        gameLogic.printWhatWeaponACharacterHave(ARTHUR_CHARACTER_INDEX);
        System.out.println("Arthur throws his old weapon on the ground and equips Excalibur");
        String weaponName = gameLogic.getWeaponName(EXCALIBUR_WEAPON_INDEX);
        gameLogic.equipCharacterWithNewWeapon(ARTHUR_CHARACTER_INDEX, weaponName);
        gameLogic.printWhatWeaponACharacterHave(ARTHUR_CHARACTER_INDEX);
        System.out.println("--------------------------------------");
    }
}
