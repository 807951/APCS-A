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
    private int stuNumber;
    private double gpa; 
    public Student(){
        
    }
    public Student(String fullName, double gpa, int stuNumber){
        this.gpa = gpa;
        this.stuNumber = stuNumber;
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
        this.stuNumber = stuNumber;
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

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

}
