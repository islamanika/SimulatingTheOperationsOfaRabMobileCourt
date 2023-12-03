
package rabproject;

import java.io.Serializable;
import java.time.LocalDate;


public class BailDetaails implements Serializable{
    
    int caseId,nid;
    LocalDate date;
    String name,caseTitle,details,evidences,witness, time;

    public BailDetaails(int caseId, int nid, LocalDate date, String time, String name, String caseTitle, String details, String evidences, String witness) {
        this.caseId = caseId;
        this.nid = nid;
        this.date = date;
        this.time = time;
        this.name = name;
        this.caseTitle = caseTitle;
        this.details = details;
        this.evidences = evidences;
        this.witness = witness;
    }

    @Override
    public String toString() {
        return "BailDetaails{" + "caseId=" + caseId + ", nid=" + nid + ", date=" + date + ", name=" + name + ", caseTitle=" + caseTitle + ", details=" + details + ", evidences=" + evidences + ", witness=" + witness + ", time=" + time + '}';
    }

    public int getCaseId() {
        return caseId;
    }

    public int getNid() {
        return nid;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
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
