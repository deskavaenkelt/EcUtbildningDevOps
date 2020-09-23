package se.dsve;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * __
 * /\ \
 * \_\ \    ____  __  __     __
 * /'_` \  /',__\/\ \/\ \  /'__`\
 * /\ \L\ \/\__, `\ \ \_/ |/\  __/
 * \ \___,_\/\____/\ \___/ \ \____\
 * \/__,_ /\/___/  \/__/   \/____/
 * Assignment1withGUI
 *
 * @author Lars Strömberg
 * @version 1.0
 * @since {2020-09-13}.
 * https://github.com/deskavaenkelt/
 */

public class Controller {

    Calculator calculator = new Calculator();

    @FXML
    private TextField inputField;
    @FXML
    private Button buttonClear;
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button buttonDivision;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonSubtraction;
    @FXML
    private Button buttonAddition;
    @FXML
    private Button buttonComma;
    @FXML
    private Button buttonResult;

    @FXML
    public void initialize() {
        buttonResult.setDisable(true);
        buttonClear.setDisable(true);
        buttonComma.setDisable(true);
    }

    @FXML
    public void onButtonInputClick(ActionEvent event) {
        if (event.getSource().equals(button0)) {
            updateInputField("0");
        } else if (event.getSource().equals(button1)) {
            updateInputField("1");
        } else if (event.getSource().equals(button2)) {
            updateInputField("2");
        } else if (event.getSource().equals(button3)) {
            updateInputField("3");
        } else if (event.getSource().equals(button4)) {
            updateInputField("4");
        } else if (event.getSource().equals(button5)) {
            updateInputField("5");
        } else if (event.getSource().equals(button6)) {
            updateInputField("6");
        } else if (event.getSource().equals(button7)) {
            updateInputField("7");
        } else if (event.getSource().equals(button8)) {
            updateInputField("8");
        } else if (event.getSource().equals(button9)) {
            updateInputField("9");
        } else if (event.getSource().equals(buttonDivision)) {
            updateInputField("/");
        } else if (event.getSource().equals(buttonMultiply)) {
            updateInputField("*");
        } else if (event.getSource().equals(buttonSubtraction)) {
            updateInputField("-");
        } else if (event.getSource().equals(buttonAddition)) {
            updateInputField("+");
        } else if (event.getSource().equals(buttonComma)) {
            updateInputField(".");
        }
    }

    private void updateInputField(String addToString) {
        String newInputFieldValue = inputField.getText();
        newInputFieldValue += addToString;
        inputField.setText(newInputFieldValue);
        handleKeyReleased();
    }

    @FXML
    public void onButtonEventClick(ActionEvent event) {
        if (event.getSource().equals(buttonResult)) {
            String result = calculateExpression(inputField.getText());
            inputField.setText(result);
        } else if (event.getSource().equals(buttonClear)) {
            inputField.setText("");
            handleKeyReleased();
        }
    }

    private String calculateExpression(String expressionToEvaluate) {
        double result = calculator.regularExpression(expressionToEvaluate);
        return String.valueOf(result);
    }

    @FXML
    public void handleKeyReleased() {
        String inputField = this.inputField.getText();
        boolean disableButtons = inputField.isEmpty() || inputField.trim().isEmpty();
        buttonResult.setDisable(disableButtons);
        buttonComma.setDisable(disableButtons);
        buttonClear.setDisable(disableButtons);
    }
}
