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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RabOfficerDashScene.fxml"));
        Parent secondRoot = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(secondRoot));
    }

}
