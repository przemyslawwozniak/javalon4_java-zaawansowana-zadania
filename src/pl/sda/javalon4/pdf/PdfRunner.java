package pl.sda.javalon4.pdf;

import pl.sda.javalon4.pdf.ex1.Account;
import pl.sda.javalon4.pdf.ex2.Author;
import pl.sda.javalon4.pdf.ex2.Book;

public class PdfRunner {

    //ex1
    /*public static void main(String[] args) {
        Account account1 = new Account("kjlnfdskjng14324", "Jan Kowalski", 2700);
        Account account2 = new Account("kjgdsdgadsd2dsskjng14354151224", "Janusz Kowalski", 500);

        System.out.println(account1);   //toString
        account1.credit(300);
        System.out.println(account1);
        account1.transferTo(account2, 500);
        System.out.println(account1);
        System.out.println(account2);
    }*/

    //ex2
    public static void main(String[] args) {
        Author author = new Author("jkrowling@potter.com", "J. K. Rowling", 'f');
        Author author2 = new Author("jrr@tolkien.co", "J. R. R. Tolkien", 'M');
        //Author author3 = new Author("hsien@gmail.com", "Henryk Sienkiewicz", 'd');

        Book b1 = new Book(author2, "LoTR", 50, 7);
        System.out.println(b1);
    }

}
