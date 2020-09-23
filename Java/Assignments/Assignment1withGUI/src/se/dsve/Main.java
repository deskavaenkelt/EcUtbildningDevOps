package se.dsve;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 300, 400));
        root.getStylesheets().add("se/dsve/styles.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
