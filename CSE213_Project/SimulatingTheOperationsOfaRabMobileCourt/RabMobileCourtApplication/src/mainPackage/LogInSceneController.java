/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainPackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tabri
 */
public class LogInSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<?> userTypeCombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logInButtonClick(ActionEvent event) {
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
