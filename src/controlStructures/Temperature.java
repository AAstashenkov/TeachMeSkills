package controlStructures;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Input temperature: ");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println("The weather is: " + getTemperature(temperature));
    }
    public static String getTemperature(int temperature) {
        if (temperature > -5){
            return "Warm";
        }else if (temperature > -20 && temperature <= -5){
            return "Normal";
        }else {
            return "Cold";
        }        
    }
}
