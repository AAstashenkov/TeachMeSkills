package controlStructures;

import java.util.Scanner;

public class SeasonSwitchCase {
    public static void main(String[] args) {
        System.out.print("Input month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Your season is: " + getSeason(month));
    }

    public static String getSeason(int month) {
        switch (month) {
            case 12, 1, 2:
                return "This is winter";
            case 3, 4, 5:
                return "This is spring";
            case 6, 7, 8:
                return "This is summer";
            case 9, 10, 11:
                return "This is autumn";
            default:
                return "Unknown month";
        }
    }
}
