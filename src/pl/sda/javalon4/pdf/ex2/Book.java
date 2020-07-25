package pl.sda.javalon4.pdf.ex2;

public class Book {
    private Author author;
    private String name;
    private int price;
    private int qty;

    public Book(Author author, String name, int price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public Book(Author author, String name, int price, int qty) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("Book=%s, %s, price=%d, qty=%d",
                name, author, price, qty);
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
