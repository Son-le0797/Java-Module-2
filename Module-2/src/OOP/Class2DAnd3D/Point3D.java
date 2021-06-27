package OOP.Class2DAnd3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        super.getX();
        super.getY();
        this.z = z;
    }

    public String toString(){
        return String.format("X = %f\tY = %f\tZ = %f\n%s",getX(),getY(),getZ(), Arrays.toString(getXYZ()));
    }
}
