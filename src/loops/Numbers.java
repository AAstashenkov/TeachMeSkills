package loops;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        sumNumbers(number);
    }
    public static void sumNumbers(int number) {
        for (int i = 0; i < number; i++){
            System.out.println(i);
        }
    }
}
