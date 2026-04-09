package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.optional_ex;

public class Book {
    private int id;
    private String title;
    private String author;
    private Price price;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(int id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = new Price(price);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    public Price getPrice() {
        return price;
    }
}
