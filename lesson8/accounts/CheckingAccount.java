package lesson8.accounts;

public class CheckingAccount extends Account {
    int limitOfExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpenses = limitOfExpenses;
    }

    public void withdraw(int amount) {
        if (amount > limitOfExpenses)
            return;
        moneyAmount -= amount;
    }

}
