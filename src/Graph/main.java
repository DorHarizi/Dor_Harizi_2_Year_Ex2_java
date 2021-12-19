package Graph;

import api.DirectedWeightedGraphAlgorithms;
import api.GeoLocation;
import api.NodeData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        myGraph dor = new myGraph();

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

//        int src76 = 28; double w76 = 1.2961326237960644; int dest76 = 29;

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
        dor.connect(src0, dest0, w0);
        dor.connect(src1, dest1, w1);
        dor.connect(src2, dest2, w2);
        dor.connect(src3, dest3, w3);
        dor.connect(src4, dest4, w4);
        dor.connect(src5, dest5, w5);
        dor.connect(src6, dest6, w6);
        dor.connect(src7, dest7, w7);
        dor.connect(src8, dest8, w8);
        dor.connect(src9, dest9, w9);
        dor.connect(src10, dest10, w10);
        dor.connect(src11, dest11, w11);
        dor.connect(src12, dest12, w12);
        dor.connect(src13, dest13, w13);
        dor.connect(src14, dest14, w14);
        dor.connect(src15, dest1, w1);
        dor.connect(src16, dest16, w16);
        dor.connect(src17, dest17, w17);
        dor.connect(src18, dest18, w18);
        dor.connect(src19, dest19, w19);
        dor.connect(src20, dest20, w20);
        dor.connect(src21, dest21, w21);
        dor.connect(src22, dest22, w22);
        dor.connect(src23, dest23, w23);
        dor.connect(src24, dest24, w24);
        dor.connect(src25, dest25, w25);
        dor.connect(src26, dest26, w26);
        dor.connect(src27, dest27, w27);
        dor.connect(src28, dest28, w28);
        dor.connect(src29, dest29, w29);
        dor.connect(src30, dest30, w30);
        dor.connect(src31, dest31, w31);
        dor.connect(src32, dest32, w32);
        dor.connect(src33, dest33, w33);
        dor.connect(src34, dest34, w34);
        dor.connect(src35, dest35, w35);
        dor.connect(src36, dest36, w36);
        dor.connect(src38, dest38, w38);
        dor.connect(src39, dest39, w39);
        dor.connect(src40, dest40, w40);
        dor.connect(src41, dest41, w41);
        dor.connect(src42, dest42, w42);
        dor.connect(src43, dest43, w43);
        dor.connect(src44, dest44, w44);
        dor.connect(src45, dest45, w45);
        dor.connect(src46, dest46, w46);
        dor.connect(src47, dest47, w47);
        dor.connect(src48, dest48, w48);
        dor.connect(src49, dest49, w49);
        dor.connect(src50, dest50, w50);
        dor.connect(src51, dest51, w51);
        dor.connect(src52, dest52, w52);
        dor.connect(src53, dest53, w53);
        dor.connect(src54, dest54, w54);
        dor.connect(src55, dest55, w55);
        dor.connect(src56, dest56, w56);
        dor.connect(src57, dest57, w57);
        dor.connect(src58, dest58, w58);
        dor.connect(src59, dest59, w59);
        dor.connect(src60, dest60, w60);
        dor.connect(src61, dest61, w61);
        dor.connect(src62, dest62, w62);
        dor.connect(src63, dest63, w63);
        dor.connect(src64, dest64, w64);
        dor.connect(src65, dest65, w65);
        dor.connect(src66, dest66, w66);
        dor.connect(src67, dest67, w67);
        dor.connect(src68, dest68, w68);
        dor.connect(src69, dest69, w69);
        dor.connect(src70, dest70, w70);
        dor.connect(src71, dest71, w71);
        dor.connect(src72, dest72, w72);
        dor.connect(src73, dest73, w73);
        dor.connect(src74, dest74, w74);
        dor.connect(src75, dest75, w75);
        dor.connect(src76, dest76, w76);
        dor.connect(src77, dest77, w77);
        dor.connect(src78, dest78, w78);
        dor.connect(src79, dest79, w79);
        myGraphAlgo g = new myGraphAlgo();
        g.init(dor);
//        String str = g.getGraph().getNode(0).getInfo();
//        String [] arr;
//        arr = str.split(",");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(g.center().getKey());
////        g.init(dor);
//        DirectedWeightedGraphAlgorithms g1 = new myGraphAlgo();
//        g1.load("C:/Users/dorha/IdeaProjects/Dor_Harizi_2_Year_Ex2_java/data/G2.json");
//        g1.save( "my graPH.json");
//
//        System.out.println(g1);
//        try {
//            myGraphAlgo.load("data/G2.json");
//        }
//        catch(FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println();
//        }
//        DirectedWeightedGraph g = new MyGraph(pd.getNodes(), pd.size);
//        DirectedWeightedGraphAlgorithms algo = new Algorithms();
//        algo.init(g);
//        g = new graphGen().generate_connected_graph(2);
//        algo.init(g);
//        DirectedWeightedGraph g1 = algo.copy();
//        System.out.println(g.toString());
//        ArrayList <Integer> arr = dor.getNeighbors_Of_Vertex_out().get();
//        for(NodeData i : arr){
//            String tmp = i.getInfo();
//            String [] vertexEdge =
//        }
//        int re=0;
//        for(EdgeData i : dor.getEdge_Of_Graph().get(re)){
//
//        }
//        double average = 0.0;
//
//        for(NodeData i : dor.getVertex_Of_Graph()){
//            average += i.getWeight();
//        }
//        average = average/dor.nodeSize();
//        System.out.println(average);
//        for(NodeData i : dor.getVertex_Of_Graph()){
//            if(i.getWeight() > average){
//                System.out.println(i.getKey());
//            }
//        }
//        g.isConnected();
//        System.out.println(g.isConnected());
//        List <NodeData> arr = g.shortestPath(0,1);
//        for(int i=0; i <arr.size();i++){
//            System.out.println(arr.get(i).getKey() );
//        }
//        System.out.println(g.shortestPathDist(0,30));
        List<NodeData> arr = new ArrayList<>();
        arr.add(node0);
        arr.add(node4);
        arr.add(node8);
        arr.add(node2);
        arr = g.tsp(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).getKey());
        }
////
        System.out.println(g.center());
///////////////////////////////////////////////////////////////////////
//        String n0 = dor.getNode(0).getInfo();
//        int src = 1;
//        int dest =
//        //        n0.replaceAll(",","");
////        ArrayList<Integer> arrIn = new ArrayList<>();
////        ArrayList<Integer> arrOut = new ArrayList<>();
////        int id =0;
////        int i=1;
////        int len = n0.length();
////        while(len-2 > i){
////            int tmp = n0.charAt(i);
////            int front = n0.charAt(i+1);
////            int back = n0.charAt(i-1);
////            if(40 == back && 44 == front){
////                if(tmp ==id){
////                    arrOut.add(tmp);
////                }
////                arrIn.add(tmp);
////            }
////            if(44== back && front == 41){
////                if(tmp == id){
////                    arrIn.add(tmp);
////                }
////                arrOut.add(tmp);
////            }
////            i++;
////        }
//
//
//
//
//
//
////        n0.replaceAll(",","");
////        String [] arr;
////        arr = n0.split(",");
////        ArrayList<Integer> in = new ArrayList<>();
////        ArrayList<Integer> out = new ArrayList<>();
////        for (String s : arr) {
////            char[] a = s.toCharArray();
////            int b = Integer.parseInt(String.valueOf(a[0]));
////            System.out.println(b);
////
////        }
////        System.out.println(arr[1]);
////        System.out.println(Arrays.toString(arr));
////        StringBuilder s1 = null;
////        StringBuilder s2 = null;
////        String [] arr = n0.split(",");
////        for (String value : arr) {
////            int a = Integer.parseInt(arr[0]);
////            int b = Integer.parseInt(arr[1]);
////            if (a == 0) {
////                s2.append(b);
////            } else {
////                s1.append(a);
////            }
////        }
////        System.out.println(Arrays.toString(arr));
////        n0.replaceAll(",","");
////        n0.replaceAll("(" ,"");
////        char [] arr = n0.toCharArray();
////        System.out.println(Arrays.toString(arr));
    }
}
