import java.util.Scanner;

public class ManInfo {
    public static void main(String[] args) {
        getManInfo();
    }
    public static void getManInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter man name: ");
        String name = scanner.nextLine();

        System.out.print("Enter man surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter man age: ");
        int age = scanner.nextInt();

        System.out.print("Enter man height: ");
        int height = scanner.nextInt();

        System.out.print("Enter man weight: ");
        double weight = scanner.nextDouble();

        System.out.println();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

}
