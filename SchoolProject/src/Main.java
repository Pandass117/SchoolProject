import java.util.ArrayList;

public class Main {
    private static ArrayList<String> stringArrayList(String[] array){   //function to add items of an array to a String list
        ArrayList<String> arrayChange = new ArrayList<String>();
        for(int i = 0; i< array.length; i++){
            arrayChange.add(array[i]);
        }

        return arrayChange;

    }
    private static void teacherAddList(School school, Teacher[] array){   //function to add items of an array to a Teacher list

        for(int i = 0; i< array.length; i++){
            school.addTeacher(array[i]);
        }



    }
    private static void studentAddList(School school, Student[] array){   //function to add items of an array to a Student list

        for(int i = 0; i< array.length; i++){
            school.addStudent(array[i]);
        }



    }

    private static ArrayList<String> stringRemoveList(String[] array){   //function to remove items of an array from a String list
        ArrayList<String> arrayChange = new ArrayList<String>();
        for(int i = 0; i< array.length; i++){
            arrayChange.remove(array[i]);
        }

        return arrayChange;

    }
    private static void teacherRemoveList(School school, Teacher[] array){   //function to remove items of an array from a Teacher list

        for(int i = 0; i< array.length; i++){
            school.deleteTeacher(array[i]);
        }



    }
    private static void studentRemoveList(School school, Student[] array){   //function to remove items of an array from a Student list

        for(int i = 0; i< array.length; i++){
            school.deleteStudent(array[i]);
        }



    }
    public static void main(String[] args) {



        //Creating 10 students
        Student haderGrader = new Student("hader", "grader", 12);
        Student toddThrower = new Student("todd", "thrower", 12);
        Student grodenGreher = new Student("groden", "greher", 12);
        Student jimmyCartesian = new Student("jimmy", "cartesian", 2);
        Student airQueston = new Student("air", "queston", 5);
        Student lynnGuinni = new Student("lynn", "guinni", 3);
        Student peteZa = new Student("peter", "za", 3);
        Student cassRol = new Student("cass", "rol", 9);
        Student cachTori = new Student("cach", "tori", 8);
        Student sueVlaki = new Student("sue", "vlaki", 11);

        //Creating 3 teachers
        Teacher siennaCentanial = new Teacher("sienna", "centanial", "Principal");
        Teacher chelsOop = new Teacher("chels", "oop", "Counselor");
        Teacher knowsJoses = new Teacher("knows", "Joses", "Farming");



        //arrays to use in add functions
        String[] toAddC = {     //courses
                "Bond (band but you form bonds)","Sceance (be a wizard)", "woodworked (turn into tree)", "adst (adaptive density some times) (lose weight instantly)"
        };
        Student[] toAddS = {     //students
                haderGrader, grodenGreher, jimmyCartesian, toddThrower, airQueston, lynnGuinni, peteZa, cassRol, cachTori, sueVlaki
        };
        Teacher[] toAddT = {     //teachers
                siennaCentanial, chelsOop, knowsJoses
        };

        //Making an ArrayList of the courses
        ArrayList<String> interhighCourses = stringArrayList(toAddC);

        //Making objects of the School class
        School interstateInterhigh = new School("interstate interhigh", "outerstate outerlow", interhighCourses);
        School interstateInterhigh2 = new School("interstate interhigh", "outerstate outerlow");
        School schoolOfFish = new School("Sea You", "Birds and Mammals");
        School birdsAndMammals = new School();

        //Adding the students from the array with the addlist function
        studentAddList(interstateInterhigh, toAddS);
        teacherAddList(interstateInterhigh, toAddT);


        //showing all the students and teachers in interstate interhigh
        interstateInterhigh.showStudent();
        interstateInterhigh.showTeacher();
        System.out.println();

        //deleting Students and Teachers from interstate interhigh (delete function is available as well)
        interstateInterhigh.deleteStudent(airQueston);
        interstateInterhigh.deleteStudent(cachTori);

        interstateInterhigh.deleteTeacher(chelsOop);

        //showing all the students and teachers in interstate interhigh
        interstateInterhigh.showStudent();
        interstateInterhigh.showTeacher();
        System.out.println();

        //printing interstate interhigh
        System.out.println(interstateInterhigh);
        //printing birds and mammals (no parameters)
        System.out.println(birdsAndMammals);
        //equals
        System.out.println("interstate interhigh and interstate interhigh 2 have the same name and enemy: "+interstateInterhigh.equals(interstateInterhigh2));
        System.out.println("interstate interhigh and Sea You have the same name and enemy: "+interstateInterhigh.equals(schoolOfFish));

    }


}
