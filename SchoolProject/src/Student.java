public class Student {


    private String firstName; //first name
    private String lastName; //last name
    private int grade; //student grade
    static int studentCount = 1; //how many students; static for id
    private int studentNumber; //student id

    Student(){      //first constructor, no parameters
        firstName = "";
        lastName = "";
        grade = 0;
        studentNumber = studentCount;
        studentCount++; //add 1 to the student count
    }
    Student(String firstName, String lastName, int grade){  //second constructor, parameters: first name of student, last name, and grade
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentNumber = studentCount;
        studentCount++; //add 1 to student count
    }

    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    //getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    } //only get the student number, you can't set it



    public String toString(){   //when printing the student out "Name: fullname Grade: grade"
        return "Name: "+firstName+" "+lastName+"\tGrade: "+grade+"\t\t";
    }

    public boolean equals(Student student){     //if the full names of the students are the same
        if((firstName+lastName).equals(student.firstName+student.lastName)){
            return true;
        }
        else {
            return false;
        }

    }






}
