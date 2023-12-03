package rabproject;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.scene.control.cell.PropertyValueFactory;

public class WitnessandCaseDetails implements Serializable {

    int caseId;
    LocalDate date;
    String caseTitle, details, evidences, witness, time;



    public WitnessandCaseDetails(int caseId, LocalDate date, String time, String caseTitle, String details, String evidences, String witness) {
        this.caseId = caseId;
        this.date = date;
        this.time = time;
        this.caseTitle = caseTitle;
        this.details = details;
        this.evidences = evidences;
        this.witness = witness;
    }

    @Override
    public String toString() {
        return "WitnessandCaseDetails{" + "caseId=" + caseId + ", date=" + date + ", caseTitle=" + caseTitle + ", details=" + details + ", evidences=" + evidences + ", witness=" + witness + ", time=" + time + '}';
    }

    public int getCaseId() {
        return caseId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public String getDetails() {
        return details;
    }

    public String getEvidences() {
        return evidences;
    }

    public String getWitness() {
        return witness;
    }

    public String getTime() {
        return time;
    }

   

}
