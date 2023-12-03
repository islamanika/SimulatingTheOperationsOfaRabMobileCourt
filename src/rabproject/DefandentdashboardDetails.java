
package rabproject;

import java.io.Serializable;
import java.time.LocalDate;


public class DefandentdashboardDetails implements Serializable{
    int NID,phone;
    LocalDate date;
    String NameOfConvict,FatherName,MotherName,Address;

    public DefandentdashboardDetails(int NID, int phone, LocalDate date, String NameOfConvict, String FatherName, String MotherName, String Address) {
        this.NID = NID;
        this.phone = phone;
        this.date = date;
        this.NameOfConvict = NameOfConvict;
        this.FatherName = FatherName;
        this.MotherName = MotherName;
        this.Address = Address;
    }

    public int getNID() {
        return NID;
    }

    public int getPhone() {
        return phone;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNameOfConvict() {
        return NameOfConvict;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "DefandentdashboardDetails{" + "NID=" + NID + ", phone=" + phone + ", date=" + date + ", NameOfConvict=" + NameOfConvict + ", FatherName=" + FatherName + ", MotherName=" + MotherName + ", Address=" + Address + '}';
    }
}
