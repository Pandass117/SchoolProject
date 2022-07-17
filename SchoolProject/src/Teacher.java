public class Teacher {


    private String firstName; //first name
    private String lastName; //last name
    private String subject; //teaching subject


    Teacher(){  //first constructor, no parameters
        firstName = "";
        lastName = "";
        subject = "";

    }
    Teacher(String firstName, String lastName, String subject){  //second constructor, parameters: first name of teacher, last name, and subject
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    //getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }



    public String toString(){
        return "Name: "+firstName+" "+lastName+"\tSubject: "+subject+"\t\t";
    } //when printed out: "Name: full name Subject: subject"

    public boolean equals(Teacher teacher){ //if the full names of the teachers are the same
        if((firstName+lastName).equals(teacher.firstName+teacher.lastName)){
            return true;
        }
        else {
            return false;
        }

    }
}
