package tw.codedata;

import tw.codedata.bank.Account;

public class Main {
    public static void main(String[] args) {
        Account acct = new Account("Java", "001", 100);
        acct.deposit(500);
        acct.withdraw(200);
        System.out.println(acct);
    }
}