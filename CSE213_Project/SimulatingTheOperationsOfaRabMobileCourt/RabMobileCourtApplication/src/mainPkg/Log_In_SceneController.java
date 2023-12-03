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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamida
 */
public class Log_In_SceneController implements Initializable {

    @FXML
    private TextField passwordTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
    @FXML
    private TextArea notificationTextArea;
    @FXML
    private TextField userIdTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll("RAB Officer","District Officer",
                "Operations Administrator","Undercover Investigator");
        // TODO
    }    

    @FXML
    private void loginOnClick(ActionEvent event) throws IOException {
        String userId=userIdTextField.getText();
        if(userId.equals("")){
            notificationTextArea.setText("Select User Id ");
        }
        String password=passwordTextField.getText();
        if(password.equals("")){
            notificationTextArea.setText("Select password ");
        }
        
        String userType=userTypeComboBox.getValue();
        if(userType==null){
            notificationTextArea.setText("Select User Type ");
        }
        
        
        
        
        if(userId.equals("123") && password.equals("123") && "Operations Administrator".equals(userType) ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("U7_Operations_Administrator_DashBoard.fxml"));
            Parent secondRoot=loader.load();
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(secondRoot));

        }
        
        if(userId.equals("123") && password.equals("123") && "Undercover Investigator".equals(userType) ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("U8_Undercover_Investigator_DashBoard.fxml"));
            Parent secondRoot=loader.load();
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(secondRoot));

        }
        
        if(userId.equals("123") && password.equals("123") && "RAB Officer".equals(userType) ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RabOfficerDashScene.fxml"));
            Parent secondRoot=loader.load();
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(secondRoot));

        }
        
        if(userId.equals("123") && password.equals("123") && "District Officer".equals(userType) ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DistrictOfficerdashBoardFXML.fxml"));
            Parent secondRoot=loader.load();
            Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(secondRoot));

        }
        
        
    }
    
}
