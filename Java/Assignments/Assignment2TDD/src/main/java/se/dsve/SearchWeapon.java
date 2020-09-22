package se.dsve;

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

public class SearchWeapon {
    public String searchWeapon(String searchForWeapon) {
        switch (searchForWeapon) {
            case "Excalibur":
                return "Arthur have " + searchForWeapon + " equipped";
            case "Magic Wand":
                return "Merlin have " + searchForWeapon + " equipped";
            default:
                return searchForWeapon + " isn't equipped by any character";
        }
    }
}
