package loops;

public class Subsequence {
    public static void main(String[] args) {
        System.out.print("Your subsequence: ");
        getSubsequence();
    }

    public static void getSubsequence() {
        int subsequence = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(subsequence + " ");
            subsequence -= 5;
        }
    }
}
