/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainPkg;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class U1_BudgetAllocationFXMLController implements Initializable {

    @FXML
    private TextField budgetTextField;
    @FXML
    private TableView<U1_Budget> budgetAllocationTableView;
    @FXML
    private TableColumn<U1_Budget, String> operationTableCol;
    @FXML
    private TableColumn<U1_Budget, String> placeTableCol;
    @FXML
    private TableColumn<U1_Budget, Integer> budgetTableCol;
    @FXML
    private ComboBox<String> operationTypeComboBox;
    @FXML
    private ComboBox<String> placeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void allocateBudgetOnClick(ActionEvent event) {
    }

    @FXML
    private void saveToFileOnClick(ActionEvent event) {
    }

    @FXML
    private void returnHomeOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader someLoader = new FXMLLoader(getClass().getResource("DistrictOfficerdashBoardFXML.fxml"));
        root = (Parent) someLoader.load();
        Scene someScene = new Scene(root);
        

        
        Stage someStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        someStage.setScene(someScene);
        someStage.show();
    }

    
}
