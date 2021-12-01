package Test;

import static org.junit.jupiter.api.Assertions.*;
import Graph.myPoint3D;
import Graph.myNode;

class myPoint3DTest {
    public static void main(String[] args) {
        double x = 4;
        double y = 6;
        double z = 9;
        myPoint3D p = new myPoint3D(x,y,z);
        assertEquals(4,p.x());
        assertEquals(6,p.y());
        assertEquals(9,p.z());
        String  b = "myPoint3D{x=4.0, y=6.0, z=9.0}";
        assertEquals(p.toString(),b);
        myPoint3D p1 = new myPoint3D();
        String c = "myPoint3D{x=0.0, y=0.0, z=0.0}";
        assertEquals(c,p1.toString());
//        myNode w = new myNode(1, p, 5.5,"dor",5);
//        System.out.println(w);
    }
}