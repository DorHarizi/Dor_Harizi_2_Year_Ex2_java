package Test;

import Graph.*;
import api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myGraphTest {

    DirectedWeightedGraph dor = new myGraph();

    double z = 0;

    double x0 = 35.19589389346247; double y0 = 32.10152879327731;
    GeoLocation p0 = new myPoint3D(x0, y0, z);
    NodeData node0 = new myNode(0, p0);


    double x1 = 35.20319591121872; double y1 = 32.10318254621849;
    GeoLocation p1 = new myPoint3D(x1, y1, z);
    NodeData node1 = new myNode(1, p1);

    double x2 = 35.20752617756255; double y2 = 32.1025646605042;
    GeoLocation p2 = new myPoint3D(x2, y2, z);
    NodeData node2 = new myNode(2, p2);

    double x3 = 35.21007339305892; double y3 = 32.10107446554622;
    GeoLocation p3 = new myPoint3D(x3, y3, z);
    NodeData node3 = new myNode(3, p3);

    double x4 = 35.21310882485876, y4 = 32.104636394957986;
    GeoLocation p4 = new myPoint3D(x4, y4, z);
    NodeData node4 = new myNode(4, p4);

    double x5 = 35.212111165456015; double y5 = 32.106235628571426;
    GeoLocation p5 = new myPoint3D(x5, y5, z);
    NodeData node5 = new myNode(5, p5);

    double x6 = 35.20797194027441; double y6 = 32.104854472268904;
    GeoLocation p6 = new myPoint3D(x6, y6, z);
    NodeData node6 = new myNode(6, p6);

    double x7 = 35.205764353510894; double y7 = 32.106326494117646;
    GeoLocation p7 = new myPoint3D(x7, y7, z);
    NodeData node7 = new myNode(7, p7);

    double x8 = 35.20154022114608; double y8 = 32.10594485882353;
    GeoLocation p8 = new myPoint3D(x8, y8, z);
    NodeData node8 = new myNode(8, p8);

    double x9 = 35.19805902663438; double y9 = 32.10525428067227;
    GeoLocation p9 = new myPoint3D(x9, y9, z);
    NodeData node9 = new myNode(9, p9);

    double x10 = 35.197400995964486; double y10 = 32.10510889579832;
    GeoLocation p10 = new myPoint3D(x10, y10, z);
    NodeData node10 = new myNode(10, p10);

    double x11 = 35.19351649233253; double y11 = 32.1061811092437;
    GeoLocation p11 = new myPoint3D(x11, y11, z);
    NodeData node11 = new myNode(11, p11);

    double x12 = 35.18950462792575; double y12 = 32.10788938151261;
    GeoLocation p12 = new myPoint3D(x12, y12, z);
    NodeData node12 = new myNode(12, p12);

    double x13 = 35.189568308313156; double y13 = 32.106617263865544;
    GeoLocation p13 = new myPoint3D(x13, y13, z);
    NodeData node13 = new myNode(13, p13);

    double x14 = 35.18869800968523; double y14 = 32.104927164705884;
    GeoLocation p14 = new myPoint3D(x14, y14, z);
    NodeData node14 = new myNode(14, p14);

    double x15 = 35.187594216303474; double y15 = 32.10378225882353;
    GeoLocation p15 = new myPoint3D(x15, y15, z);
    NodeData node15 = new myNode(15, p15);

    double x16 = 35.19381366747377; double y16 = 32.102419275630254;
    GeoLocation p16 = new myPoint3D(x16, y16, z);
    NodeData node16 = new myNode(16, p16);

    double x17 = 35.18992916384181; double y17 = 32.1043092789916;
    GeoLocation p17 = new myPoint3D(x17, y17, z);
    NodeData node17 = new myNode(17, p17);

    double x18 = 35.19181834866828; double y18 = 32.10412754789916;
    GeoLocation p18 = new myPoint3D(x18, y18, z);
    NodeData node18 = new myNode(18, p18);

    double x19 = 35.192497606133976; double y19 = 32.10434562521009;
    GeoLocation p19 = new myPoint3D(x19, y19, z);
    NodeData node19 = new myNode(19, p19);

    double x20 = 35.19188202905569; double y20 = 32.10579947394958;
    GeoLocation p20 = new myPoint3D(x20, y20, z);
    NodeData node20 = new myNode(20, p20);

    double x21 = 35.19691277966102; double y21 = 32.10240110252101;
    GeoLocation p21 = new myPoint3D(x21, y21, z);
    NodeData node21 = new myNode(21, p21);

    double x22 = 35.197952892655366; double y22 = 32.10271004537815;
    GeoLocation p22 = new myPoint3D(x22, y22, z);
    NodeData node22 = new myNode(22, p22);

    double x23 = 35.19071455528652; double y23 = 32.106235628571426;
    GeoLocation p23 = new myPoint3D(x23, y23, z);
    NodeData node23 = new myNode(23, p23);

    double x24 = 35.198929325262306; double y24 = 32.10376408571429;
    GeoLocation p24 = new myPoint3D(x24, y24, z);
    NodeData node24 = new myNode(24, p24);

    double x25 = 35.200160479418884; double y25 = 32.1041457210084;
    GeoLocation p25 = new myPoint3D(x25, y25, z);
    NodeData node25 = new myNode(25, p25);

    double x26 = 35.201731262308314; double y26 = 32.104636394957986;
    GeoLocation p26 = new myPoint3D(x26, y26, z);
    NodeData node26 = new myNode(26, p26);

    double x27 = 35.20260156093624; double y27 = 32.10476360672269;
    GeoLocation p27 = new myPoint3D(x27, y27, z);
    NodeData node27 = new myNode(27, p27);

    double x28 = 35.20504264245359; double y28 = 32.104854472268904;
    GeoLocation p28 = new myPoint3D(x28, y28, z);
    NodeData node28 = new myNode(28, p28);

    double x29 = 35.21143190799032; double y29 = 32.104854472268904;
    GeoLocation p29 = new myPoint3D(x29, y29, z);
    NodeData node29 = new myNode(29, p29);

    double x30 = 35.210264434221145; double y30 = 32.103909470588235;
    GeoLocation p30 = new myPoint3D(x30, y30, z);
    NodeData node30 = new myNode(30, p30);

    @Test
    void getNode() {
    }

    @Test
    void getEdge() {
    }

    @Test
    void addNode() {
        dor.addNode(node0);
        dor.addNode(node1);
        dor.addNode(node2);
        dor.addNode(node3);
        dor.addNode(node4);
        dor.addNode(node5);
        dor.addNode(node6);
        dor.addNode(node7);
        dor.addNode(node8);
        dor.addNode(node9);
        dor.addNode(node10);
        dor.addNode(node11);
        dor.addNode(node12);
        dor.addNode(node13);
        dor.addNode(node14);
        dor.addNode(node15);
        dor.addNode(node16);
        dor.addNode(node17);
        dor.addNode(node18);
        dor.addNode(node19);
        dor.addNode(node20);
        dor.addNode(node21);
        dor.addNode(node22);
        dor.addNode(node23);
        dor.addNode(node24);
        dor.addNode(node25);
        dor.addNode(node26);
        dor.addNode(node27);
        dor.addNode(node28);
        dor.addNode(node29);
        dor.addNode(node30);
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