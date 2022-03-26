package tddTests;

public class Account {

    private int balance;
    private int withdraw;

    public void deposit(int amount) {
        if (amount > 0) {
            balance = amount + balance;
        }
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw (int amount){
        if (amount > 0)
        balance = balance - amount;
    }
}