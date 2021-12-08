package Test;

import Graph.myPoint3D;
import api.GeoLocation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myPoint3DTest {

    double z = 0;

    double x0 = 35.19589389346247; double y0 = 32.10152879327731;
    GeoLocation p0 = new myPoint3D(x0, y0, z);

    double x1 = 35.20319591121872; double y1 = 32.10318254621849;
    GeoLocation p1 = new myPoint3D(x1, y1, z);

    double x2 = 35.20752617756255; double y2 = 32.1025646605042;
    GeoLocation p2 = new myPoint3D(x2, y2, z);

    double x3 = 35.21007339305892; double y3 = 32.10107446554622;
    GeoLocation p3 = new myPoint3D(x3, y3, z);

    double x4 = 35.21310882485876, y4 = 32.104636394957986;
    GeoLocation p4 = new myPoint3D(x4, y4, z);

    double x5 = 35.212111165456015; double y5 = 32.106235628571426;
    GeoLocation p5 = new myPoint3D(x5, y5, z);

    double x6 = 35.20797194027441; double y6 = 32.104854472268904;
    GeoLocation p6 = new myPoint3D(x6, y6, z);

    double x7 = 35.205764353510894; double y7 = 32.106326494117646;
    GeoLocation p7 = new myPoint3D(x7, y7, z);

    double x8 = 35.20154022114608; double y8 = 32.10594485882353;
    GeoLocation p8 = new myPoint3D(x8, y8, z);

    double x9 = 35.19805902663438; double y9 = 32.10525428067227;
    GeoLocation p9 = new myPoint3D(x9, y9, z);

    double x10 = 35.197400995964486; double y10 = 32.10510889579832;
    GeoLocation p10 = new myPoint3D(x10, y10, z);

    double x11 = 35.19351649233253; double y11 = 32.1061811092437;
    GeoLocation p11 = new myPoint3D(x11, y11, z);

    double x12 = 35.18950462792575; double y12 = 32.10788938151261;
    GeoLocation p12 = new myPoint3D(x12, y12, z);


    double x13 = 35.189568308313156; double y13 = 32.106617263865544;
    GeoLocation p13 = new myPoint3D(x13, y13, z);

    double x14 = 35.18869800968523; double y14 = 32.104927164705884;
    GeoLocation p14 = new myPoint3D(x14, y14, z);

    double x15 = 35.187594216303474; double y15 = 32.10378225882353;
    GeoLocation p15 = new myPoint3D(x15, y15, z);

    double x16 = 35.19381366747377; double y16 = 32.102419275630254;
    GeoLocation p16 = new myPoint3D(x16, y16, z);

    double x17 = 35.18992916384181; double y17 = 32.1043092789916;
    GeoLocation p17 = new myPoint3D(x17, y17, z);

    double x18 = 35.19181834866828; double y18 = 32.10412754789916;
    GeoLocation p18 = new myPoint3D(x18, y18, z);

    double x19 = 35.192497606133976; double y19 = 32.10434562521009;
    GeoLocation p19 = new myPoint3D(x19, y19, z);

    double x20 = 35.19188202905569; double y20 = 32.10579947394958;
    GeoLocation p20 = new myPoint3D(x20, y20, z);

    double x21 = 35.19691277966102; double y21 = 32.10240110252101;
    GeoLocation p21 = new myPoint3D(x21, y21, z);

    double x23 = 35.197952892655366; double y23 = 32.10271004537815;
    GeoLocation p23 = new myPoint3D(x23, y23, z);

    double x24 = 35.198929325262306; double y24 = 32.10376408571429;
    GeoLocation p24 = new myPoint3D(x24, y24, z);

    double x25 = 35.200160479418884; double y25 = 32.1041457210084;
    GeoLocation p25 = new myPoint3D(x25, y25, z);

    double x26 = 35.201731262308314; double y26 = 32.104636394957986;
    GeoLocation p26 = new myPoint3D(x26, y26, z);

    double x27 = 35.20260156093624; double y27 = 32.10476360672269;
    GeoLocation p27 = new myPoint3D(x27, y27, z);

    double x28 = 35.20504264245359; double y28 = 32.104854472268904;
    GeoLocation p28 = new myPoint3D(x28, y28, z);

    double x29 = 35.21143190799032; double y29 = 32.104854472268904;
    GeoLocation p29 = new myPoint3D(x29, y29, z);

    double x30 = 35.210264434221145; double y30 = 32.103909470588235;
    GeoLocation p30 = new myPoint3D(x30, y30, z);

    double x31 = 35.19071455528652; double y31 = 32.106235628571426;
    GeoLocation p31 = new myPoint3D(x31, y31, z);

    double disX0 = Math.pow(Math.abs(p16.x() - p17.x()),2);
    double disY0 = Math.pow(Math.abs(p16.y() - p17.y()),2);
    double dis0 = Math.sqrt(disX0 + disY0);
    double distance0 = p16.distance(p17);

    double disX1 = Math.pow(p18.x() - p19.x(),2);
    double disY1 = Math.pow(p18.y() - p19.y(),2);
    double dis1 = Math.sqrt(disX1 + disY1);
    double distance1 = p18.distance(p19);

    double disX2 = Math.pow(Math.abs(p21.x() - p20.x()),2);
    double disY2 = Math.pow(Math.abs(p21.y() - p20.y()),2);
    double dis2 = Math.sqrt(disX2 + disY2);
    double distance2 = p21.distance(p20);

    double disX3 = Math.pow(Math.abs(p24.x() - p23.x()),2);
    double disY3 = Math.pow(Math.abs(p24.y() - p23.y()),2);
    double dis3 = Math.sqrt(disX3 + disY3);
    double distance3 = p24.distance(p23);

    double disX4 = Math.pow(Math.abs(p25.x() - p26.x()),2);
    double disY4 = Math.pow(Math.abs(p25.y() - p26.y()),2);
    double dis4 = Math.sqrt(disX4 + disY4);
    double distance4 = p25.distance(p26);

    double disX5 = Math.pow(Math.abs(p27.x() - p28.x()),2);
    double disY5 = Math.pow(Math.abs(p27.y() - p28.y()),2);
    double dis5 = Math.sqrt(disX5 + disY5);
    double distance5 = p27.distance(p28);

    @Test
    void x() {
        assertEquals(x0, p0.x());
        assertEquals(x1, p1.x());
        assertEquals(x2, p2.x());
        assertEquals(x3, p3.x());
        assertEquals(x4, p4.x());
        assertEquals(x5, p5.x());
        assertEquals(x6, p6.x());
        assertEquals(x7, p7.x());
        assertEquals(x8, p8.x());
    }

    @Test
    void y() {
        assertEquals(y9, p9.y());
        assertEquals(y10, p10.y());
        assertEquals(y11, p11.y());
        assertEquals(y12, p12.y());
        assertEquals(y13, p13.y());
        assertEquals(y14, p14.y());
        assertEquals(y15, p15.y());
    }

    @Test
    void z() {
        assertEquals(z, p16.z());
    }

    @Test
    void distance() {
        assertEquals(dis0, distance0);
        assertEquals(dis1, distance1);
        assertEquals(dis2, distance2);
        assertEquals(dis3, distance3);
        assertEquals(dis4, distance4);
        assertEquals(dis5, distance5);
    }

    @Test
    void ob(){
        GeoLocation p33 = new myPoint3D(x29, y29, z);
        GeoLocation p34 = new myPoint3D();
        GeoLocation p35 = new myPoint3D(0, 0,0);
        p34 = p29;
        assertEquals(p34, p29);
    }
}