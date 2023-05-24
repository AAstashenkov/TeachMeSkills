package loops;

public class Square {
    public static void main(String[] args) {
        System.out.print("Your square subsequence: ");
        getSquare();
    }
    public static void getSquare() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }
    }
}
