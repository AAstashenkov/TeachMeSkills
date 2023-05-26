package loops;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getSumNumbers(number));
    }
    public static int getSumNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
