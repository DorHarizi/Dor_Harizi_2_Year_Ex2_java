package Test;

import Graph.myNode;
import Graph.myPoint3D;
import api.GeoLocation;
import api.NodeData;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.*;

class myNodeTest {

    double z = 0;

    double x0 = 35.19589389346247; double y0 = 32.10152879327731;
    GeoLocation p0 = new myPoint3D(x0, y0, z);

    double x1 = 35.20319591121872; double y1 = 32.10318254621849;
    GeoLocation p1 = new myPoint3D(x1, y1, z);

    double x2 = 35.20752617756255; double y2 = 32.1025646605042;
    GeoLocation p2 = new myPoint3D(x2, y2, z);

    NodeData node0 = new myNode(0, p0);
    NodeData node1 = new myNode(1, p1,15.2156516,"dor",8);
    NodeData node2 = new myNode();
    NodeData node3 = new myNode(3, p2);

    @Test
    void testToString() {
        String s0 = "myNode{" +
                "key=" + 0 +
                ", point=" + p0.toString() +
                ", weight=" + 0.0 +
                ", info='" + "" + '\'' +
                ", tag=" + 0 +
                '}';
        System.out.println(s0 + "\n");
        System.out.println(node0.toString() + "\n");
        assertTrue(s0.equals(node0.toString()));
    }

    @Test
    void getKey() {
        assertEquals(0, node0.getKey());
        assertEquals(1, node1.getKey());
        assertEquals(0, node2.getKey());
        assertEquals(3,node3.getKey());
    }

    @Test
    void getLocation() {
        assertEquals(p0, node0.getLocation());
        assertEquals(p1, node1.getLocation());
        assertEquals(p2, node3.getLocation());
        double x = node1.getLocation().x();
        double y = node1.getLocation().y();
        double z = node1.getLocation().z();
        assertEquals(p1.x(), x);
        assertEquals(p1.y(), y);
        assertEquals(p1.z(), z);
    }

    @Test
    void setLocation() {
        GeoLocation location = new myPoint3D(3.5,4.0,6.0);
        assertEquals(p0, node0.getLocation());
        node0.setLocation(location);
        double x = node0.getLocation().x();
        double y = node0.getLocation().y();
        double z = node0.getLocation().z();
        assertEquals(location.x(), x);
        assertEquals(location.y(), y);
        assertEquals(location.z(), z);
    }

    @Test
    void getWeight() {
        assertEquals(15.2156516,node1.getWeight());
        assertEquals(0,node0.getWeight());
        assertEquals(0,node2.getWeight());
        assertEquals(0,node3.getWeight());
    }

    @Test
    void setWeight() {
        node0.setWeight(5.5);
        node2.setWeight(4.6);
        node3.setWeight(7.6);
        node1.setWeight(0);
        assertEquals(5.5, node0.getWeight());
        assertEquals(0, node1.getWeight());
        assertEquals(4.6, node2.getWeight());
        assertEquals(7.6, node3.getWeight());
    }

    @Test
    void getInfo() {
        assertEquals("dor", node1.getInfo());
    }

    @Test
    void setInfo() {
        String s0 = "dor1";
        String s2 = "dor2";
        String s3 = "dor3";
        node0.setInfo(s0);
        node1.setInfo("");
        node2.setInfo(s2);
        node3.setInfo(s3);
        assertEquals(s0, node0.getInfo());
        assertEquals("",node1.getInfo());
        assertEquals(s2,node2.getInfo());
        assertEquals(s3, node3.getInfo());
    }

    @Test
    void getTag() {
        assertEquals(8, node1.getTag());
    }

    @Test
    void setTag() {
        node0.setTag(0);
        node1.setTag(1);
        node2.setTag(2);
        node3.setTag(3);
        assertEquals(0, node0.getTag());
        assertEquals(1, node1.getTag());
        assertEquals(2, node2.getTag());
        assertEquals(3, node3.getTag());
    }
}