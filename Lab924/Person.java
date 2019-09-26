/**
 * contains parseString method
 *
 * @author (Arin Gadre)
 * @version (926)
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
    private int commaIndex = 0;
    private Person[] p = new Person[2];
    public Person(String fullName)
    {
        userName = fullName;
        
    }

    public void parseArray(){
        fullNameArray = userName.split(" ");
        commaIndex = (fullNameArray[0]).indexOf(","); 
        label:
        if(fullNameArray.length < 2 || fullNameArray.length>3){
            System.out.println("wrong format");
            break label;
        }
        else{
            if(fullNameArray.length == 3){
                if(commaIndex > 0){
                    fullNameArray[0] = fullNameArray[0].substring(0,commaIndex);
                    fName = fullNameArray[1];
                    mName = fullNameArray[2];
                    lName = fullNameArray[0];
                    for(int i = 0; i < fullNameArray.length; i++){
                        System.out.print(fullNameArray[i]);
                    }
                }
                else if(commaIndex == -1){
                    fName = fullNameArray[0];
                    mName = fullNameArray[1];
                    lName = fullNameArray[2];
                    for(int i = 0; i < fullNameArray.length; i++){
                        System.out.println(fullNameArray[i]);
                    }
                }
            }
            else if(fullNameArray.length == 2){
                if(commaIndex > 0){
                    fullNameArray[0] = (fullNameArray[0]).substring(0,commaIndex);
                    fName = fullNameArray[1];
                    lName = fullNameArray[0];
                    for(int i = 0; i < fullNameArray.length; i++){
                        System.out.println(fullNameArray[i]);
                    }
                }
                else if(commaIndex == -1){
                    fName = fullNameArray[0];
                    lName = fullNameArray[1];
                    for(int i = 0; i < fullNameArray.length; i++){
                        System.out.println(fullNameArray[i]);
                    }
                }
            }
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
