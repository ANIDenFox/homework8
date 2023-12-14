public class StudentList {
    private Student[] students;
    private int size;

    public StudentList(int capacity) {
        this.students = new Student[capacity];
        this.size = 0;
    }

    public void addStudent(Student student) {
        students[size++] = student;
        System.out.println("Студент доданий: " + student.getFullName());
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                System.arraycopy(students, i + 1, students, i, size - i - 1);
                size--;
                System.out.println("Студент видалений: " + student.getFullName());
                return;
            }
        }
        System.out.println("Студент не знайдений: " + student.getFullName());
    }

    public void displayAllStudents() {
        System.out.println("Список студентів:");
        for (int i = 0; i < size; i++) {
            System.out.println("Ім'я: " + students[i].getFullName() + ", Середній бал: " + students[i].getAverageGrade());
        }
    }
}