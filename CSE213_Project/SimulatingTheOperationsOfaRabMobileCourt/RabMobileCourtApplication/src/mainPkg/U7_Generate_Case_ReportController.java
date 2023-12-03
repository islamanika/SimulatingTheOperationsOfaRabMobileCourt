/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainPkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamida
 */
public class U7_Generate_Case_ReportController implements Initializable {

    @FXML
    private TextArea reportDetailsTextArea;
    @FXML
    private DatePicker caseReportDatePicker;
    @FXML
    private TextArea showSaveReportTextArea;
    @FXML
    private Label notificationLabel;
    @FXML
    private ComboBox<String> yearComboBox;
    @FXML
    private TextField caseReportIdTextField;
    @FXML
    private ComboBox<String> monthComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         monthComboBox.getItems().addAll("January","February","March","April",
                "May","June","July","August","September","October",
                "November","December");
        yearComboBox.getItems().addAll("2023","2024","2025");
    }    

    @FXML
    private void saveReportOnClick(ActionEvent event) {
        
        String reportId=caseReportIdTextField.getText();
        if(reportId.equals("")){
            notificationLabel.setText("Please Select Report id");
            return;
        }
        
        LocalDate reportDate=caseReportDatePicker.getValue();
        if(reportDate==null){
            notificationLabel.setText("Please Select Report Date");
            return;
        }
        
        String Description=reportDetailsTextArea.getText();
        if(Description.equals("")){
            notificationLabel.setText("Please Select Report Details");
            return;
        }
        
        String month=monthComboBox.getValue();
        if(month==null){
            notificationLabel.setText("Please Select Report Month");
            return;
        }
        
        String year=yearComboBox.getValue();
        if(year==null){
            notificationLabel.setText("Please Select Report Year");
            return;
        }
        
        try{
            String fileName="User7_All_File//Case_Report//"+month+year+".txt";
            File file=new File(fileName);
            if(!file.exists())file.createNewFile();
            
            boolean existCaseReport=false;
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String [] part=sc.nextLine().split("#");
                if(reportId.equals(part[0])){
                    existCaseReport=true;
                    break;
                }
            
            }
            
            if(existCaseReport){
                notificationLabel.setText("Report Id Already Exist!");
                return;
            }
            else{
                FileWriter fileWriter=new FileWriter(file,true);
                fileWriter.write(reportId+"#"+reportDate+"#"+Description+"\n");
                fileWriter.close();
            }
        
        }catch(Exception e){
            notificationLabel.setText("Something is Wrong!");
            
        }
        
        
        U7_Case_Report caseReport=new U7_Case_Report(reportId,reportDate,Description);
        showSaveReportTextArea.setText(caseReport.toString());
        
        caseReportIdTextField.clear();
        caseReportIdTextField.clear();
        caseReportDatePicker.setValue(null);
        
        
        
    }

    @FXML
    private void viewCaseReportOnClick(ActionEvent event) {
    }

    @FXML
    private void backToDashBoardOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("U7_Operations_Administrator_DashBoard.fxml"));
        Parent secondRoot=loader.load();
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(secondRoot));
    }
    
}
