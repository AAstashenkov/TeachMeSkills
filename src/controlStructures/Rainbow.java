package controlStructures;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        System.out.print("Input number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("Your color is: " + getColor(num));
    }
    public static String getColor(int num){
        switch (num){
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Light-Blue";
            case 6:
                return "Blue";
            case 7:
                return "Purple";
            default:
                return "Unknown number";
        }
    }
}
