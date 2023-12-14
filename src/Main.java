
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java: Повний посібник", "Герберт Шилдт", 2018);
        book.print();

        Calculator calculator = new Calculator();
        int sum = calculator.add(20, 10);
        int subtract = calculator.subtract(20, 10);
        int multiply = calculator.multiply(20, 10);
        int divide = calculator.divide(20, 10);
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + subtract);
        System.out.println("Добуток: " + multiply);
        System.out.println("Частка: " + divide);

        BankAccount account = new BankAccount(1000);
        account.deposit(100);
        System.out.println("Баланс після внесення: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Баланс після зняття: " + account.getBalance());
        account.withdraw(590);
        System.out.println("Баланс після другого зняття: " + account.getBalance());

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.print();

        Student student1 = new Student("Іван", "П.", 85.5);
        Student student2 = new Student("Марія", "І.", 78.9);
        Student student3 = new Student("Антон", "Ф.", 99.5);
        StudentList studentList = new StudentList(5);
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.displayAllStudents();
        studentList.removeStudent(student1);
        studentList.displayAllStudents();
    }
}