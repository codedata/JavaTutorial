package tw.codedata.bank;

public class Account {
    private String name;
    private String number;
    private Integer balance;

    public Account(String name, String number, Integer balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(Integer amount) {
        if(amount <= 0) {
             throw new IllegalArgumentException("amount must be positive");
        }
        this.balance += amount;
    }

    public void withdraw(Integer amount) {
        if(amount > this.balance) {
            throw new RuntimeException("balance not enough");
        }
        this.balance -= amount;
    }

    public String toString() {
        return String.format("Account(%s, %s, %d)", 
                          this.name, this.number, this.balance);
    }
}