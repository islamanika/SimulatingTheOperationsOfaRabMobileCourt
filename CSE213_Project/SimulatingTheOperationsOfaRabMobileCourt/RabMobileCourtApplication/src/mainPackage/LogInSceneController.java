package mainPackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> userTypeCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeCombo.getItems().addAll("RAB Officer", "Magistrate", "District Officer",
                "Operations Administrator", "Undercover Investigator", "Lawyer", "Court Clerk", "Defendant");
    }

    @FXML
    private void logInButtonClick(ActionEvent event) throws IOException {
        int userId;
        String pass_str;
        userId = Integer.parseInt(idTextField.getText());
        pass_str = passwordField.getText();
        if ((userId == 2030660) && pass_str.equals("123") && userTypeCombo.getValue().equals("Affiliate Partner")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("AffiliatorDashScene.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else if ((userId == 2030664) && pass_str.equals("123") && userTypeCombo.getValue().equals("Corporate Client")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("CorpClientDashboardScene.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else if ((userId == 1378) && pass_str.equals("123") && userTypeCombo.getValue().equals("Restaurant Manager")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("RestaurantManagerDashboard.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else if ((userId == 3015) && pass_str.equals("123") && userTypeCombo.getValue().equals("Customer Care Executive")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("CustomerCareExecutiveDashboard.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else if ((userId == 2111) && pass_str.equals("123") && userTypeCombo.getValue().equals("Customer")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("CustomerDashboard.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else if ((userId == 2112) && pass_str.equals("123") && userTypeCombo.getValue().equals("Accountant")) {
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Welcome " + userId);
            a1.showAndWait();

            Parent parent = FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));

            Scene scene = new Scene(parent);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(scene);
            stg.show();
        } else {
            Alert a2 = new Alert(Alert.AlertType.WARNING);
            a2.setTitle("Warning ");
            a2.setHeaderText("LogIn Failed");
//            a2.setContentText("Wrong ID/Password");
            a2.setContentText("Wrong ID/Password. Please Try Again");
            a2.showAndWait();
        }
    }

    @FXML
    private void signUpButtonClick(ActionEvent event) {
    }

    @FXML
    private void passResetButtonClick(ActionEvent event) {
    }

    @FXML
    private void hyperLinkClick(ActionEvent event) {
    }

}
