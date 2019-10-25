/**
 * Write a description of class Student here.
Methods:
Create getters for
fullName::format = "Last, First Middle".
gpa(Two decimal places)
stuNumber (six digits)

Create setters for:
firstName, middleName, lastName, stuNumber, gpa
 * @author (Arin Gadre)
 * @version (1024)
 */
import java.math.BigDecimal;
import java.lang.Number;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Student
{
    private String fName;
    private String mName;
    private String lName;
    private int stuNumber;
    private double gpa = 1.232323;
    public String getFullName(){
        return lName +", " + fName + " " + mName;
    }

    public double getGPA(){
        return gpa;
    }

    public double refineGPA(double d){
        String gpa = Double.toString(d);
        int decimalIndex = gpa.indexOf(".");
        int diff = gpa.length()-2-decimalIndex;
        double result = 0.0;
        if(d < 0)
            throw new ArithmeticException("Please enter a positive value");         
        else if(decimalIndex == -1)
            throw new ArithmeticException("Please enter a decimal value");
        else if(gpa.length() > 4){
            if(gpa.substring(diff, diff+1).equals("5")
            || gpa.substring(diff, diff+1).equals("6")
            || gpa.substring(diff, diff+1).equals("7")
            || gpa.substring(diff, diff+1).equals("8")
            || gpa.substring(diff, diff+1).equals("9")){
                gpa = Double.toString(d+0.01);
                gpa = gpa.substring(0, diff);
            } else {
                gpa = gpa.substring(0, diff);
                result = Double.parseDouble(gpa);
            }
        }
        return result;

    }

    public void setGPA(double d){
        gpa = refineGPA(d);
    }

}