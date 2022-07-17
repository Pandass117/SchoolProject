import java.util.ArrayList;

public class School {


    private ArrayList<Teacher> teachers = new ArrayList<>();    //Arraylist of the teachers in a school object
    private ArrayList<Student> students = new ArrayList<>();    //Arraylist of the student in a school object
    private ArrayList<String> courses = new ArrayList<>();    //Arraylist of the courses in a school object

    static int schoolCount = 1; //school count for school id
    private int schoolId;   //school id
    private String schoolEnemy; //school's enemy
    private String schoolName; //school's name


    //setters

    public void setSchoolEnemy(String schoolEnemy) {
        this.schoolEnemy = schoolEnemy;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //getters

    public int getSchoolId() {
        return schoolId;
    } //only get the school number, you can't set it

    public String getSchoolEnemy() {
        return schoolEnemy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    School(){  //first constructor, no parameters

        schoolId = schoolCount;
        schoolEnemy = "";
        schoolName = "";

        schoolCount++;
    }
    School(String schoolName, String schoolEnemy){  //second constructor, parameters: school name, school enemy

        schoolId = schoolCount;
        this.schoolName = schoolName;
        this.schoolEnemy = schoolEnemy;


        schoolCount++;
    }
    School(String schoolName, String schoolEnemy, ArrayList<String> courses){  //third constructor, parameters: school name, school enemy, school courses

        schoolId = schoolCount;
        this.schoolName = schoolName;
        this.schoolEnemy = schoolEnemy;
        this.courses = courses;


        schoolCount++;
    }




    public void addTeacher(Teacher e){
        teachers.add(e);
    } //add a teacher to the array

    public void addStudent(Student e){
        students.add(e);
    } //add a student to the array

    public void deleteTeacher(Teacher e){
        teachers.remove(e);
    } //remove a teacher to the array

    public void deleteStudent(Student e){
        students.remove(e);
    } //remove a student to the array

    public void showTeacher(){  //shows the teacher array
        System.out.println("Teachers: "+teachers);
    }

    public void showStudent(){  //shows the student array
        System.out.println("Students: "+students);

    }

    public String toString(){
        /*
        When printed:
        Name: Name
        Enemy: Enemy	Id: school number
        Courses: array of courses in school object
        Students: array of students in school object
        Teachers: array of teachers in school object
         */
        return "Name: "+schoolName+"\nEnemy: "+schoolEnemy+"\tId: "+schoolId+"\nCourses: "+courses+"\nStudents: "+students+"\nTeachers: "+teachers+"\n";
    }

    public boolean equals(School school){ //if the school names are equal
        if(schoolName.equals(school.schoolName)){
            return true;
        }
        else {
            return false;
        }

    }






}
