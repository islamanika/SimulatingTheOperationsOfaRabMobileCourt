package mainPkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnalyzCrimActivSceneController implements Initializable {

    @FXML
    private TextField occAmountTextField;
    @FXML
    private TextField occYearTextField;
    @FXML
    private ComboBox<String> crimeTypeCB;
    @FXML
    private BarChart<?, ?> anaCriActBarChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private TextArea viewSavedInfoTextArea;
    @FXML
    private TextField inYrOfCriTextField;
    @FXML
    private Label outputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        crimeTypeCB.getItems().addAll("Food Adulteration", "Over-Price", "Fake Products", "False Advertisement");
    }

    private boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @FXML
    private void saveActInfoButtonOnClick(ActionEvent event) {
        // Validate input
        if (!isInteger(occAmountTextField.getText())) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Warning Alert");
            a.setHeaderText("Input Data Type Not Allowed");
            a.setContentText("Warrant ID must be an integer!");
            a.showAndWait();
            return;
        }

        // Validate input
        if (!isInteger(occYearTextField.getText())) {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Warning Alert");
            a.setHeaderText("Input Data Type Not Allowed");
            a.setContentText("Officer Badge Number must be an integer!");
            a.showAndWait();
            return;
        }

        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation Alert");
        a.setContentText("Please select Ok to confirm! Otherwise Cancel");

        Optional<ButtonType> result = a.showAndWait();
        if (result.get() == ButtonType.OK) {

            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File("CrimActivityObject.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                Criminal_Activity c = new Criminal_Activity(
                        Integer.parseInt(occAmountTextField.getText()),
                        Integer.parseInt(occYearTextField.getText()),
                        crimeTypeCB.getValue()
                );
                oos.writeObject(c);

            } catch (IOException ex) {
                Logger.getLogger(AnalyzCrimActivSceneController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AnalyzCrimActivSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            showInfoAlertAfterConfirmation("The data has been saved.");
        } else {
            //show appropriate cancellation message
            showInfoAlertAfterConfirmation("The Data was not saved!");
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
    private void viewSavedInfoButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void loadBarChartButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewMaxMinActButtonOnClick(ActionEvent event) {
    }

    private void showInfoAlertAfterConfirmation(String str) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setContentText(str);
        a.showAndWait();
    }

}
