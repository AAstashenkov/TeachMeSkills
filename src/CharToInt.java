import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        transformCharToInt();
    }

    public static void transformCharToInt(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your character: ");
        char myChar = scanner.next().charAt(0);
        System.out.println("Result: " + myChar + "-" + (int)myChar);

    }

}