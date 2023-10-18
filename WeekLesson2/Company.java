package WeekLesson2;
import java.util.Scanner;
public class Company {
    // interface

    //attribute
    public String CompanyName;
    public String TaxCode;
    public String Revenue;

    //Contructor
    public Company (String CompanyName, String TaxCode, String Revenue){
this.CompanyName= CompanyName;
this.TaxCode= TaxCode;
this.Revenue= Revenue;
    }
    public abstract void printInformation();

    public abstract void setName(String CompanyName);
}

