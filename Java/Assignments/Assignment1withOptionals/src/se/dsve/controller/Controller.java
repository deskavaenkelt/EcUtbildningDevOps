package se.dsve.controller;

/*
  __
 /\ \
 \_\ \    ____  __  __     __
 /'_` \  /',__\/\ \/\ \  /'__`\
/\ \L\ \/\__, `\ \ \_/ |/\  __/
\ \___,_\/\____/\ \___/ \ \____\
 \/__,_ /\/___/  \/__/   \/____/
*/

import se.dsve.model.UserInput;
import se.dsve.view.UserInterfaceCli;

/**
 * Assignment 1 - Java DevOps
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since 2020-08-31.
 * https://github.com/deskavaenkelt/
 */

public class Controller {

    public static boolean PLAYING = true;
    private final CalculateStuff calculateStuff = new CalculateStuff();
    private final UserInterfaceCli userInterface = new UserInterfaceCli();
    private final UserInput userInput = new UserInput();

    public void start() {
        userInterface.logo();

        while (PLAYING) {
            userInterface.menu();
            int input = userInput.getNumberInt();
            choiceInMenu(input);
        }

        userInput.closeScanner();
    }

    private void choiceInMenu(int input) {
        switch (input) {
            case 1:
                calculateStuff.addition();
                break;
            case 2:
                calculateStuff.subtraction();
                break;
            case 3:
                calculateStuff.multiplication();
                break;
            case 4:
                calculateStuff.division();
                break;
            case 5:
                calculateStuff.sin();
                break;
            case 6:
                calculateStuff.cos();
                break;
            case 7:
                calculateStuff.tan();
                break;
            case 8:
                calculateStuff.regularExpression();
                break;
            case 9:
                userInterface.art();
                break;
            case 0:
                exit();
                break;
            default:
                start();
                break;
        }
    }


    private void exit() {
        userInterface.exit();
        PLAYING = false;
    }
}
