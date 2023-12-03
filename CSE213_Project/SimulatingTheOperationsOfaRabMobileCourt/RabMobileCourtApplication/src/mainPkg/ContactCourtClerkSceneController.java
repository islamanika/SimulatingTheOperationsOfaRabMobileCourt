/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ContactCourtClerkSceneController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField messageIdTextField;
    @FXML
    private RadioButton regularRB;
    @FXML
    private RadioButton urgentRB;
    @FXML
    private TextArea msgToCourtClerkTextArea;
    @FXML
    private TextField signatureTextField;
    @FXML
    private DatePicker dateDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void sendMsgButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewMsgButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) {
    }

}
