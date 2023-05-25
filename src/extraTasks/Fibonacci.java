package extraTasks;

public class Fibonacci {
    public static void main(String[] args) {

        getFibonacci();
    }
    public static void getFibonacci(){
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 11; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
