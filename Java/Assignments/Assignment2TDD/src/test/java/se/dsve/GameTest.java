package se.dsve;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

class GameTest {

    private Game game;
    String[] characterStats0 = {"Arthur", "Sword"};
    String[] characterStats1 = {"Merlin", "Magic Wand"};
    String[] characterStats2 = {"The Beast", "Battle Axe"};
    String changeToWeapon = "Excalibur";

    @BeforeEach
    void setUp() {
        game = new Game();
        createACharacterZero();
    }

    @AfterEach
    void tearDown() {
        game.listOfCharacters.clear();
    }

    private void createACharacterZero() {
        game.createCharacter(characterStats0[0], characterStats0[1]);
    }

    private void createCharacterOneAndTwo() {
        game.createCharacter(characterStats1[0], characterStats1[1]);
        game.createCharacter(characterStats2[0], characterStats2[1]);
    }

    @Test
    public void createCharacterAndVerifyExistence() throws Exception {
        assertEquals(characterStats0[0], game.listOfCharacters.get(0).getName());
        assertEquals(characterStats0[1], game.listOfCharacters.get(0).getWeapon());
    }

    @Test
    public void changeWeapon() throws Exception {
        game.changeWeaponTo(0, changeToWeapon);
        assertNotEquals(characterStats0[1], game.listOfCharacters.get(0).getWeapon());
        assertEquals(changeToWeapon, game.listOfCharacters.get(0).getWeapon());
    }

    @Test
    public void changeWeaponOnAllCharacters() throws Exception {
        createCharacterOneAndTwo();
        game.changeWeaponTo(0, changeToWeapon);
        assertNotEquals(characterStats0[1], game.listOfCharacters.get(0).getWeapon());
        assertEquals(changeToWeapon, game.listOfCharacters.get(0).getWeapon());

        game.changeWeaponTo(1, changeToWeapon);
        assertNotEquals(characterStats1[1], game.listOfCharacters.get(1).getWeapon());
        assertEquals(changeToWeapon, game.listOfCharacters.get(1).getWeapon());

        game.changeWeaponTo(2, changeToWeapon);
        assertNotEquals(characterStats2[1], game.listOfCharacters.get(2).getWeapon());
        assertEquals(changeToWeapon, game.listOfCharacters.get(2).getWeapon());
    }
}