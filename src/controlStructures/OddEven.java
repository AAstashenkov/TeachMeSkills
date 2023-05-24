package controlStructures;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Your number is: " + getOddEven(num));
    }
    public static String getOddEven(int num){
        if (num%2 == 0){
            return "Even";
        }else
            return "Odd";
    }
}
