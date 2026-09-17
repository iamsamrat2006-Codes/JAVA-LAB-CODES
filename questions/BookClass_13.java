//SAMRAT_MUKHERJEE
//WAP IN JAVA to Create a Book class with title, author, and price. Use a parameterized constructor and displayBook(). Create three objects.


class Book {
    String title;
    String author;
    double price;

    // Parameterized constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }
}

public class BookClass_13 {
    public static void main(String[] args) {

        // Create three Book objects
        Book b1 = new Book("Java Basics", "James", 450);
        Book b2 = new Book("Python Guide", "John", 500);
        Book b3 = new Book("C Programming", "Dennis", 400);

        // Display details of all three books
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}