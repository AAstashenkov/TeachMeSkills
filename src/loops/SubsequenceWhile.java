package loops;

public class SubsequenceWhile {
    public static void main(String[] args) {
        System.out.println("Your subsequence: ");
        getSubsequence();
    }
    public static void getSubsequence() {
        int num = 0;
        while (num < 98){
            System.out.print(num += 7);
        }
    }
}
