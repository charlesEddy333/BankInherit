class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // No constructor defined, using default constructor

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Withdrawal amount exceeds balance and overdraft limit");
            return false;
        }
    }
}