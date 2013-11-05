class Bank {
    static Account account(String name, String number, Integer balance) {
        Account acct = new Account();
        acct.name = name;
        acct.number = number;
        acct.balance = balance;
        return acct;
    }

    static void deposit(Account acct, Integer amount) {
        if(amount <= 0) {
             throw new IllegalArgumentException("amount must be positive");
         }
         acct.balance += amount;
     }

    static void withdraw(Account acct, Integer amount) {
        if(amount > acct.balance) {
            throw new RuntimeException("balance not enough");
        }
        acct.balance -= amount;
    }

    static String toString(Account acct) {
        return String.format("Account(%s, %s, %d)", 
                          acct.name, acct.number, acct.balance);
    }
}