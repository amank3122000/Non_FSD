package Upskilling_Day4;

public class BankAccount {

    private long accNo;
    private String name;
    private double balance;

    public BankAccount(long accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount() {

    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(long dep) {
        this.balance += dep;
        System.out.println(balance);
    }

    public void withdrawl(long wd) {
        if(wd>balance) {
            System.out.println("Insufficient Amount");
        }
        else {
            this.balance -= wd;
            System.out.println(balance);
        }
    }
}
