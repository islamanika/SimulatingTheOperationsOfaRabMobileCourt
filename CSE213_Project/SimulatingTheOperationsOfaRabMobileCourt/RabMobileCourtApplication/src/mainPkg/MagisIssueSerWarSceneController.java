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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MagisIssueSerWarSceneController implements Initializable {

    @FXML
    private TableView<?> warReqTable;
    @FXML
    private TableColumn<?, ?> warIdCol;
    @FXML
    private TableColumn<?, ?> nameInstCol;
    @FXML
    private TableColumn<?, ?> typeInstCol;
    @FXML
    private TableColumn<?, ?> propDateOfSerCol;
    @FXML
    private TableColumn<?, ?> badgeNumCol;
    @FXML
    private TableColumn<?, ?> serReasCol;
    @FXML
    private TextField warIdTextField;
    @FXML
    private TextField instiNameTextField;
    @FXML
    private TextField rabOffiIdTextField;
    @FXML
    private TextField numOfSubTextField;
    @FXML
    private TextField usersNameTextField;
    @FXML
    private DatePicker datePicker;
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
    private void loadWarReqButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MagistrateDashScene.fxml"));
        Parent secondRoot = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(secondRoot));
    }

    @FXML
    private void viewDraftButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void issueWarButtonOnClick(ActionEvent event) {
    }

}
