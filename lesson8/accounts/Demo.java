package lesson8.accounts;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBank", "Denis", 1000, 50);
        savingAccount.changeOwnerName("Jack");
        System.out.println(savingAccount.moneyAmount);
        savingAccount.depositMoney(100);
        System.out.println(savingAccount.moneyAmount);

        CheckingAccount checkingAccount = new CheckingAccount("SomeBank", "Denis", 1000, 500);

        checkingAccount.changeOwnerName("Oleh");

        System.out.println(checkingAccount.ownerName);
    }
}
