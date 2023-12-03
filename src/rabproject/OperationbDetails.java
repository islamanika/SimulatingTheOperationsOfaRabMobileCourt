package rabproject;

import java.io.Serializable;
import java.time.LocalDate;

public class OperationbDetails implements Serializable {

    int caseId;
    LocalDate date;

    String caseTitle, districtofficer, assignedofficer, magistrate, lawyer, place, time;

    public OperationbDetails(int caseId, LocalDate date, String caseTitle, String districtofficer, String assignedofficer, String magistrate, String lawyer, String place, String time) {
        if (caseId < 0) {
            throw new IllegalArgumentException("wrong ID");
        }
        this.caseId = caseId;
        this.date = date;
        this.caseTitle = caseTitle;
        this.districtofficer = districtofficer;
        this.assignedofficer = assignedofficer;
        this.magistrate = magistrate;
        this.lawyer = lawyer;
        this.place = place;
        this.time = time;
    }

    @Override
    public String toString() {
        return "OperationbDetails{" + "caseId=" + caseId + ", date=" + date + ", caseTitle=" + caseTitle + ", districtofficer=" + districtofficer + ", assignedofficer=" + assignedofficer + ", magistrate=" + magistrate + ", lawyer=" + lawyer + ", place=" + place + ", time=" + time + '}';
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

    public String getDistrictofficer() {
        return districtofficer;
    }

    public String getAssignedofficer() {
        return assignedofficer;
    }

    public String getMagistrate() {
        return magistrate;
    }

    public String getLawyer() {
        return lawyer;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
    
    

}
