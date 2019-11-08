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
        parseUserInput(fullName.trim());
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
        String[] arr = userName.split(" ");
        int commaIndex = arr[0].indexOf(',');
        if(arr.length > 4 || arr.length < 2){
            System.out.println("Name was entered in the wrong format.");
        }else if(arr.length == 3){
            if(commaIndex == -1){  //
                // comma index = -1 means there is no comma in the name
                setFName(arr[0]);
                setMName(arr[1]);
                setLName(arr[2]);
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                setFName(arr[2]);
                setMName(arr[1]);
                setLName(arr[0]);
            }
        }else{
            if(commaIndex == -1){
                // comma index = -1 means there is no comma in the name
                setFName(arr[0]);
                setLName(arr[1]);
                setMName("");
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                setFName(arr[1]);
                setLName(arr[0]);
                setMName("");
            }
        }
    }
}
