/**
 * creates parseArray method
 * @author (Arin Gadre)
 * @version (929)
 */
public class Person
{
    private String fName= "";
    private String lName = "";
    private String mName = "";
    private String userName = "";
    private int commaIndex;
    private int checkIndex;
    public Person(String fullName){
        userName = fullName;
    }

    public void parseArray(){
        String[] arr = userName.split(" "); 
        commaIndex = arr[0].indexOf(',');
        label:
        if(arr.length < 2 || arr.length > 3){
            System.out.println("Looks like you entered the name in the wrong format!");
            break label;
        }
        else{
            if(arr.length == 3){
                if(commaIndex != -1){
                    arr[0] = arr[0].substring(0, commaIndex);
                    fName = arr[2];
                    mName = arr[1];
                    lName = arr[0];
                }
                else if(commaIndex == -1){
                    fName = arr[0];
                    mName = arr[1];
                    lName = arr[2];
                }
            }
            else if(arr.length == 2){
                if(commaIndex != -1){
                    arr[0] = arr[0].substring(0, commaIndex);
                    fName = arr[1];
                    lName = arr[0];
                }
                else if(commaIndex == -1){
                    fName = arr[0];
                    lName = arr[1];                
                }
            }
        }

    }

    public String getFirstName(){
        return fName;
    }

    public String getMiddleName(){
        return mName;
    }

    public String getLastName(){
        return lName;
    }
}