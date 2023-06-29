package vector;

public class Vector3 {
    private final String info = "This is a vector for a three-dimensional coordinate system.";
    private double x;
    private double y;
    private double z;

    @Override
    public String toString() {
        return info + "\n" + "x = " + x + "\n" +"y = " + y + "\n" + "z = " + z;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getVectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double getScalarProduct(Vector3 vector3){
        return x * vector3.getX() + y * vector3.getY() + z * vector3.getZ();
    }
    public Vector3 getVectorSum(Vector3 vector3) {
        return new Vector3(x + vector3.getX(), y + vector3.getY(), z + vector3.getZ());
    }
    public Vector3 getVectorDefense(Vector3 vector3) {
        return new Vector3(x - vector3.getX(), y - vector3.getY(), z - vector3.getZ());
    }

    public static Vector3[] arrayOfRandomVectors(int number) {
        Vector3[] vectorRand3 = new Vector3[number];
        for (int i = 0; i < number; i++) {
            double x = Math.random();
            double y = Math.random();
            double z = Math.random();
            vectorRand3[i] = new Vector3(x, y, z);
        }
        return vectorRand3;
    }

    public boolean getVectorsCompare(Vector3 vector3){
        return (this.x == vector3.getX() && this.y == vector3.getY() && this.z == vector3.getZ());
    }
}
