package vector;

public class Main {
    public static void main(String[] args) {
        Vector2 vector21 = new Vector2(5.4, 2.3);
        Vector2 vector22 = new Vector2(4.2, 4.1);

        Vector3 vector31 = new Vector3(8.8, 2.2, 1.1);
        Vector3 vector32 = new Vector3(6.4, 1.5, 4.7);

        System.out.println("First: " + vector21);
        System.out.println("Vector length: " + vector21.getVectorLength());

        System.out.println("Second: " + vector22);
        System.out.println("Vector length: " + vector22.getVectorLength());

        System.out.println("Compare: " + vector21.getVectorsCompare(vector22));
        System.out.println("Scalar product: " + vector21.getScalarProduct(vector22));
        System.out.println("Sum: " + vector21.getVectorSum(vector22));

        System.out.println("Array of random vectors: ");
        Vector2[] vectorRand2 = Vector2.arrayOfRandomVectors(2);
        System.out.println(vectorRand2[0]);
        System.out.println(vectorRand2[1]);
        System.out.println();

        System.out.println("First: " + vector31);
        System.out.println("Vector length: " + vector31.getVectorLength());

        System.out.println("Second: " + vector32);
        System.out.println("Vector length: " + vector32.getVectorLength());

        System.out.println("Compare: " + vector31.getVectorsCompare(vector32));
        System.out.println("Scalar product: " + vector31.getScalarProduct(vector32));
        System.out.println("Sum: " + vector31.getVectorSum(vector32));

        System.out.println("Array of random vectors: ");
        Vector3[] vectorRand3 = Vector3.arrayOfRandomVectors(2);
        System.out.println(vectorRand3[0]);
        System.out.println(vectorRand3[1]);


    }
}