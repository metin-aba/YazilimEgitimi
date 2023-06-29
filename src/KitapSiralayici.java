import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

class BookSorter {
    public static void sortByTitle(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public static void sortByAuthor(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getAuthor));
    }

    public static void sortByPublicationYear(List<Book> books) {
        Collections.sort(books, Comparator.comparingInt(Book::getPublicationYear));
    }
}

public class KitapSiralayici {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        System.out.println("Original list:");
        printBooks(books);

        BookSorter.sortByTitle(books);
        System.out.println("\nSorted by title:");
        printBooks(books);

        BookSorter.sortByAuthor(books);
        System.out.println("\nSorted by author:");
        printBooks(books);

        BookSorter.sortByPublicationYear(books);
        System.out.println("\nSorted by publication year:");
        printBooks(books);
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("---------------------------");
        }
    }
}
