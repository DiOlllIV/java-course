package lesson5.hw;

import java.util.Arrays;

public class Withdraw {
    public static void main(String[] args) {
        String[] clients = {"Ann", "Jacob", "Tom"};
        int[] balance = {100, -2, 25};
        System.out.println(withdraw(clients, balance, "Tom", 20));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        //write your code here
        int clientIndex = findClientIndex(clients, client);
        int balanceAfterWithdraw = balances[clientIndex] - money;

        if (balanceAfterWithdraw < 0)
            return -1;
        else {
            balances[clientIndex] = balanceAfterWithdraw;
            return balanceAfterWithdraw;
        }
    }

    public static int findClientIndex (String[] clients, String client) {
        int clientIndex = 0;
        for (int i = 0; i < clients.length; i++) {
            if (client == clients[i]) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

}
