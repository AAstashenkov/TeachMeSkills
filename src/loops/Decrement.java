package loops;

public class Decrement {
    public static void main(String[] args) {
        System.out.print("Your numbers are: ");
        outputNumbers();
    }
    public static void outputNumbers(){

        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        };
    }
}
