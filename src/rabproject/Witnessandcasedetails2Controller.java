/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rabproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Shakib
 */
public class Witnessandcasedetails2Controller implements Initializable {

    @FXML
    private TextField caseid;
    @FXML
    private TextField casetitle;
    @FXML
    private TextField casedetails;
    @FXML
    private TextField time;
    @FXML
    private DatePicker date;
    @FXML
    private TableView<WitnessandCaseDetails> witnesstable;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> evidences;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> witness;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> caseidcol;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> casetitlecol;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> casedetailscol;
    @FXML
    private TableColumn<WitnessandCaseDetails, String> timecol;
    @FXML
    private TableColumn<WitnessandCaseDetails, LocalDate> datecol;

    ObservableList<WitnessandCaseDetails> wcdList = FXCollections.observableArrayList();
    @FXML
    private TextField evidencess;
    @FXML
    private TextField witnesss;

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("inside of wd init");
        // TODO
        evidences.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("evidences"));
        witness.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("witness"));
        caseidcol.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("caseId"));
        casetitlecol.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("caseTitle"));
        casedetailscol.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("details"));
        timecol.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, String>("time"));
        datecol.setCellValueFactory(new PropertyValueFactory<WitnessandCaseDetails, LocalDate>("date"));
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("WitnessandCaseDetails.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            WitnessandCaseDetails wcd;
            try {
                while (true) {
                    wcd = (WitnessandCaseDetails) ois.readObject();
                    wcdList.add(wcd);
                    System.out.println(wcd.toString());
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
        witnesstable.setItems(wcdList);

    }

    private void updateonaction(ActionEvent event) {

    }

    @FXML
    private void updateOnclick(ActionEvent event) {
        // Validate input before creating WitnessandCaseDetails instance
        String caseIdText = caseid.getText();
        if (isValidCaseId(caseIdText)) {
            try {
                WitnessandCaseDetails wcd = new WitnessandCaseDetails(
                        Integer.parseInt(caseIdText),
                        date.getValue(),
                        time.getText(),
                        casetitle.getText(),
                        casedetails.getText(),
                        evidences.getText(),
                        witness.getText()
                );
                FileOutputStream fos = null;
                ObjectOutputStream oos = null;
                File f = null;

                try {
                    f = new File("WitnessandCaseDetails.bin");
                    if (f.exists()) {
                        fos = new FileOutputStream(f, true);
                        oos = new AppendableObjectOutputStream(fos);
                    } else {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                    }

                    oos.writeObject(wcd);
                    wcdList.add(wcd);
                    System.out.println("write object sucessfull ");

                } catch (IOException ex) {
                    Logger.getLogger(WitnessandcasedetailsController.class
                            .getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (oos != null) {
                            oos.close();

                        }
                    } catch (IOException ex) {
                        Logger.getLogger(WitnessandcasedetailsController.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                }

                // Use the wcd instance as needed
                System.out.println("Witness and Case Details submitted: " + wcd);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing Case ID to integer.");
            }
        } else {
            System.out.println("Invalid Case ID. Please enter a non-empty numeric value.");
        }

    }

    public boolean isValidCaseId(String caseIdText) {
        return !caseIdText.isEmpty() && caseIdText.matches("\\d+");
    }
}
