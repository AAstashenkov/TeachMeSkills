package vector;

public class Vector2 {
    private final String info = "This is a vector for a two-dimensional coordinate system.";
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return info + "\n" + "x = " + x + "\n" +"y = " + y;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getVectorLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double getScalarProduct(Vector2 vector2){
        return x * vector2.getX() + y * vector2.getY();
    }

    public Vector2 getVectorSum(Vector2 vector2) {
        return new Vector2(x + vector2.getX(), y + vector2.getY());
    }

    public Vector2 getVectorDefense(Vector2 vector2) {
        return new Vector2(x - vector2.getX(), y - vector2.getY());
    }

    public static Vector2[] arrayOfRandomVectors(int number) {
        Vector2[] vectorRand2 = new Vector2[number];
        for (int i = 0; i < number; i++) {
            double x = Math.random();
            double y = Math.random();
            vectorRand2[i] = new Vector2(x, y);
        }
        return vectorRand2;
    }

    public boolean getVectorsCompare(Vector2 vector2) {
        return this.x == vector2.getX() && this.y == vector2.getY();
    }
}
