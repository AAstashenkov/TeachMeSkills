package extraTasks;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.print("Input tha amount of money: ");
        Scanner scanner = new Scanner(System.in);
        float inputMoney = scanner.nextFloat();
        System.out.print("Input months: ");
        int months = scanner.nextInt();
        System.out.println(getMoney(inputMoney, months));
    }
    public static float getMoney(float inputMoney, int months) {
        float money = 0;
        float outputMoney = 0;

        for (int i = 0; i < months; i++) {
            money = (float) (inputMoney * 0.07);
            outputMoney = inputMoney + money;
            inputMoney = outputMoney;
        }
        return outputMoney;
    }
}
