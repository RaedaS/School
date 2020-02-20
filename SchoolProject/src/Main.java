import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //array objects
        ArrayList<School> list = new ArrayList<>();
        ArrayList<School> list2 = new ArrayList<>();

        //newschool object
        School sc = new School("Windermere Secondary School");
        School sc2 = new School("Windermere Secondary School");
        //3 new teachers
        Teacher teacher1 = new Teacher("Steven", "Richards", "English12");
        Teacher teacher2 = new Teacher("Rob", "Parker", "Math8");
        Teacher teacher3 = new Teacher("Emma", "Johnson", "Chemistry11");

        //10 new students
        Student student1 = new Student("Emily", "Jiang","A",2342119);
        Student student2 = new Student("Hannah", "Cyrus","C",2454110);
        Student student3 = new Student("Billy", "Robs","B",6574883);
        Student student4 = new Student("Janice", "Yu","A",7893546);
        Student student5 = new Student("Tyanna", "Ngyugen","B",4536627);
        Student student6 = new Student("Raeda", "Sarwar","A",8573664);
        Student student7 = new Student("Jason", "Johnson","F",6574889);
        Student student8 = new Student("Samuel", "Roberts","C",9587739);
        Student student9 = new Student("Nathan", "Bob","B",8573994);
        Student student10 = new Student("Holly", "Heathers","A",8573994);

        //add students
        sc.addStudent(student1);
        sc.addStudent(student2);
        sc.addStudent(student3);
        sc.addStudent(student4);
        sc.addStudent(student5);
        sc.addStudent(student6);
        sc.addStudent(student7);
        sc.addStudent(student8);
        sc.addStudent(student9);
        sc.addStudent(student10);

        //add teachers
        sc2.addTeacher(teacher1);
        sc2.addTeacher(teacher2);
        sc2.addTeacher(teacher3);

        //add students and teachers to list
        list.add(sc);
        list2.add(sc2);


        //display school info
        sc.displaySchoolInfo();
        sc2.displaySchoolInfo();

        //remove 2 students
        sc.removeStudent(1);
        sc.removeStudent(4);

        //remove one teacher
        sc2.removeTeacher(2);

        //display both lists after alteration
        sc.displaySchoolInfo();
        sc2.displaySchoolInfo();

    }
}
