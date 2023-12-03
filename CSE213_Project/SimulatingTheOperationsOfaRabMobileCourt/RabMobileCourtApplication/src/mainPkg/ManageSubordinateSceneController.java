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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ManageSubordinateSceneController implements Initializable {

    @FXML
    private DatePicker dateOfOpDatePicker;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextField instiNameTextField;
    @FXML
    private ComboBox<?> instiTypeCB;
    @FXML
    private TextField numOfSubTextField;
    @FXML
    private TextArea viewDraftTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void viewDraftButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void saveInfoButtonOnClick(ActionEvent event) {
    }

}
