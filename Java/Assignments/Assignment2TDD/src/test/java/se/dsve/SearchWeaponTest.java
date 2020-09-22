package se.dsve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

public class SearchWeaponTest {

    private SearchWeapon g;

    @BeforeEach
    void setUp() throws Exception{
        g = new SearchWeapon();
    }

    private void searchWeapon(String expected, String weapon) {
        String actual = g.searchWeapon(weapon);
        assertEquals(expected, actual);
    }

    // G
    @Test
    public void searchFor_Excalibur() throws Exception {
        searchWeapon("Arthur have Excalibur equipped", "Excalibur");
    }

    @Test
    public void searchFor_MagicWand() throws Exception {
        searchWeapon("Merlin have Magic Wand equipped", "Magic Wand");
    }

    @Test
    public void searchFor_AnUnequippedWeapon() throws Exception {
        searchWeapon("Bastard Sword isn't equipped by any character", "Bastard Sword");
    }
}
