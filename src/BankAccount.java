public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Недостатньо коштів на рахунку");
            return;
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}