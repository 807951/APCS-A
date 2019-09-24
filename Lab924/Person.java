/**
 * contains parseString method
 *
 * @author (Arin Gadre)
 * @version (923)
 * 
 * I chose format three: "First Middle Last"
 */
public class Person
{
    private String fName = "";
    private String mName = "";
    private String lName = "";
    private String userName = "";
    private String[] fullNameArray;
    public Person(String fullName)
    {
        userName = fullName;           
    }

    public void parseArray(){
        fullNameArray = userName.split(" "); 
        label:
        if(fullNameArray.length > 3 || fullNameArray.length < 3){
            System.out.println("Looks like you didn't enter in the correct format!");
            break label;
        }
        else{
            fName = fullNameArray[0];
            mName = fullNameArray[1];
            lName = fullNameArray[2]; 
        }
    }

    public String getLastName(){
        return lName;
    }

    public String getFirstName(){
        return fName;
    }

    public String getMiddleName(){
        return mName;
    }
}
