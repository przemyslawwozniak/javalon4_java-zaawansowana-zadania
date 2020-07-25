package pl.sda.javalon4.pdf.ex1;

public class Account {

    private String id, name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if(amount <= this.balance)
            this.balance -= amount;
        else
            System.out.println("Amount exceeded balance.");
        return this.balance;
    }

    public int transferTo(Account destination, int amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            destination.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance.");
        }
        return  this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
