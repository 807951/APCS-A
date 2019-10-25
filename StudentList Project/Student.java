/**
 * Write a description of class Student here.
 * @author (Arin Gadre)
 * @version (1024)
 */
public class Student
{
    private String fName;
    private String mName;
    private String lName;
    private String fullName;
    private int stuNumber;
    private double gpa; 
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
                gpa = Double.toString(d + 0.01);
                gpa = gpa.substring(0, diff);
            } else {
                gpa = gpa.substring(0, diff);
                result = Double.parseDouble(gpa);
            }
        }
        return result;
    }

    public int refineStuNumber(int d){
        String stuNum = Integer.toString(d);
        int result = 0;
        if(d < 0)
            throw new ArithmeticException("Please enter a positive value.");         
        else if(stuNum.length() > 6){
            throw new ArithmeticException("Please enter number that has less than 7 digits.");
        }
        return result;
    }
    
    //getters
    public String getFullName(){
        return lName +", " + fName + " " + mName;
    }
    public String getLName(){
        return lName;
    }
    public String getMName(){
        return mName;
    }
    public String getFName(){
        return fName;
    }
    public double getGPA(){
        return gpa;
    }

    public int getStuNumber(){
        return stuNumber;
    }
    
    //setters
    public void setStuNumber(int stuNumber){
        this.stuNumber = refineStuNumber(stuNumber);
    }
  
    public void setFName(String fName){
        this.fName = fName.trim();
    }

    public void setLName(String lName){
        this.lName = lName.trim();
    }

    public void setMName(String mName){
        this.mName = mName.trim();
    }
    public void setGPA(double d){
        gpa = refineGPA(d);
    }
   
}
