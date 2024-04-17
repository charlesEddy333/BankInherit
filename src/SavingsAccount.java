class SavingsAccount extends BankAccount {
    private double interestRate;
    private double maxWithdrawal;

    // No constructor defined, using default constructor

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance && amount <= maxWithdrawal) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Withdrawal amount exceeds balance or maximum withdrawal limit");
            return false;
        }
    }
}