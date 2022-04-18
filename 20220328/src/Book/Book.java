package Book;

public class Book {
    private String name, type, author;
    private double price;
    private boolean isBorrowed;
    public Book(String name, String type, String author, double price) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }
    
}
