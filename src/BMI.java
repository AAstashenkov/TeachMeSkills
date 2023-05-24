import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        calculateBMI();
    }
    public static void calculateBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Input your height: ");
        int height = scanner.nextInt();

        System.out.println("Your BMI: " + weight/(Math.pow(height * 0.01, 2)));
    }
}
