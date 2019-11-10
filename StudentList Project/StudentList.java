/**
 * makes studentlist methods
 * @author (Arin Gadre)
 * @version (1109)
 */
import java.util.ArrayList;
public class StudentList
{
    private ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String fullName, double gpa, int stuNum){
        students.add(new Student(fullName, gpa, stuNum));
    }

    public void printList(ArrayList<Student> students){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name:  " +
                students.get(i).getFullName());
            System.out.println("Student gpa:  " + students.get(i).getGPA());
            System.out.println("Student number:  " +
                students.get(i).getStuNumber());
        }
    }

    public void printList(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " +
                students.get(i).getFullName());
            System.out.println("Student gpa: " + students.get(i).getGPA());
            System.out.println("Student number: " +
                students.get(i).getStuNumber());
        }
    }

    public void printStudent(int stuNum){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == stuNum){
                temp.add(i);
            }
        }
        sizeCheck:
        if(temp.size() > 2){
            System.out.println("There are " + temp.size() + " students with that ID number");
            break sizeCheck;
        }
        else if(temp.size() == 1){
            printList(stud);
        }
        else{
            System.out.println("There are no students with that ID number");
        }
    }

    public void printStudent(String lName){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getLName().equals(lName.trim())){
                temp.add(i);
            }
        }
        sizeCheck:
        if(temp.size() > 1){
            System.out.println("There are " + temp.size() + " students with that last name");
            break sizeCheck;
        }
        else if(temp.size() == 1){
            printList(stud);
        }
        else{
            System.out.println("There are no students with that last name");
        }
    }

    public void filterSearchStudentListMoreThan(int num){
        ArrayList<Student> studs = new ArrayList<Student>();
        boolean check = false;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() >= num){
                studs.add(students.get(i));
                check = true;
            }
        }
        if(check == true){
            printList(studs);
        }
        else{
            System.out.println("Students do not exist!");
        }
    }

    public void filterSearchStudentListLessThan(int num){
        ArrayList<Student> studs = new ArrayList<Student>();
        boolean check = false;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() <= num){
                studs.add(students.get(i));
                check = true;
            }
        }
        if(check == true){
            printList(studs);
        }
        else{
            System.out.println("Students do not exist!");
        }
    }

    public void filterSearchStudentListLessThan(double gpa){
        ArrayList<Student> studs = new ArrayList<Student>();
        boolean check = false;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() >= gpa){
                studs.add(students.get(i));
                check = true;
            }
        }
        if(check == true){
            printList(studs);
        }
        else{
            System.out.println("Students do not exist!");
        }
    }

    public void filterSearchStudentListMoreThan(double gpa){
        ArrayList<Student> studs = new ArrayList<Student>();
        boolean check = false;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() <= gpa){
                studs.add(students.get(i));
                check = true;
            }
        }
        if(check == true){
            printList(studs);
        }
        else{
            System.out.println("Students do not exist!");
        }
    }

    public void clearList(){
        students.clear();
    }

    public void sortByLastName()
    {
        int n = students.size();
        for (int j=0; j<n-1; j++)
        {
            for (int i=j+1; i<n; i++)
            {
                Student temp;
                if
                (students.get(j).getLName().compareTo(students.get(i).getLName()) > 0)
                {
                    temp = students.get(j);
                    students.set(j, students.get(i));
                    students.set(i, temp);
                }
            }
        }
    }

    public void sortByStuNumber(){
        for (int i = 0; i < students.size(); i++) {
            // find position of smallest num between (i + 1)th elemen and last element
            int pos = i;
            for (int j = i; j < students.size(); j++) {
                if (students.get(j).getStuNumber() <
                students.get(pos).getStuNumber())
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            Student min = students.get(pos);
            students.set(pos, students.get(i));
            students.set(i, min);
        }
    }

    public void editStudentList(String lName, double gpa, String fullName){
        // Allows the user to specify a student name and then update or change the Student name and GPA
        boolean check = false;
        int temp = 0;
        String[] str = fullName.split(" ");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getLName().equals(lName.trim())){
                check = true;
                temp = i;
            }
        }
        Student s = students.get(temp);
        testName:
        if(str.length > 3 || str.length < 2){
            System.out.println("Enter name in one of the 4 correct formats please.");
            break testName;
        }
        else{
            if(check == true){
                students.remove(temp);
                students.add(temp, new Student(fullName, gpa, s.getStuNumber()));
            }else{
                System.out.println("Student does not exist. Try searching with the student's ID number or try again.");
            }
        }
    }

    public void editStudentList(int stuNumber, double gpa, String fullName){
        //:: Allows the user to specify a Student number and thenupdate or change the Student name and GPA
        boolean check = false;
        int temp = 0;
        String[] str = fullName.split(" ");
        for(int i = 0; ((i < students.size()) && (check == false)); i++){
            if(students.get(i).getStuNumber() == stuNumber){
                check = true;
                temp = i;
            }
        }
        Student s = students.get(temp);
        testName:
        if(str.length > 3 || str.length < 2){
            System.out.println("Enter name in one of the 4 correct formats please.");
            break testName;
        }
        else{
            if(check == true){
                students.remove(temp);
                students.add(temp, new Student(fullName, gpa, stuNumber));
            }else{
                System.out.println("Student does not exist. Try searching with the student's last name or try again.");
            }
        }
    }
}