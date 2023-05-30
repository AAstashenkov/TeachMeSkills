import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 2, 4, 2, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                array[i] = 0;
            }
        }

        if (found) {
            System.out.println("Number was removed.");
        } else {
            System.out.println("Not found number.");
        }

        System.out.println("Result array: " + Arrays.toString(array));
    }

}
