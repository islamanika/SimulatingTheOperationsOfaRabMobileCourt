package mainPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MagisIssueSerWarSceneController implements Initializable {

    @FXML
    private TableView<Search_Warrant> warReqTable;
    @FXML
    private TableColumn<Search_Warrant, Integer> warIdCol;
    @FXML
    private TableColumn<Search_Warrant, String> nameInstCol;
    @FXML
    private TableColumn<Search_Warrant, String> typeInstCol;
    @FXML
    private TableColumn<Search_Warrant, LocalDate> propDateOfSerCol;
    @FXML
    private TableColumn<Search_Warrant, Integer> badgeNumCol;
    @FXML
    private TableColumn<Search_Warrant, String> serReasCol;
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
        warIdCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, Integer>("warrantId"));
        nameInstCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, String>("institutionName"));
        typeInstCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, String>("institutionType"));
        propDateOfSerCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, LocalDate>("searchDate"));
        badgeNumCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, Integer>("badgeNumber"));
        serReasCol.setCellValueFactory(new PropertyValueFactory<Search_Warrant, String>("reasonForSearch"));
    }

    @FXML
    private void loadWarReqButtonOnClick(ActionEvent event) {

        ObjectInputStream ois = null;
        try {
            Search_Warrant s;
            ois = new ObjectInputStream(new FileInputStream("SerWarObjects.bin"));
            s = (Search_Warrant) ois.readObject();
            warReqTable.getItems().add(s);
            s = (Search_Warrant) ois.readObject();
            warReqTable.getItems().add(s);

        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
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
        Issued_Warrant draftWarrant = new Issued_Warrant(Integer.parseInt(warIdTextField.getText()), Integer.parseInt(rabOffiIdTextField.getText()), instiNameTextField.getText(), Integer.parseInt(numOfSubTextField.getText()), usersNameTextField.getText(), datePicker.getValue());
        
        viewDraftTextArea.setText(draftWarrant.toString());
    }

    @FXML
    private void issueWarButtonOnClick(ActionEvent event) {

    }

}
