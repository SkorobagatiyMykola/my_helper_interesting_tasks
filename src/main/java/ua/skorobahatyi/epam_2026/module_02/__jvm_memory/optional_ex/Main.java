package ua.skorobahatyi.epam_2026.module_02.__jvm_memory.optional_ex;

public class Main {
    public static void main(String[] args) {

        BookCollection bc = new BookCollection();
        bc.printAllBooks();
        System.out.println("============================");

        System.out.println(bc.findBookByName("Book 1").getPrice().convert("EUR"));

        bc.printAllBooks();

        //Runtime.gc();
        System.gc();
        Runtime.getRuntime().gc();

    }
}
