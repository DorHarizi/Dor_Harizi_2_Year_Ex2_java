package Test;

import org.junit.jupiter.api.Test;
import Graph.myEdgeData;
import static org.junit.jupiter.api.Assertions.*;

class myEdgeDataTest {
    myEdgeData e = new myEdgeData();
    myEdgeData p = new myEdgeData(3, 4, 5.5, "dor", 4);
    @Test
    void getSrc() {
        assertEquals(p.getSrc(),3);
        assertEquals(e.getSrc(), 0);
    }

    @Test
    void getDest() {
        assertEquals(e.getDest(), 0);
        assertEquals(p.getDest(), 4);
    }

    @Test
    void getWeight() {
        assertEquals(e.getWeight(),0);
        assertEquals(p.getWeight(),5.5);
    }

    @Test
    void getInfo() {
        assertEquals(p.getInfo(),"dor");
    }

    @Test
    void setInfo() {
        e.setInfo("nitzan");
        assertEquals(e.getInfo(),"nitzan");
    }

    @Test
    void getTag() {
        assertEquals(e.getTag(),0);
        assertEquals(p.getTag(),4);
    }

    @Test
    void setTag() {
        e.setTag(4);
        assertEquals(e.getTag(),4);
    }
}