package Test;

import org.junit.jupiter.api.Test;
import Graph.myNode;
import Graph.myPoint3D;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class myNodeTest {
    myPoint3D p = new myPoint3D(4,6,9);
    myNode n = new myNode(1, p);
    myNode e = new myNode(2, p);

    @Test
    void testToString() {
        n.setWeight(5.5);
        n.setInfo("dor");
        n.setTag(5);
        e.setWeight(5.0);
        e.setTag(45);
        e.setInfo("dor1");
        String st = "myNode{key=2, point=myPoint3D{x=4.0, y=6.0, z=9.0}, weight=5.0, info='dor1', tag=45, vector=[2.0, 4.0, 6.0], graph_side_in=null, graph_side_out=null}";
        String st2 ="myNode{key=1, point=myPoint3D{x=4.0, y=6.0, z=9.0}, weight=5.5, info='dor', tag=5, vector=[1.0, 4.0, 6.0], graph_side_in=null, graph_side_out=null}";
    }

    @Test
    void getKey() {
        assertEquals(n.getKey(), 1);
        assertEquals(e.getKey(), 2);
    }

    @Test
    void getLocation() {
        myPoint3D p1 = new myPoint3D(4, 6, 9);
        assertEquals(n.getLocation().x(), p1.x());
        assertEquals(n.getLocation().y(), p1.y());
        assertEquals(n.getLocation().z(), p1.z());
        assertEquals(e.getLocation().x(), p1.x());
        assertEquals(e.getLocation().y(), p1.y());
        assertEquals(e.getLocation().z(), p1.z());
    }

    @Test
    void setLocation() {
    }

    @Test
    void getWeight() {
        n.setWeight(5.5);
        e.setWeight(5);
        assertEquals(n.getWeight(),5.5);
        assertEquals(e.getWeight(), 5);
    }

    @Test
    void setWeight() {
        n.setWeight(3);
        e.setWeight(23);
        assertEquals(n.getWeight(),3);
        assertEquals(e.getWeight(),23);
    }

    @Test
    void getInfo() {
        n.setInfo("dor");
        e.setInfo("dor1");
        assertEquals(n.getInfo(),"dor");
        assertEquals(e.getInfo(), "dor1");
    }

    @Test
    void setInfo() {
        n.setInfo("uyt");
        e.setInfo("poi");
        assertEquals(n.getInfo(), "uyt");
        assertEquals(e.getInfo(), "poi");
    }

    @Test
    void getTag() {
        n.setTag(5);
        e.setTag(45);
        assertEquals(n.getTag(), 5);
        assertEquals(e.getTag(), 45);
    }

    @Test
    void setTag() {
        n.setTag(1);
        e.setTag(2);
        assertEquals(n.getTag(),1);
        assertEquals(e.getTag(),2);

    }
}