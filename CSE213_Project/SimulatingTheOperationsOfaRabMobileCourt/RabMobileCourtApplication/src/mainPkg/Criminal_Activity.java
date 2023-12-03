package mainPkg;

public class Criminal_Activity {

    public String crimeType;
    public int occuranceAmount, occuranceYear;

    public Criminal_Activity(String crimeType, int occuranceAmount, int occuranceYear) {
        this.crimeType = crimeType;
        this.occuranceAmount = occuranceAmount;
        this.occuranceYear = occuranceYear;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public int getOccuranceAmount() {
        return occuranceAmount;
    }

    public void setOccuranceAmount(int occuranceAmount) {
        this.occuranceAmount = occuranceAmount;
    }

    public int getOccuranceYear() {
        return occuranceYear;
    }

    public void setOccuranceYear(int occuranceYear) {
        this.occuranceYear = occuranceYear;
    }

    @Override
    public String toString() {
        return "Criminal_Activity{" + "crimeType=" + crimeType + ", occuranceAmount=" + occuranceAmount + ", occuranceYear=" + occuranceYear + '}';
    }

}
