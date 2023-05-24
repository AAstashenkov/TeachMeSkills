package loops;

public class OddNum {
    public static void main(String[] args) {
        System.out.print("Your odd numbers: ");
        getOdd();
    }
    public static void getOdd(){
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
