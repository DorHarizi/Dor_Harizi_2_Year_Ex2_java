package Graph;

import api.*;

import javax.lang.model.type.NullType;
import java.util.*;

public class myGraphAlgo implements DirectedWeightedGraphAlgorithms {
    private myGraph my_Graph_Algo;
    int myMc;

    public myGraphAlgo() {
    }

    /**
     * Inits the graph on which this set of algorithms operates on.
     *
     * @param g
     */
    @Override
    public void init(DirectedWeightedGraph g) {
        if (g != null) {
            this.myMc = g.getMC();
            this.my_Graph_Algo = new myGraph((myGraph) g);
            return;
        }
        assert false;
        this.myMc = g.getMC();
        this.my_Graph_Algo = new myGraph();
    }

    /**
     * Returns the underlying graph of which this class works.
     *
     * @return
     */
    @Override
    public DirectedWeightedGraph getGraph() {
        return this.my_Graph_Algo;
    }

    /**
     * Computes a deep copy of this weighted graph.
     *
     * @return
     */
    @Override
    public DirectedWeightedGraph copy() {
        return new myGraph(this.my_Graph_Algo);
    }

    /**
     * Returns true if and only if (iff) there is a valid path from each node to each
     * other node. NOTE: assume directional graph (all n*(n-1) ordered pairs).
     *
     * @return
     */
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

    /**
     * Computes the length of the shortest path between src to dest
     * Note: if no such path --> returns -1
     *
     * @param src  - start node
     * @param dest - end (target) node
     * @return
     */
    @Override
    public double shortestPathDist(int src, int dest) {
        List<NodeData> tmp;
        tmp = shortestPath(src, dest);
        double sumWight = 0;
        for(NodeData i : tmp){
            sumWight += i.getWeight();
        }
        return sumWight;
    }


    /**
     * Computes the the shortest path between src to dest - as an ordered List of nodes:
     * src--> n1-->n2-->...dest
     * see: https://en.wikipedia.org/wiki/Shortest_path_problem
     * Note if no such path --> returns null;
     *
     * @param src  - start node
     * @param dest - end (target) node
     * @return
     */
    @Override
    public List<NodeData> shortestPath(int src, int dest) {
        int index = 0;
        if((!this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src).isEmpty()) || (!this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest).isEmpty())){
            ArrayList <ArrayList<NodeData>> minRouteNodes = new ArrayList<>();
            if(this.my_Graph_Algo.getEdge(src, dest) != null){
                ArrayList <NodeData> tmp = new ArrayList<>();
                tmp.add(this.my_Graph_Algo.getNode(src));
                tmp.add(this.my_Graph_Algo.getNode(dest));
                minRouteNodes.add(tmp);
                index++;
            }
            if(!((this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src).size()-1 == 0) || (this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest).contains(src)))){
                for(int i : this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src)){
                    if(i != dest){
                        ArrayList <NodeData> visited = new ArrayList<>();
                        ArrayList <NodeData> tmp;
                        visited.add(this.my_Graph_Algo.getNode(src));
                        visited.add(this.my_Graph_Algo.getNode(dest));
                        ArrayList<Integer> srcTmpArray = this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i);
                        visited.add(this.my_Graph_Algo.getNode(i));
                        tmp = outRoute(visited, srcTmpArray);
                        tmp.remove(1);
                        minRouteNodes.add(index, new ArrayList<>(tmp));
                        tmp.clear();
                        index++;
                    }else{
                        minRouteNodes.get(index).add(this.my_Graph_Algo.getNode(src));
                        minRouteNodes.get(index).add(this.my_Graph_Algo.getNode(i));
                        minRouteNodes.get(index).add(this.my_Graph_Algo.getNode(dest));
                        index++;
                    }
                }
                List<NodeData> shortestPath;
                int result = Integer.MAX_VALUE;
                int i = 0;
                for (ArrayList<NodeData> minRouteNode : minRouteNodes) {
                    int size = minRouteNode.size();
                    if (size < result) {
                        result = size;
                        i = minRouteNodes.indexOf(minRouteNode);
                    }
                }
                shortestPath = new ArrayList<>(minRouteNodes.get(i));
                return shortestPath;
            }
            List<NodeData> tmp;
            tmp = new ArrayList<>(minRouteNodes.get(index));
            return tmp;
        }
        return null;
    }


    private ArrayList<NodeData> outRoute( ArrayList<NodeData> visited, ArrayList<Integer> srcOutArray) {
        if(visited.size() <= this.my_Graph_Algo.nodeSize()){
            for(int i : srcOutArray){
                if(!(visited.contains(this.my_Graph_Algo.getNode(i)))){
                    if(this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).contains(visited.get(1).getKey())){
                        visited.add(this.my_Graph_Algo.getNode(i));
                        visited.add(this.my_Graph_Algo.getNode(visited.get(1).getKey()));
                        return visited;
                    }
                    visited.add(this.my_Graph_Algo.getNode(i));
                    visited = outRoute(visited, this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i));
                    return visited;
                }
                if((i == visited.get(1).getKey())){
                    visited.add(this.my_Graph_Algo.getNode(i));
                    return visited;
                }
            }
        }
        return visited;
    }

    /**
     * Finds the NodeData which minimizes the max distance to all the other nodes.
     * Assuming the graph isConnected, elese return null. See: https://en.wikipedia.org/wiki/Graph_center
     *
     * @return the Node data to which the max shortest path to all the other nodes is minimized.
     */
    @Override
    public NodeData center() {
        return null;
    }

    /**
     * Computes a list of consecutive nodes which go over all the nodes in cities.
     * the sum of the weights of all the consecutive (pairs) of nodes (directed) is the "cost" of the solution -
     * the lower the better.
     * See: https://en.wikipedia.org/wiki/Travelling_salesman_problem
     *
     * @param cities
     */
    @Override
    public List<NodeData> tsp(List<NodeData> cities) {
        return null;
    }

    /**
     * Saves this weighted (directed) graph to the given
     * file name - in JSON format
     *
     * @param file - the file name (may include a relative path).
     * @return true - iff the file was successfully saved
     */
    @Override
    public boolean save(String file) {
        return false;
    }

    /**
     * This method loads a graph to this graph algorithm.
     * if the file was successfully loaded - the underlying graph
     * of this class will be changed (to the loaded one), in case the
     * graph was not loaded the original graph should remain "as is".
     *
     * @param file - file name of JSON file
     * @return true - iff the graph was successfully loaded.
     */
    @Override
    public boolean load(String file) {
        return false;
    }

    @Override
    public String toString() {
        return "myGraphAlgo{" +
                "\n my_Graph_Algo=" + my_Graph_Algo +
                "\n myMc=" + myMc +
                '}';
    }
}

/////////////////////////////////////////////////////////////////////////////
//@Override
//public double shortestPathDist(int src, int dest) {
//    if((!this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(src).isEmpty())&&(!this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest).isEmpty())){
//        ArrayList<Double> minWight = new ArrayList<>();
//        double tmp;
//        if(this.my_Graph_Algo.getEdge(src, dest) != null){
//            minWight.add(this.my_Graph_Algo.getEdge(src, dest).getWeight());
//        }
//        if(!((this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest).size()-1 == 0) || (this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest).contains(src)))){
//            for(int i : this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(dest)){
//                if(i != src){
//                    if(((this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).size()-1 != 0)||(this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i).contains(dest)))){
//                        ArrayList <Integer> visited = new ArrayList<>(this.my_Graph_Algo.nodeSize());
//                        visited.add(0,src);
//                        visited.add(1,dest);
//                        ArrayList<Integer> destTmpArray = this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i);
//                        visited.add(i);
//                        tmp = this.my_Graph_Algo.getEdge(i,dest).getWeight();
//                        tmp += inWight(visited, destTmpArray,i);
//                        if(!(tmp == this.my_Graph_Algo.getEdge(i,dest).getWeight())){
//                            minWight.add(tmp);
//                        }
//                    }
//                }
//            }
//            if(minWight.size()>0){
//                double min = Collections.min(minWight);
//                return min;
//            }
//            return -1;
//        }
//    }
//    return -1;
//}
//
//    private double inWight( ArrayList<Integer> visited, ArrayList<Integer> destArrray, int destTmp) {
//        double weight;
//        if(visited.size() <= this.my_Graph_Algo.nodeSize()){
//            for(int i : destArrray){
//                if(!visited.contains(i)){
//                    if(this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i).contains(visited.get(0))){
//                        weight =  this.my_Graph_Algo.getEdge(visited.get(0), i).getWeight() + this.my_Graph_Algo.getEdge(i,destTmp).getWeight();
//                        visited.add(i);
//                        return weight;
//                    }
//                    double tmp = this.my_Graph_Algo.getEdge(i, destTmp).getWeight();
//                    tmp +=  outWight(i, visited, this.my_Graph_Algo.getNeighbors_Of_Vertex_in().get(i));
//                    return tmp;
//                }
//                if((i == visited.get(0))){
//                    double w = this.my_Graph_Algo.getEdge(visited.get(0), destTmp).getWeight();
//                    return w;
//                }
//            }
//        }
//        return 0.0;
//    }
//
//    private double outWight(int destTmp, ArrayList<Integer> visited, ArrayList<Integer> destArrray) {
//        if (visited.size() <= this.my_Graph_Algo.nodeSize()) {
//            visited.add(destTmp);
//            for (int i : destArrray) {
//                if (!visited.contains(i)) {
//                    if (i == visited.get(0)) {
//                        visited.add(i);
//                        return this.my_Graph_Algo.getEdge(i, visited.get(0)).getWeight();
//                    }
//
//                }
//                visited.add(i);
//                double tmp = this.my_Graph_Algo.getEdge(destTmp, i).getWeight();
//                return tmp + inWight(visited, this.my_Graph_Algo.getNeighbors_Of_Vertex_out().get(i), i);
//            }
//            return 0.0;
//        }
//        return 0.0;
//    }