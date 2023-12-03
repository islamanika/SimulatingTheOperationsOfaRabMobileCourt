
package rabproject;

import java.time.LocalDate;


public class TimeextensionDetails {
    int caseId;
    LocalDate date;
    String caseTitle,details,time;

    public TimeextensionDetails(int caseId, LocalDate date, String caseTitle, String details, String time) {
        this.caseId = caseId;
        this.date = date;
        this.caseTitle = caseTitle;
        this.details = details;
        this.time = time;
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

    public String getTime() {
        return time;
    }
    
}
