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

class CharacterTest {

    private Character character;

    @BeforeEach
    void setUp() {
        character = new Character("Name", "Weapon");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void createCharacterWithTwoAttributes() throws Exception {
        assertEquals("Name", character.getName());
        assertEquals("Weapon", character.getWeapon());
    }

    @Test
    public void setWeaponName() throws Exception {
        String newWeapon = "New weapon name";
        character.setWeapon(newWeapon);
        assertEquals(newWeapon, character.getWeapon());
    }
}