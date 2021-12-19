package Test;

import Graph.myGraph;
import Graph.myGraphAlgo;
import Graph.myNode;
import Graph.myPoint3D;
import api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class myGraphAlgoTest {
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


    int src0 = 0; double w0 = 1.3118716362419698; int dest0 =  16;

    int src1 = 0; double w1 = 1.232037506070033; int dest1 = 1;

    int src2 = 0; double w2 = 0.915443564766393; int dest2 = 21;

    int src3 = 1; double w3 = 1.8635670623870366; int dest3 = 0;

    int src4 = 1; double w4 = 1.8015954015822042; int dest4 = 2;

    int src5 = 1; double w5 = 1.2579255647223926; int dest5 = 2;

    int src6 = 2; double w6 = 1.5784991011275615; int dest6 = 1;

    int src7 = 2; double w7 = 1.0631605142699874; int dest7 = 3;

    int src8 = 2; double w8 = 1.7938753352369698; int dest8 = 6;

    int src9 =3; double w9 = 1.440561778177153; int dest9 = 2;

    int src10 = 3; double w10 = 1.2539385028794277; int dest10 = 4;

    int src11 = 4; double w11 = 1.8418222744214585; int dest11 = 3;

    int src12 = 4; double w12 = 1.1422264879958028; int dest12 = 5;

    int src13 = 4; double w13 = 1.1730460536148573; int dest13 = 28;

    int src14 = 5; double w14 = 1.5855912911662344; int dest14 = 4;

    int src15 = 5; double w15 = 1.734311926030133; int dest15 = 6;

    int src16 = 5; double w16 = 1.1029613695942861; int dest16 = 28;

    int src17 = 6; double w17 = 1.8474047229605628; int dest17 = 2;

    int src18 = 6; double w18 = 1.4964304236123005; int dest18 = 5;

    int src19 = 6; double w19 = 1.237565124536135; int dest19 = 7;

    int src20 = 7; double w20 = 1.5786081900467002; int dest20 = 6;

    int src21 = 7; double w21 = 1.3717352984705653; int dest21 = 8;

    int src22 = 7; double w22 = 1.0687354408357501; int dest22 = 27;

    int src23 = 8; double w23 = 1.2817370911337442; int dest23 = 7;

    int src24 = 8; double w24 = 1.5328553219807337; int dest24 = 9;

    int src25 = 8; double w25 = 1.025149439083266; int dest25 = 25;

    int src26 = 8; double w26 = 1.2039873817393092; int dest26 = 26;

    int src27 = 9; double w27 = 1.0350683385093797; int dest27 = 23;

    int src28 = 9; double w28 = 1.9855087252581762; int dest28 = 8;

    int src29 = 9; double w29 = 1.2861739185896588; int dest29 =10;

    int src30 = 10; double w30 = 1.5815006562559664; int dest30 = 9;

    int src31 = 10; double w31 =1.4962204797190428; int dest31 = 11;

    int src32 = 11; double w32 = 1.3784147388591739; int dest32 = 10;

    int src33 = 11; double w33 = 1.9316059913913906; int dest33 = 12;

    int src34 = 12; double w34 = 1.0666986438224981; int dest34 = 11;

    int src35 = 12; double w35 = 1.5484109702862576; int dest35 = 13;

    int src36 = 13; double w36 = 1.823489852982211; int dest36 = 12;

    int src38 = 13; double w38 = 1.011071987085077; int dest38 = 14;

    int src39 = 13; double w39 = 1.2074225999744648; int dest39 = 30;

    int src40 = 14; double w40 = 0.7167080826867309; int dest40 = 17;

    int src41 = 14; double w41 = 1.3207562671517605; int dest41 = 13;

    int src42 = 14; double w42 = 1.118950355920981; int dest42 = 15;

    int src43 = 15; double w43 = 1.8726071511162605; int dest43 = 16;

    int src44 = 15; double w44 = 1.635946027210021;  int dest44 = 14;

    int src45 = 16; double w45 = 1.4418017651347555; int dest45 = 0;

    int src46 = 16; double w46 = 1.5677693324851103; int dest46 = 15;

    int src47 = 17; double w47 = 1.1057039393606207; int dest47 = 18;

    int src48 = 17; double w48 = 1.0657493401365328; int dest48 = 14;

    int src49 = 18; double w49 = 1.5681055954289413; int dest49 = 17;

    int src50 = 18; double w50 = 0.550880804160341; int dest50 = 19;

    int src51 = 18; double w51 = 1.0584450243907368; int dest51 = 20;

    int src52 = 19; double w52 = 0.6852429593105193; int dest52 = 18;

    int src53 = 19; double w53 = 1.2004731394998582; int dest53 = 20;

    int src54 = 20; double w54 = 1.4193627816078853; int dest54 = 18;

    int src55 = 20; double w55 = 0.878753604473191; int dest55 = 19;

    int src56 = 20; double w56 = 1.4195513987476474; int dest56 = 11;

    int src57 = 20; double w57 = 1.0252508738027712; int dest57 = 30;

    int src58 = 21; double w58 = 0.9532629885558567; int dest58 = 0;

    int src59 = 21; double w59 = 0.9339136351151504; int dest59 = 22;

    int src60 = 22; double w60 = 0.77503542792348; int dest60 = 21;

    int src61 = 22; double w61 = 1.0711518190132492; int dest61 = 23;

    int src62 = 23; double w62= 1.016805672689567; int dest62 = 22;

    int src63 = 23; double w63 = 1.2304170123117533; int dest63 = 24;

    int src64 = 23; double w64 = 1.4962903880836746; int dest64 = 9;

    int src65 = 24; double w65 = 0.8356693500627063; int dest65 = 23;

    int src66 = 24; double w66 = 1.3090485093357531; int dest66 = 25;

    int src67 = 25; double w67 = 0.7216646454371419; int dest67 = 8;

    int src68 = 25; double w68 = 1.0426737796145; int dest68 = 24;

    int src69 = 25; double w69 = 0.7084860462408276; int dest69 = 26;

    int src70 = 26; double w70 = 1.0266053576264493; int dest70 = 1;

    int src71 = 26; double w71 = 1.0227987431412882; int dest71 = 8;

    int src72 = 26; double w72 = 0.5713405300617479; int dest72 = 25;


    int src73 = 27; double w73 = 0.8675447814837128; int dest73 = 7;


    int src74 = 28; double w74 = 1.249725662250064; int dest74 = 4;

    int src75 = 28; double w75 = 1.1032214727491811; int dest75 = 5;

    int src76 = 28; double w76 = 1.2961326237960644; int dest76 = 29;

    int src77 = 29; double w77 = 0.92393101248433; int dest77 = 28;

    int src78 = 0; double w78 = 1.1539640587451867; int dest78 = 20;

    public static void main(String[] args) {

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


        int src0 = 0; double w0 = 1.3118716362419698; int dest0 =  16;

        int src1 = 0; double w1 = 1.232037506070033; int dest1 = 1;

        int src2 = 0; double w2 = 0.915443564766393; int dest2 = 21;

        int src3 = 1; double w3 = 1.8635670623870366; int dest3 = 0;

        int src4 = 1; double w4 = 1.8015954015822042; int dest4 = 2;

        int src5 = 1; double w5 = 1.2579255647223926; int dest5 = 2;

        int src6 = 2; double w6 = 1.5784991011275615; int dest6 = 1;

        int src7 = 2; double w7 = 1.0631605142699874; int dest7 = 3;

        int src8 = 2; double w8 = 1.7938753352369698; int dest8 = 6;

        int src9 =3; double w9 = 1.440561778177153; int dest9 = 2;

        int src10 = 3; double w10 = 1.2539385028794277; int dest10 = 4;

        int src11 = 4; double w11 = 1.8418222744214585; int dest11 = 3;

        int src12 = 4; double w12 = 1.1422264879958028; int dest12 = 5;

        int src13 = 4; double w13 = 1.1730460536148573; int dest13 = 28;

        int src14 = 5; double w14 = 1.5855912911662344; int dest14 = 4;

        int src15 = 5; double w15 = 1.734311926030133; int dest15 = 6;

        int src16 = 5; double w16 = 1.1029613695942861; int dest16 = 28;

        int src17 = 6; double w17 = 1.8474047229605628; int dest17 = 2;

        int src18 = 6; double w18 = 1.4964304236123005; int dest18 = 5;

        int src19 = 6; double w19 = 1.237565124536135; int dest19 = 7;

        int src20 = 7; double w20 = 1.5786081900467002; int dest20 = 6;

        int src21 = 7; double w21 = 1.3717352984705653; int dest21 = 8;

        int src22 = 7; double w22 = 1.0687354408357501; int dest22 = 27;

        int src23 = 8; double w23 = 1.2817370911337442; int dest23 = 7;

        int src24 = 8; double w24 = 1.5328553219807337; int dest24 = 9;

        int src25 = 8; double w25 = 1.025149439083266; int dest25 = 25;

        int src26 = 8; double w26 = 1.2039873817393092; int dest26 = 26;

        int src27 = 9; double w27 = 1.0350683385093797; int dest27 = 23;

        int src28 = 9; double w28 = 1.9855087252581762; int dest28 = 8;

        int src29 = 9; double w29 = 1.2861739185896588; int dest29 =10;

        int src30 = 10; double w30 = 1.5815006562559664; int dest30 = 9;

        int src31 = 10; double w31 =1.4962204797190428; int dest31 = 11;

        int src32 = 11; double w32 = 1.3784147388591739; int dest32 = 10;

        int src33 = 11; double w33 = 1.9316059913913906; int dest33 = 12;

        int src34 = 12; double w34 = 1.0666986438224981; int dest34 = 11;

        int src35 = 12; double w35 = 1.5484109702862576; int dest35 = 13;

        int src36 = 13; double w36 = 1.823489852982211; int dest36 = 12;

        int src38 = 13; double w38 = 1.011071987085077; int dest38 = 14;

        int src39 = 13; double w39 = 1.2074225999744648; int dest39 = 30;

        int src40 = 14; double w40 = 0.7167080826867309; int dest40 = 17;

        int src41 = 14; double w41 = 1.3207562671517605; int dest41 = 13;

        int src42 = 14; double w42 = 1.118950355920981; int dest42 = 15;

        int src43 = 15; double w43 = 1.8726071511162605; int dest43 = 16;

        int src44 = 15; double w44 = 1.635946027210021;  int dest44 = 14;

        int src45 = 16; double w45 = 1.4418017651347555; int dest45 = 0;

        int src46 = 16; double w46 = 1.5677693324851103; int dest46 = 15;

        int src47 = 17; double w47 = 1.1057039393606207; int dest47 = 18;

        int src48 = 17; double w48 = 1.0657493401365328; int dest48 = 14;

        int src49 = 18; double w49 = 1.5681055954289413; int dest49 = 17;

        int src50 = 18; double w50 = 0.550880804160341; int dest50 = 19;

        int src51 = 18; double w51 = 1.0584450243907368; int dest51 = 20;

        int src52 = 19; double w52 = 0.6852429593105193; int dest52 = 18;

        int src53 = 19; double w53 = 1.2004731394998582; int dest53 = 20;

        int src54 = 20; double w54 = 1.4193627816078853; int dest54 = 18;

        int src55 = 20; double w55 = 0.878753604473191; int dest55 = 19;

        int src56 = 20; double w56 = 1.4195513987476474; int dest56 = 11;

        int src57 = 20; double w57 = 1.0252508738027712; int dest57 = 30;

        int src58 = 21; double w58 = 0.9532629885558567; int dest58 = 0;

        int src59 = 21; double w59 = 0.9339136351151504; int dest59 = 22;

        int src60 = 22; double w60 = 0.77503542792348; int dest60 = 21;

        int src61 = 22; double w61 = 1.0711518190132492; int dest61 = 23;

        int src62 = 23; double w62= 1.016805672689567; int dest62 = 22;

        int src63 = 23; double w63 = 1.2304170123117533; int dest63 = 24;

        int src64 = 23; double w64 = 1.4962903880836746; int dest64 = 9;

        int src65 = 24; double w65 = 0.8356693500627063; int dest65 = 23;

        int src66 = 24; double w66 = 1.3090485093357531; int dest66 = 25;

        int src67 = 25; double w67 = 0.7216646454371419; int dest67 = 8;

        int src68 = 25; double w68 = 1.0426737796145; int dest68 = 24;

        int src69 = 25; double w69 = 0.7084860462408276; int dest69 = 26;

        int src70 = 26; double w70 = 1.0266053576264493; int dest70 = 1;

        int src71 = 26; double w71 = 1.0227987431412882; int dest71 = 8;

        int src72 = 26; double w72 = 0.5713405300617479; int dest72 = 25;


        int src73 = 27; double w73 = 0.8675447814837128; int dest73 = 7;


        int src74 = 28; double w74 = 1.249725662250064; int dest74 = 4;

        int src75 = 28; double w75 = 1.1032214727491811; int dest75 = 5;

        int src76 = 28; double w76 = 1.2961326237960644; int dest76 = 29;

        int src77 = 29; double w77 = 0.92393101248433; int dest77 = 28;

        int src78 = 0; double w78 = 1.1539640587451867; int dest78 = 20;

        int src79 = 30; double w79 = 1.001001008098316; int dest79 = 13;
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
     void init() {
        DirectedWeightedGraphAlgorithms my_algo_graph = new myGraphAlgo();
        my_algo_graph.init(dor);
        assertNotNull(my_algo_graph.getGraph());
    }

    @Test
    void getGraph() {
        DirectedWeightedGraphAlgorithms my_algo_graph = new myGraphAlgo();
        Assertions.assertNull(my_algo_graph.getGraph());
        my_algo_graph.init(dor);
        assertNotNull(my_algo_graph.getGraph());
    }

    @Test
    void copy() {
        DirectedWeightedGraphAlgorithms my_algo_graph = new myGraphAlgo();
        my_algo_graph.init(dor);
        DirectedWeightedGraph tmp = my_algo_graph.copy();
        Assertions.assertNotEquals(tmp, dor);
        Iterator<NodeData> iter = tmp.nodeIter();
        while (iter.hasNext()) {
            NodeData n = iter.next();
            Assertions.assertNotEquals(dor.getNode(n.getKey()), n);
        }

        Iterator<EdgeData> iter1 = dor.edgeIter();
        while (iter1.hasNext()) {
            EdgeData e = iter1.next();
            Assertions.assertNotEquals(dor.getEdge(e.getSrc(), e.getDest()), e);

        }
    }

    @Test
    void isConnected() {
        DirectedWeightedGraphAlgorithms my_algo_graph = new myGraphAlgo();
        my_algo_graph.init(dor);
        Assertions.assertTrue(my_algo_graph.isConnected());
    }

    @Test
    void shortestPathDist() {
    }

    @Test
    void shortestPath() {
    }

    @Test
    void center() {
//        DirectedWeightedGraphAlgorithms my_algo_graph = new myGraphAlgo();
//        my_algo_graph.init(dor);
//        int a = my_algo_graph.center().getKey();
//        Assertions.assertEquals(0,a);
    }

    @Test
    void tsp() {
        myGraphAlgo g = new myGraphAlgo();
        g.load("data/G1.json");
        List<NodeData> l = new LinkedList<>();
        l.add(g.getGraph().getNode(5));
        l.add(g.getGraph().getNode(3));
        l.add(g.getGraph().getNode(1));
        l.add(g.getGraph().getNode(2));
        l=g.tsp(l);
        for(int i =5;i<=1;i--){
            Assertions.assertEquals(l.remove(0).getKey(),i);
        }
    }

    @Test
    void save() throws IOException {
        DirectedWeightedGraphAlgorithms g1 = new myGraphAlgo();
        g1.load("C:/Users/dorha/IdeaProjects/Dor_Harizi_2_Year_Ex2_java/data/G2.json");
        System.out.println(g1);
        boolean save = g1.save( "my graPH.json");
        Assertions.assertTrue(save);

    }

    @Test
    void load() {
        DirectedWeightedGraphAlgorithms g1 = new myGraphAlgo();
        boolean load = g1.load("C:/Users/dorha/IdeaProjects/Dor_Harizi_2_Year_Ex2_java/data/G2.json");
        Assertions.assertTrue(load);
    }
}