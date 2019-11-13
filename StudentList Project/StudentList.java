/**
 * makes studentlist methods
 * @author (Arin Gadre)
 * @version (1112)
 */
import java.util.ArrayList;
import static java.lang.System.out;
public class StudentList
{
    private ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String fullName, double gpa, int stuNum){
        students.add(new Student(fullName, gpa, stuNum));
    }

    public void deleteStudentFromList(int num){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == num){
                nums.add(i);
            }
        }
        if(nums.size() > 1)
            out.println("There are " + nums.size() + " students with that ID number");
        else if(nums.size() == 1)
            students.remove(students.get(nums.get(0)));
        else
            out.println("There are no students with a ID number of " + num);
    }

    public void deleteStudentFromList(String str){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFullName().indexOf(str.trim()) != -1){
                nums.add(i);
            }
        }
        if(nums.size() > 1)
            out.println("There are " + nums.size() + " students with that last name");
        else if(nums.size() == 1)
            students.remove(students.get(nums.get(0)));
        else
            out.println("There are no students with a last name of " + str);
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
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == stuNum){
                stud.add(students.get(i));
            }
        }
        if(stud.size() > 2){
            System.out.println("There are " + stud.size() + " students with that ID number");
        }
        else if(stud.size() == 1){
            printList(stud);
        }
        else{
            System.out.println("There are no students with that ID number");
        }
    }

    public void printStudent(String str){
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFullName().indexOf(str.trim()) != -1){
                stud.add(students.get(i));
            }
        }
        if(stud.size() > 1)
            out.println("There are " + stud.size() + " students with that last name");
        else if(stud.size() == 1)
            printList(stud);
        else
            out.println("There are no students with a last name of " + str);
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
                if(students.get(j).getLName().compareTo(students.get(i).getLName()) > 0)
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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFullName().indexOf(lName.trim()) != -1){
                nums.add(i);
            }
        }
        if(nums.size() > 1)
            out.println("There are " + nums.size() + " students with that last name");
        else if(nums.size() == 1){
            Student s = new Student(fullName, gpa, students.get(nums.get(0)).getStuNumber());
            students.remove(students.get(nums.get(0)));
            students.add(nums.get(0), s);
        }
    }

    public void editStudentList(int num, double gpa, String fullName){
        //:: Allows the user to specify a Student number and then update or change the Student name and GPA      
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == num){
                nums.add(i);
            }
        }
        if(nums.size() > 1)
            out.println("There are " + nums.size() + " students with that last name");
        else if(nums.size() == 1){
            Student s = new Student(fullName, gpa, students.get(nums.get(0)).getStuNumber());
            students.remove(students.get(nums.get(0)));
            students.add(nums.get(0), s);
        }
    }
}