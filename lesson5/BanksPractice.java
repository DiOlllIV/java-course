package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina"};
        int[] balances = {100, 500, 8432, 99, 12000, -54};

        System.out.println(Arrays.toString(findClientsByBalance(names, balances, 500)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));

        depositMoney(names, balances, "Denis", 400);
        System.out.println(Arrays.toString(balances));
    }

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        int count = 0;

        for (int balance: balances) {
            if(balance < 0) {
                count++;
            }
        }

       String[] result = new String[count];

        int index = 0;
        int indexResult = 0;
        for (int balance: balances) {
            if(balance < 0) {
                result[indexResult] = clients[index];
                indexResult++;
            }
            index++;
        }

        return result;
    }

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        int count = 0;

        for (int balance: balances) {
            if(balance >= n) {
                count++;
            }
        }

        String[] result = new String[count];

        int index = 0;
        int indexResult = 0;
        for (int balance: balances) {
            if(balance >= n) {
                result[indexResult] = clients[index];
                indexResult++;
            }
            index++;
        }

        return result;
    }

    public static void depositMoney(String[] clients, int[] balances, String client, int money) {
        balances[findClientIndexByName(clients, client)] += calculateDepositAmountAfterCommission(money);
    }

    public static int findClientIndexByName (String[] clients, String client) {
        int clientIndex = 0;
        for (String cl: clients ) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    public static int calculateDepositAmountAfterCommission(int money) {
        return money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
    }
}
