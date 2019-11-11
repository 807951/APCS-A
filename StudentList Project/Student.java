/**
 * has student getters ans setter and parseUserInput
 * @author (Arin Gadre)
 * @version (1108)
 */
public class Student
{
    private String fName;
    private String mName;
    private String lName;
    private int stuNumber;
    private double gpa;
    public Student(String fullName, double gpa, int stuNumber){
        this.gpa = gpa;
        this.stuNumber = stuNumber;
        parseUserInput(fullName);
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

    // parseUserInput
    public void parseUserInput(String userName){
        int firstSpace = userName.indexOf(' ');
        int lastSpace = userName.lastIndexOf(' ');
        int commaIndex = userName.indexOf(',');
        System.out.println(firstSpace + lastSpace + commaIndex);
        System.out.println(lastSpace);
        System.out.println( commaIndex);
        
        if(firstSpace == lastSpace){ // name with 2 words and possibly a comma
            if(commaIndex != -1){ // name with 2 words and a comma
                lName = userName.substring(0, commaIndex);
                fName = userName.substring(firstSpace + 1, userName.length() - 1);
                mName = "";
            }else{ // name with 2 words
                fName = userName.substring(0, firstSpace);
                lName = userName.substring(lastSpace+1, userName.length()-1);
                mName = "";
            }
        }
        else if(firstSpace != lastSpace){ // name with 3 words and possible a comma
            if(commaIndex != -1){ // name with 3 words and comma
                lName = userName.substring(0, commaIndex);
                fName = userName.substring(firstSpace + 1, lastSpace);
                mName = userName.substring(lastSpace + 1, userName.length() - 1);
            }else{ // name with 3 words
                fName = userName.substring(0, firstSpace);
                mName = userName.substring(firstSpace + 1, lastSpace);
                lName = userName.substring(lastSpace + 1, userName.length() - 1);
            }
        }
    }
}
