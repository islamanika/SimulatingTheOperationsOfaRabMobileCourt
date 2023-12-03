package rabproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Rabproject extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("defandentdashboard.fxml"));

        // Set up the stage
        primaryStage.setTitle("Rabproject");
        primaryStage.setScene(new Scene(root, 600, 400));

        // Show the stage
        primaryStage.show();
    }

    // This method will handle the button click action
    public void addonclick(ActionEvent event) {
        // Your implementation for the action goes here
        System.out.println("Button clicked!");
    }
}
