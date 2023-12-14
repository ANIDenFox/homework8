public class Student {
    private String firstName;
    private String lastName;
    private double averageGrade;

    public Student(String firstName, String lastName, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}