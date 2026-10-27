package src;

import bai_tap.BankAccount;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("37858", "huyen", 3795);
        account.deposit(7890);
        account.withdraw(-869);
    }
}
