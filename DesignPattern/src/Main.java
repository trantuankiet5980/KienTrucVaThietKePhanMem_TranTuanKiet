import nonPattern.Book;
import nonPattern.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("1984", "George Orwell", 1949));

        library.listBooks();

        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}