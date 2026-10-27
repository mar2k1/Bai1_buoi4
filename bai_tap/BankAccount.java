package bai_tap;

public class BankAccount {
    // khai báo 3 thuộc tính:
    public String accountNumber;
    private String ownerName;
    private double balance;

    // xây dựng constructor:
    public BankAccount(String accountNumber, String ownerName, int initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        // Nếu initialBalance < 0 hì balance = 0
        if (initialBalance < 0) {
            this.balance = 0;
            System.out.println("Lỗi: Số dư ban đầu phải >= 0");
        } else {
            this.balance = initialBalance;
        }
    }

    // pt gửi tiền double amount:
    public void deposit(double amount) {
        // tiền nạp amount > 0:
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nạp" + amount + "thành công. Số dư hiện tại" + this.balance + "VND");
        } else {
            System.out.println("Số tiền nạp phải > 0");
        }
    }

    // pt rút:
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút phải >0");
        } else if (amount <= this.balance) {
            System.out.println("Lỗi: Số dư không đủ");
        } else {
            this.balance -= amount;
            System.out.println("Rút" + amount + "thành công. Số dư còn lại:" + this.balance + "VND");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
