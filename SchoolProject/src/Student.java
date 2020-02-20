public class Student {
private String firstName;
private String lastName;
private String grade;
private static int id;

//constructors
    Student(String firstName, String lastName, String grade, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = id;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    //print object method
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" +
        "Grade: " + this.getGrade();
    }
}
