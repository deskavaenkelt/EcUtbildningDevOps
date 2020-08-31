package se.dsve.view;

/*
  __
 /\ \
 \_\ \    ____  __  __     __
 /'_` \  /',__\/\ \/\ \  /'__`\
/\ \L\ \/\__, `\ \ \_/ |/\  __/
\ \___,_\/\____/\ \___/ \ \____\
 \/__,_ /\/___/  \/__/   \/____/

*/

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

public class UserInterfaceCli {
    public static void menu() {
        System.out.println("+--------------------+");
        System.out.println("|     Calculator     |");
        System.out.println("+--------------------+");
        System.out.println("| 1. Addition        |");
        System.out.println("| 2. Subtraction     |");
        System.out.println("| 3. Multiplication  |");
        System.out.println("| 4. Division        |");
        System.out.println("|                    |");
        System.out.println("| 0. Exit            |");
        System.out.println("+------------dsve.se-+");
        System.out.print("Choose: ");
    }

    public static void addition() {
        System.out.println("+--------------------+");
        System.out.println("|      Addition      |");
        System.out.println("+--------------------+");
    }

    public static void subtraction() {
        System.out.println("+--------------------+");
        System.out.println("|    Subtraction     |");
        System.out.println("+--------------------+");
    }

    public static void multiplication() {
        System.out.println("+--------------------+");
        System.out.println("|   Multiplication   |");
        System.out.println("+--------------------+");
    }

    public static void division() {
        System.out.println("+--------------------+");
        System.out.println("|      Division      |");
        System.out.println("+--------------------+");
    }

    public static void result() {
        System.out.println("+--------------------+");
        System.out.println("|       Result       |");
        System.out.println("+--------------------+");
    }

    public static void enterNumber() {
        System.out.print("Enter number: ");
    }

    public static void exit() {
        System.out.println("See you later alligator");
    }

    public static void art() {
        System.out.println("                          _");
        System.out.println("              .----------/ |<=== floppy disk");
        System.out.println("             /           | |");
        System.out.println("            /           /| |          _________");
        System.out.println("           /           / | |         | .-----. |");
        System.out.println("          /___________/ /| |         |=|     |-|");
        System.out.println("         [____________]/ | |         |~|_____|~|");
        System.out.println("         |       ___  |  | |         '-|     |-'");
        System.out.println("         |      /  _) |  | |           |.....|");
        System.out.println("function ======>|.'   |  | |           |     |<=== application");
        System.out.println("  key    |            |  | |    input  |.....|       software");
        System.out.println("         |            |  | |            `--._|");
        System.out.println("  main =>|            |  | |      |");
        System.out.println(" storage |            |  | ;______|_________________");
        System.out.println("         |            |  |.' ____\\|/_______________ `.");
        System.out.println("         |            | /|  (______________________)  )<== user");
        System.out.println("         |____________|/ \\___________________________/  interface");
        System.out.println("         '--||----: `'''''.__                      |");
        System.out.println("            || jgs `\"\"\";\"\"\"-.'-._ <== normal flow  |    central");
        System.out.println("            ||         |     `-. `'._of operation /<== processing");
        System.out.println("    ||      ||         |        `\\   '-.         /       unit");
        System.out.println("  surge     ().-.      |         |      :      /`");
        System.out.println("control ==>(_((X))     |      .-.       : <======= output");
        System.out.println(" device       '-'      \\     |   \\      ;      |________");
        System.out.println("    ||                  `\\  \\|/   '-..-'       / /_\\   /|");
        System.out.println("    ||                   /`-.____             |       / /");
        System.out.println("    ||                  /  _    /_____________|_     / /_");
        System.out.println("    ||    peripherals ==>/_\\___________________/_\\__/ /~ )__");
        System.out.println("    ||      (hardware) |____________________________|/  ~   )");
        System.out.println("    ||                                     (__~  ~     ~(~~`");
        System.out.println("    ||    overflow (input/output error) ===> (_~_  ~  ~_ `)");
        System.out.println("  .-''-.                                         `--~-' '`");
        System.out.println(" /______\\                              _________");
        System.out.println("  [____] <=== de-bugging tool       _|`---------`|");
        System.out.println("                                   (C|           |");
        System.out.println("                        back-up ===> \\           /");
        System.out.println(" |\\\\\\ ///|                            `=========`");
        System.out.println(" | \\V// |");
        System.out.println(" |  |~|  |");
        System.out.println(" |  |=|  | <=== supplemental data");
        System.out.println(" |  | |  |");
        System.out.println(" |  | |  |                          (()____");
        System.out.println("  \\ |=| /              mouse ===>  ('      `\\_______,");
        System.out.println("   \\|_|/                            `,,---,,'");
    }
}
