package mainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnalyzCrimActivSceneController implements Initializable {

    @FXML
    private TextField occAmountTextField;
    @FXML
    private TextField occYearTextField;
    @FXML
    private ComboBox<?> crimeTypeCB;
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
        // TODO
    }

    @FXML
    private void saveActInfoButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) {
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

}
