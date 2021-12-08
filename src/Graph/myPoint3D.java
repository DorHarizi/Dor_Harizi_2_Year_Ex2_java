package Graph;

import api.GeoLocation;

public class myPoint3D implements GeoLocation {
    private double x;
    private double y;
    private double z;
    
    public myPoint3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public myPoint3D() {
    }

    public myPoint3D(GeoLocation g){
        this.x = g.x();
        this.y = g.y();
        this.z = g.z();
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public double distance(GeoLocation g) {
        double X = Math.pow(Math.abs(this.x-g.x()),2);
        double Y = Math.pow(Math.abs(this.y-g.y()),2);
        double Z = Math.pow(Math.abs(this.z-g.z()),2);
        return Math.sqrt(X + Y + Z);
    }

    @Override
    public String toString() {
        return "myPoint3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


}

