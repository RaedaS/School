import java.util.ArrayList;

public class School {

    //set variables and arrays

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String schoolName;


    //constructors
    public void addStudent(Student obj){
        this.students.add(obj);
    }

    public void addTeacher(Teacher obj){
        this.teachers.add(obj);
    }

    public void removeTeacher(int index){
        this.teachers.remove(index);
    }

    public void removeStudent(int index){
        this.students.remove(index);
    }

    School(String schoolName){

        this.schoolName = schoolName;
    }

    //getters and setters
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    //print info about students and teachers
    public void displaySchoolInfo(){
        for(int i = 0; i<teachers.size(); i++){
            System.out.println("Teacher Name: " + this.teachers.get(i).getFirstName() + " "+ this.teachers.get(i).getLastName());
            System.out.println("Subject: " + this.teachers.get(i).getSubject());
        }

        for(int i = 0; i<students.size(); i++){
            System.out.println("Student name: " + this.students.get(i).getFirstName() + " " + this.students.get(i).getLastName());
            System.out.println("Grade: " + this.students.get(i).getGrade());
        }
    }







}
