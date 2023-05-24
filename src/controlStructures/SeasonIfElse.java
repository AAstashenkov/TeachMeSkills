package controlStructures;

import java.util.Scanner;

public class SeasonIfElse {
    public static void main(String[] args) {
        System.out.print("Input month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Your season is: " + getSeason(month));
    }

    public static String getSeason(int month) {
        if (month == 12 || month == 1 || month == 2){
            return "Winter";
        } else if (month == 3 || month == 4 || month == 5){
            return "Spring";
        } else if (month == 6 || month == 7 || month == 8){
            return "Summer";
        } else if (month == 9 || month == 10 || month == 11){
            return "Autumn";
        } else
            return "Error";
    }
}
