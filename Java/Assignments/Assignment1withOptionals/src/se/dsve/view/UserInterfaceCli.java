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
    public void menu() {
        System.out.println("+--------------------+");
        System.out.println("|     Calculator     |");
        System.out.println("+--------------------+");
        System.out.println("| 1. Addition        |");
        System.out.println("| 2. Subtraction     |");
        System.out.println("| 3. Multiplication  |");
        System.out.println("| 4. Division        |");
        System.out.println("| 5. Sin()           |");
        System.out.println("| 6. Cos()           |");
        System.out.println("| 7. Tan()           |");
        System.out.println("| 8. Expression      |");
        System.out.println("|                    |");
        System.out.println("| 0. Exit            |");
        System.out.println("+------------dsve.se-+");
        System.out.print("Choose: ");
    }

    public void addition() {
        System.out.println("+--------------------+");
        System.out.println("|      Addition      |");
        System.out.println("+--------------------+");
    }

    public void subtraction() {
        System.out.println("+--------------------+");
        System.out.println("|    Subtraction     |");
        System.out.println("+--------------------+");
    }

    public void multiplication() {
        System.out.println("+--------------------+");
        System.out.println("|   Multiplication   |");
        System.out.println("+--------------------+");
    }

    public void division() {
        System.out.println("+--------------------+");
        System.out.println("|      Division      |");
        System.out.println("+--------------------+");
    }

    public void sin() {
        System.out.println("+--------------------+");
        System.out.println("|       Sin()        |");
        System.out.println("+--------------------+");
        enterNumberInDegrees();
    }

    public void cos() {
        System.out.println("+--------------------+");
        System.out.println("|       Cos()        |");
        System.out.println("+--------------------+");
        enterNumberInDegrees();
    }

    public void tan() {
        System.out.println("+--------------------+");
        System.out.println("|       Tan()        |");
        System.out.println("+--------------------+");
        enterNumberInDegrees();
    }

    public void regularExpression() {
        System.out.println("+--------------------+");
        System.out.println("| Regular Expression |");
        System.out.println("+--------------------+");
        System.out.println("Warning! Can't handle unknown variables such as x, y, z");
        System.out.println();
        regularExpressionCanHandle();
        regularExpressionInstructions();
        System.out.print("Enter an expression to evaluate: ");
    }

    public void regularExpressionInstructions() {
        System.out.println("If your expression is '3log(y)/(x+1)' then replace y and x with a number");
        System.out.println("If y=3 and x=4 in example above");
        System.out.println("Then the expression should look like this '3log(3)/(4+1)'");
        System.out.println();
    }

    public void regularExpressionCanHandle() {
        System.out.println("Built-in functions:");
        System.out.println("- abs: absolute value");
        System.out.println("- acos: arc cosine");
        System.out.println("- asin: arc sine");
        System.out.println("- atan: arc tangent");
        System.out.println("- cbrt: cubic root");
        System.out.println("- ceil: nearest upper integer");
        System.out.println("- cos: cosine");
        System.out.println("- cosh: hyperbolic cosine");
        System.out.println("- exp: euler's number raised to the power (e^x)");
        System.out.println("- floor: nearest lower integer");
        System.out.println("- log: logarithmus naturalis (base e)");
        System.out.println("- log10: logarithm (base 10)");
        System.out.println("- log2: logarithm (base 2)");
        System.out.println("- sin: sine");
        System.out.println("- sinh: hyperbolic sine");
        System.out.println("- sqrt: square root");
        System.out.println("- tan: tangent");
        System.out.println("- tanh: hyperbolic tangent");
        System.out.println("- signum: signum function");
        System.out.println();
    }

    public void result() {
        System.out.println("+--------------------+");
        System.out.println("|       Result       |");
        System.out.println("+--------------------+");
    }

    public void enterNumber() {
        System.out.print("Enter number: ");
    }

    private void enterNumberInDegrees() {
        System.out.print("Enter number in degrees: ");
    }

    public void exit() {
        System.out.println("See you later alligator");
    }

    public void logo() {
        System.out.println("  __");
        System.out.println(" /\\ \\");
        System.out.println(" \\_\\ \\    ____  __  __     __");
        System.out.println(" /'_` \\  /',__\\/\\ \\/\\ \\  /'__`\\");
        System.out.println("/\\ \\L\\ \\/\\__, `\\ \\ \\_/ |/\\  __/");
        System.out.println("\\ \\___,_\\/\\____/\\ \\___/ \\ \\____\\");
        System.out.println(" \\/__,_ /\\/___/  \\/__/   \\/____/");
        System.out.println();
    }

    public void art() {
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
        System.out.println("\n\n");
    }
}
