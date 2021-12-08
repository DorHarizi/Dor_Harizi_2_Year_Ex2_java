package Test;

import Graph.*;
import api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myGraphTest {
    double z = 0;

    double x0 = 35.19589389346247; double y0 = 32.10152879327731;
    GeoLocation p0 = new myPoint3D(x0, y0, z);

    double x1 = 35.20319591121872; double y1 = 32.10318254621849;
    GeoLocation p1 = new myPoint3D(x1, y1, z);

    double x2 = 35.20752617756255; double y2 = 32.1025646605042;
    GeoLocation p2 = new myPoint3D(x2, y2, z);

    NodeData node0 = new myNode();
    NodeData node1 = new myNode(1, p1,15.2156516,"dor",8);
    NodeData node2 = new myNode(2, p0, 14.464413, "dor1", 9);
    NodeData node3 = new myNode(3, p2);
    DirectedWeightedGraph graph = new myGraph();


    @Test
    void getNode() {
    }

    @Test
    void getEdge() {
    }

    @Test
    void addNode() {
    }

    @Test
    void connect() {
    }

    @Test
    void nodeIter() {
    }

    @Test
    void edgeIter() {
    }

    @Test
    void testEdgeIter() {
    }

    @Test
    void removeNode() {
    }

    @Test
    void removeEdge() {
    }

    @Test
    void nodeSize() {
    }

    @Test
    void edgeSize() {
    }

    @Test
    void getMC() {
    }
}