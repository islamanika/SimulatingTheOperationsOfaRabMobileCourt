
package rabproject;

import java.io.Serializable;
import java.time.LocalDate;


public class HirelawyerDetails implements Serializable{
    
    int caseId;
    LocalDate date;
    String caseTitle,details,time,lawyername;

    public HirelawyerDetails(int caseId, LocalDate date, String caseTitle, String details, String time, String lawyername) {
        this.caseId = caseId;
        this.date = date;
        this.caseTitle = caseTitle;
        this.details = details;
        this.time = time;
        this.lawyername = lawyername;
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

    public String getLawyername() {
        return lawyername;
    }

    @Override
    public String toString() {
        return "HirelawyerDetails{" + "caseId=" + caseId + ", date=" + date + ", caseTitle=" + caseTitle + ", details=" + details + ", time=" + time + ", lawyername=" + lawyername + '}';
    }


    
}
