package Graph;

import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.EdgeData;
import api.NodeData;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class myGraphAlgo implements DirectedWeightedGraphAlgorithms {
    private myGraph my_Graph_Algo;
    private int myMc;
    private boolean isConnected;

    public myGraphAlgo() {
    }

    @Override
    public void init(DirectedWeightedGraph g) {
        if (g != null) {
            this.myMc = g.getMC();
            this.my_Graph_Algo = new myGraph((myGraph) g);
            this.isConnected = isConnected();
            return;
        }
        this.my_Graph_Algo = new myGraph();
    }

    @Override
    public DirectedWeightedGraph getGraph() {
        return this.my_Graph_Algo;
    }

    @Override
    public DirectedWeightedGraph copy() {
        return new myGraph(this.my_Graph_Algo);
    }

    @Override
    public boolean isConnected() {
        int size = this.my_Graph_Algo.nodeSize() * (this.my_Graph_Algo.nodeSize() - 1);
        if (!(this.my_Graph_Algo.edgeSize() >= size)) {
            ArrayList<Integer> visited = new ArrayList<>();
            for (int i = 0; i < my_Graph_Algo.getNeighbors_Of_Vertex_out().size(); i++) {
                if (!(visited.size() == my_Graph_Algo.nodeSize())) {
                    ArrayList<Integer> current = new ArrayList<>(my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i));
                    int index = 0;
                    while (index < current.size()) {
                        int tmp = current.get(index);
                        if ((!visited.contains(tmp))) {
                            visited.add(tmp);
                            index++;

                        } else {
                            index++;
                        }
                    }
                }
            }
            return visited.size() == my_Graph_Algo.nodeSize();
        }
        return true;
    }

    @Override
    public double shortestPathDist(int src, int dest) {
        List<NodeData> shortestPath = shortestPath(src, dest);
        double sumWight = 0.0;
        if (shortestPath != null) {
            if (shortestPath.size() % 2 == 0) {
                for (int i = 1; i < shortestPath.size(); i++) {
                    int srcTmp = shortestPath.get(i).getKey();
                    int destTmp = shortestPath.get(i - 1).getKey();
                    EdgeData edgeTmp = this.my_Graph_Algo.getEdge(srcTmp, destTmp);
                    if (edgeTmp != null) {
                        sumWight += edgeTmp.getWeight();
                    }
                }
                return sumWight;
            }
            for (int i = 0; i < shortestPath.size() - 1; i++) {
                int srcTmp = shortestPath.get(i + 1).getKey();
                int destTmp = shortestPath.get(i).getKey();
                EdgeData edgeTmp = this.my_Graph_Algo.getEdge(srcTmp, destTmp);
                if (edgeTmp != null) {
                    sumWight += edgeTmp.getWeight();
                }
            }
            return sumWight;
        }
        return sumWight;
    }

    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        List<NodeData> shortestPath = new ArrayList<>();
        if ((this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest) != null) && (this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src) != null)) {
            ArrayList<Integer> destArray = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest);
            if (!destArray.contains(src)) {
                ArrayList<Integer> srcArray = this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src);
                ArrayList<ArrayList<Integer>> shortestRoutesOptions = new ArrayList<>();
                int minSize = Integer.MAX_VALUE;
                int minIndex = -1;
                int index = 0;
                for (int i : destArray) {
                    if (this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i) != null) {
                        ArrayList<Integer> visited = new ArrayList<>();
                        visited.add(dest);
                        ArrayList<Integer> tmp = Neighbors(src, srcArray, i, destArray, visited);
                        if (tmp != null) {
                            tmp.add(src);
                            if (tmp.size() < minSize && tmp.size() != 1) {
                                minSize = tmp.size();
                                minIndex = index;
                            }
                            shortestRoutesOptions.add(index, tmp);
                            index++;
                        }
                    }
                }
                if (index != 0) {
                    ArrayList<Integer> result = shortestRoutesOptions.get(minIndex);
                    for (int j : result) {
                        if (!shortestPath.contains(this.my_Graph_Algo.getNode(j))) {
                            shortestPath.add(this.my_Graph_Algo.getNode(j));
                        }
                    }
                    return shortestPath;
                }
                return null;
            }
            shortestPath.add(this.my_Graph_Algo.getNode(src));
            shortestPath.add(this.my_Graph_Algo.getNode(dest));
            return shortestPath;
        }
        return null;
    }

    private ArrayList<Integer> Neighbors(int src, ArrayList<Integer> srcArray, int dest, ArrayList<Integer> destArray, ArrayList<Integer> visited) {
        if (this.isConnected) {
            if ((destArray.contains(src))) {
                visited.add(dest);
                return visited;
            }
            for (int i : srcArray) {
                if (destArray.contains(i)) {
                    visited.add(i);
                    return visited;
                }
            }
            visited.add(dest);
            int index = destArray.indexOf(dest);
            if (index + 1 < destArray.size()) {
                int dest1 = destArray.get(index + 1);
                ArrayList<Integer> destArray1 = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest);
                ArrayList<Integer> tmp = checkNeighbors(src, srcArray, dest1, destArray1, visited);
                if (tmp != null) {
                    return tmp;
                }
            }
            return null;
        }
        if (visited.size() < this.my_Graph_Algo.nodeSize()) {
            if ((destArray.contains(src))) {
                visited.add(dest);
                return visited;
            }
            for (int i : srcArray) {
                if (destArray.contains(i)) {
                    visited.add(dest);
                    visited.add(i);
                    return visited;
                }
            }
            visited.add(dest);
            int index = destArray.indexOf(dest);
            if (index + 1 < destArray.size()) {
                int dest1 = destArray.get(index + 1);
                ArrayList<Integer> destArray1 = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest);
                ArrayList<Integer> tmp = checkNeighbors(src, srcArray, dest1, destArray1, visited);
                if (tmp != null) {
                    return tmp;
                }
            }
            return null;
        }
        return null;
    }

    private ArrayList<Integer> checkNeighbors(int src, ArrayList<Integer> srcArray, int dest, ArrayList<Integer> destArray, ArrayList<Integer> visited) {
        if (this.isConnected) {
            if ((visited.size() < this.my_Graph_Algo.nodeSize())) {
                for (int i : destArray) {
                    ArrayList<Integer> dest2Array = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i);
                    for (int j : srcArray) {
                        if (dest2Array.contains(j) || i == src) {
                            return Neighbors(src, srcArray, i, dest2Array, visited);
                        }
                    }
                }
                return Neighbors(src, srcArray, dest, destArray, visited);
            }
            return null;
        }
        for (int i : destArray) {
            ArrayList<Integer> dest2Array = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i);
            for (int j : srcArray) {
                if (dest2Array.contains(j) || i == src) {
                    return Neighbors(src, srcArray, i, dest2Array, visited);
                }
            }
        }
        return Neighbors(src, srcArray, dest, destArray, visited);
    }


    @Override
    public NodeData center() {
        int index = -1;
        double maxWight = Double.MAX_VALUE;
        double tmp;
        for(int i =0; i<this.my_Graph_Algo.nodeSize();i++){
            ArrayList<Integer> visited = new ArrayList<>();
            double totalWight = this.my_Graph_Algo.getNode(i).getWeight();
            tmp = getWightTotal(i, visited, totalWight);
            if(tmp < maxWight ){
                index = i;
                maxWight = tmp;
            }
        }

//        int maxIndexWight = -1;
//        double maxWight = Double.MIN_VALUE;
//        int maxIndexEdges = -1;
//        int edgeInIndex = 1;
//        int edgeOutIndex = 1;
//        ArrayList<Integer> doublesWithSameSumEdges = new ArrayList<>();
//        ArrayList<Integer> doublesWithSameSumWight = new ArrayList<>();
//        for(int i=0; i <this.my_Graph_Algo.nodeSize(); i++){
//            if(maxWight <= this.my_Graph_Algo.getNode(i).getWeight()){
//                if(maxWight == this.my_Graph_Algo.getNode(i).getWeight()){
//                    doublesWithSameSumWight.add(maxIndexWight);
//                }
//                maxWight = this.my_Graph_Algo.getNode(i).getWeight();
//                maxIndexWight = i;
//            }
//            if(this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i)!= null && this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i) != null){
//                if((edgeInIndex <= this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i).size()) && (edgeOutIndex <= this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).size())){
//                    if(edgeInIndex+edgeOutIndex == this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i).size()+ this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).size()){
//                        doublesWithSameSumEdges.add(maxIndexEdges);
//                    }
//                    maxIndexEdges = i;
//                    edgeInIndex = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i).size();
//                    edgeOutIndex = this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).size();
//                }
//
//            }
//        }
//        if(maxIndexWight == maxIndexEdges){
//            NodeData center = new myNode(this.my_Graph_Algo.getNode(maxIndexEdges));
//            return center;
//        }
//        double max = Double.max(this.my_Graph_Algo.getNode(maxIndexEdges).getWeight(),this.my_Graph_Algo.getNode(maxIndexWight).getWeight());
//        if(max == this.my_Graph_Algo.getNode(maxIndexWight).getWeight()){
//            return this.my_Graph_Algo.getNode(maxIndexWight);
//        }
//        return this.my_Graph_Algo.getNode(maxIndexEdges);
        return this.my_Graph_Algo.getNode(index);
    }

    @Override
    public List<NodeData> tsp(List<NodeData> cities) {
        int src = cities.get(0).getKey();
        int dest = cities.get(cities.size()-1).getKey();
        int tmp = 0;
        double sumWight = 0.0;
        List<NodeData> listShortestPath = shortestPath(src, dest);
        for(NodeData current : listShortestPath){
            if(cities.contains(current)){
                sumWight += current.getWeight();
                tmp++;
            }
        }
        double wight = shortestPathDist(src, dest);
        if((sumWight != 0.0) && (sumWight <= wight) && (listShortestPath.size()-1==tmp)){
            return listShortestPath;
        }
        return null;
    }

    @Override
    public boolean save(String file) {
        try {
            File jsonGraph = new File(file);
            if (jsonGraph.createNewFile()) {
                System.out.println("File created: " + jsonGraph.getName());
            } else {
                System.err.println("The file not create");
                return false;
            }
        } catch (IOException e) {
            System.err.println("Error happened");
            e.printStackTrace();
            return false;
        }
        try {
            FileWriter myWriter = new FileWriter(file);
            String tmp = this.my_Graph_Algo.toString();
            System.out.println(tmp);
            myWriter.write(tmp);
            myWriter.flush();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            return true;
        } catch (IOException e) {
            System.err.println("Error happened");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean load(String file) {
        boolean loaded = false;
        try {
            JSONParser parser = new JSONParser();
            Object jsonA = parser.parse(new FileReader(file));
            JSONObject jsonAll = (JSONObject) jsonA;
            JSONArray jsonEdegs = (JSONArray) jsonAll.get("Edges");
            JSONArray jsonNodes = (JSONArray) jsonAll.get("Nodes");
            Iterator<JSONObject> nodes = jsonNodes.iterator();
            Iterator<JSONObject> edegs = jsonEdegs.iterator();
            DirectedWeightedGraph graph = new myGraph();
            while (nodes.hasNext()) {
                JSONObject tmp = nodes.next();
                String point = (String) tmp.get("pos");
                long dataId = (long) tmp.get("id");
                if (point != null) {
                    String[] dataPoint = point.split(",");
                    if (dataPoint[0] != null && dataPoint[1] != null) {
                            double x = Double.parseDouble(dataPoint[0]);
                            double y = Double.parseDouble(dataPoint[1]);
                            int id = (int) dataId;
                            NodeData node = new myNode(id, x, y, 0.0);
                            graph.addNode(node);
                    }
                }
            }
            while (edegs.hasNext()) {
                JSONObject tmp = edegs.next();
                long i = (long) tmp.get("src");
                int dataSrc = (int) i;
                double dataW = (double) tmp.get("w");
                long j = (long) tmp.get("dest");
                int dataDest = (int) j;
                if (graph.getNode(dataSrc) != null && graph.getNode(dataDest) != null) {
                    graph.connect(dataSrc, dataDest, dataW);
                }
            }
            init(graph);
            loaded = true;
        } catch (ParseException s) {
            s.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loaded;
    }

    @Override
    public String toString() {
        String myGraph = "{"+'"'+"Edges"+'"'+":" + "[\n";
        Iterator<EdgeData> edges = this.my_Graph_Algo.edgeIter();
        while (edges.hasNext()) {
            EdgeData edge = edges.next();
            myGraph = myGraph + "" + "{\n" + '"' + "src" + '"' + ": "+edge.getSrc()+",\n"+'"'+"w"+'"'+": "+edge.getWeight()+",\n"+'"'+"dest"+'"'+": "+edge.getDest()+"\n}"+",\n";
        }
        myGraph = myGraph.substring(0, myGraph.length() - 2) + "\n]";
        myGraph = myGraph + ","+'"'+ "Nodes" + '"' + ": [\n";

        Iterator<NodeData> nodes = this.my_Graph_Algo.nodeIter();
        while (nodes.hasNext()) {
            NodeData node = nodes.next();
            myGraph = myGraph +"" + "{\n" + '"' + "pos" + '"' + ": " + '"'+node.getLocation().x()+","+node.getLocation().y()+'"'+",\n"+'"'+"id"+'"'+": "+node.getKey()+"\n}"+",\n";
        }
        myGraph = myGraph.substring(0, myGraph.length() - 2) + "\n]}";
        return myGraph;
    }

    private HashMap<Vector<Integer>,Stack<Integer>> shortestRoutesWithMaxVertex() {
        int index = 0;
        HashMap<Vector<Integer>, Stack<Integer>> maxRouteNodes = new HashMap<>();
        Vector<Double> tmp1 = average();
        double averageWight = tmp1.get(0);
        double sizeTmp = tmp1.get(1);
        int size = (int) sizeTmp;
        ArrayList<Vector<Integer>> keys = new ArrayList<>();
        while (index < size) {
            if (!((this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(index).isEmpty()) && (this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(index).isEmpty()))) {
                if (this.my_Graph_Algo.getNode(index).getWeight() < averageWight) {
                    ArrayList<Integer> srcTmpArray = this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(index);
                    for (int i : srcTmpArray) {
                        Stack<Integer> visited = new Stack<>();
                        visited.add(index);
                        visited.add(i);
                        Stack<Integer> tmp = inRoute(visited, srcTmpArray);
                        Vector<Integer> vertex = new Vector<>(2);
                        vertex.add(index);
                        vertex.add(tmp.size());
                        if (tmp.size() != 2) {
                            if ((tmp.size() >= maxRouteNodes.get(keys.get(index)).size())) {
                                maxRouteNodes.computeIfAbsent(vertex, k -> new Stack<>());
                                maxRouteNodes.put(vertex, tmp);
                                if (keys.get(index) == vertex) {
                                    keys.remove(index);
                                    keys.add(index, vertex);
                                } else {
                                    keys.add(index, vertex);
                                }
                            }
                        }
                    }
                }
                index++;
            } else {
                Vector<Integer> vertex = new Vector<>(2);
                vertex.add(index);
                vertex.add(0);
                maxRouteNodes.put(vertex, null);
                index++;
            }
        }
        return maxRouteNodes;
    }

    private Stack<Integer> inRoute( Stack<Integer> visited, ArrayList<Integer> srcOutArray) {
        if(visited.size() <= this.my_Graph_Algo.nodeSize()){
            for(int i : srcOutArray){
                if(!(visited.contains(i))) {
                    visited.add(i);
                    visited = inRoute(visited, this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i));
                }
            }
            return visited;
        }
        return visited;
    }

    private Vector<Double> average(){
        double average = 0.0;
        double count = 0;
        for(NodeData i : this.my_Graph_Algo.getVertex_Of_Graph()){
            average += i.getWeight();
            count++;
        }
        average = average/this.my_Graph_Algo.nodeSize();
        Vector<Double> tmp = new Vector<>(2);
        tmp.add(average);
        tmp.add(count);
        return tmp;
    }

    public double getWightTotal(int key, ArrayList<Integer> visited, double totalWight ){
        if(visited.size() <= this.my_Graph_Algo.nodeSize() && (!visited.contains(key))){
            if(this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(key) != null){
                for(int inEdge : this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(key)){
                    if(!visited.contains(inEdge)){
                        totalWight += this.my_Graph_Algo.getNode(inEdge).getWeight();
                        visited.add(inEdge);
                        totalWight += getWightTotal(inEdge, visited,totalWight);
                    }
                }
            }
            if(this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(key) != null){
                for(int outEdge : this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(key)){
                    if(!visited.contains(outEdge)){
                        totalWight += this.my_Graph_Algo.getNode(outEdge).getWeight();
                        visited.add(outEdge);
                        totalWight += getWightTotal(outEdge, visited,totalWight);
                    }
                }
            }
            return totalWight;
        }
        return totalWight;
    }
}