package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.optional_ex;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(1, "Book 1", "Author 1", 9.99));
        books.add(new Book(2, "Book 2", "Author 2", 13.99));
        books.add(new Book(3, "Book 3", "Author 3", 23.99));
        books.add(new Book(4, "Book 4", "Author 4", 33.99));
        books.add(new Book(5, "Book 5", "Author 5", 43.99));
    }


    public Book findBookByName(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " : " + book.getPrice());
        }
    }
}
