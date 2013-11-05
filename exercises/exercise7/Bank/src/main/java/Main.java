public class Main {
    public static void main(String[] args) {
        Account acct = Bank.account("Java", "001", 100);
        Bank.deposit(acct, 500);
        Bank.withdraw(acct, 200);
        System.out.println(Bank.toString(acct));
    }
}