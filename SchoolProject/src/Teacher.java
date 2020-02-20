public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    //constructors
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //setters and getters
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //print teacher object
    public String toString() {
        return "Teacher " +
                "name: " + this.firstName + " " + this.lastName + "\n" +
                "subject: " + this.subject;
    }
}
