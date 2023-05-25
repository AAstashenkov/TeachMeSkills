package extraTasks;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Your multiplication table: ");
        getMultiplicationTable(number);

    }
    public static void getMultiplicationTable(int number) {
        int multiplication;
        for (int i = 0; i <= 10; i++) {
            multiplication = number * i;
            System.out.println(number + " * " + i + " = " + multiplication);
        }
    }
}
