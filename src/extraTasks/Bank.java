package extraTasks;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.print("Input the amount of money: ");
        Scanner scanner = new Scanner(System.in);
        float inputMoney = scanner.nextFloat();
        System.out.print("Input number of months: ");
        int months = scanner.nextInt();
        System.out.println("Your money: "+ getMoney(inputMoney, months) + "€");
    }
    public static float getMoney(float inputMoney, int months) {
        float incomeMoney;
        float moneyWithPercents = 0;

        for (int i = 0; i < months; i++) {
            incomeMoney = (float) (inputMoney * 0.07);
            moneyWithPercents = inputMoney + incomeMoney;
            inputMoney = moneyWithPercents;
        }
        return moneyWithPercents;
    }
}
