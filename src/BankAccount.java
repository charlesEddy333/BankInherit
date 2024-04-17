class BankAccount {
    String accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

        public static void main(String[] args) {
            // Test SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.deposit(1000);
            savingsAccount.displayBalance(); // Balance: $1000
            savingsAccount.withdraw(500);
            savingsAccount.displayBalance(); // Balance: $500
            savingsAccount.withdraw(700); // Withdrawal amount exceeds balance or maximum withdrawal limit
            savingsAccount.displayBalance(); // Balance: $500 (no change)

            // Test CurrentAccount
            CurrentAccount currentAccount = new CurrentAccount();
            currentAccount.deposit(2000);
            currentAccount.displayBalance(); // Balance: $2000
            currentAccount.withdraw(1500);
            currentAccount.displayBalance(); // Balance: $500
            currentAccount.withdraw(1000); // Insufficient funds
            currentAccount.displayBalance(); // Balance: $500 (no change)
        }
    }
