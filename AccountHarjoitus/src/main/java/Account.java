public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double withdraw(double amount) {
        if (amount > 0) {
            if (this.balance - amount < 0) {
                double allMoney = this.balance;
                this.balance = 0;
                return allMoney;
            } else {
                this.balance -= amount;
                return amount;
            }
        }
        return 0;
    }

    public double getBalance() {
        return this.balance;
    }
}
