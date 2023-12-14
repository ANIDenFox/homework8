public class Book {

    private String name;
    private String author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void print() {
        System.out.println("Назва: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Рік видання: " + yearOfPublication);
    }
}