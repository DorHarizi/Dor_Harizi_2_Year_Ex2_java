package Graph;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;
import java.util.*;
import java.util.Vector;
import java.util.Iterator;

public class myGraph implements DirectedWeightedGraph {
    private ArrayList <NodeData> vertex_Of_Graph;
    private HashMap<Vector<Integer>,EdgeData> edge_Of_Graph;
    private HashMap <Integer, ArrayList <Integer>> neighbors_Of_Vertex_out;
    private HashMap <Integer, ArrayList <Integer>> neighbors_Of_Vertex_in;
    private ArrayList<EdgeData> edge_Of_Graph_itr;
    private int mC;
    private int modeMc;

    public myGraph(Stack<NodeData> vertices, Stack <EdgeData> edges) {
        while(!vertices.isEmpty()){
            NodeData node = new myNode(vertices.pop());
            addNode(node);
        }
        while(!edges.empty()){
            EdgeData edge = edges.pop();
            if(edge.getSrc() != edge.getDest() && this.edge_Of_Graph.containsValue(edge)){
                connect(edge.getSrc(), edge.getDest(), edge.getWeight());
            }
        }
    }

    public myGraph(ArrayList<NodeData> vertex_of_graph, HashMap<Vector<Integer>, EdgeData> edge_of_graph, HashMap<Integer,
                    ArrayList<Integer>> neighbors_of_vertex_out, HashMap<Integer,
                    ArrayList<Integer>> neighbors_of_vertex_in) {
        this.vertex_Of_Graph = vertex_of_graph;
        this.edge_Of_Graph = edge_of_graph;
        this.neighbors_Of_Vertex_out = neighbors_of_vertex_out;
        this.neighbors_Of_Vertex_in = neighbors_of_vertex_in;
    }

    public myGraph() {
    }

    /**
     * returns the node_data by the node_id,
     *
     * @param key - the node_id
     * @return the node_data by the node_id, null if none.
     */
    @Override
    public NodeData getNode(int key) {
        return this.vertex_Of_Graph.get(key);
    }

    /**
     * returns the data of the edge (src,dest), null if none.
     * Note: this method should run in O(1) time.
     *
     * @param src
     * @param dest
     * @return
     */
    @Override
    public EdgeData getEdge(int src, int dest) {
        Vector<Integer> vector = new Vector<>(2);
        vector.add(src);
        vector.add(dest);
        if(this.edge_Of_Graph.containsKey(vector)){
            return this.edge_Of_Graph.get(vector);
        }
        return null;
    }

    /**
     * adds a new node to the graph with the given node_data.
     * Note: this method should run in O(1) time.
     *
     * @param n;
     */
    @Override
    public void addNode(NodeData n) {
        if(this.vertex_Of_Graph.get(n.getKey()) == null){
            this.vertex_Of_Graph.add(n);
            if(this.modeMc==this.mC){
                this.mC++; this.modeMc++;
                return;
            }
            this.mC++;
        }
    }

    /**
     * Connects an edge with weight w between node src to node dest.
     * * Note: this method should run in O(1) time.
     *
     * @param src  - the source of the edge.
     * @param dest - the destination of the edge.
     * @param w    - positive weight representing the cost (aka time, price, etc) between src-->dest.
     */
    @Override
    public void connect(int src, int dest, double w) {
        Vector <Integer> vector = new Vector<> (src , dest);
        if(!this.edge_Of_Graph.containsKey(vector)){
            EdgeData edge = new myEdgeData(src, dest, w);
            this.edge_Of_Graph.put(vector, edge);
            this.neighbors_Of_Vertex_out.get(src).add(dest);
            this.neighbors_Of_Vertex_in.get(dest).add(src);
            if(this.modeMc==this.mC){
                this.mC++; this.modeMc++;
                return;
            }
            this.mC++;
        }
    }

    /**
     * This method returns an Iterator for the
     * collection representing all the nodes in the graph.
     * Note: if the graph was changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @return Iterator<node_data>
     */
    @Override
    public Iterator<NodeData> nodeIter() {
        if(this.mC != this.modeMc){
            throw new RuntimeException("The graph was changed since the iterator was constructed");
        }
        this.modeMc = 0;
        return vertex_Of_Graph.iterator();
    }

    /**
     * This method returns an Iterator for all the edges in this graph.
     * Note: if any of the edges going out of this node were changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @return Iterator<EdgeData>
     */
    @Override
    public Iterator<EdgeData> edgeIter() {
        if (this.mC != this.modeMc){
            throw new RuntimeException("The graph was changed since the iterator was constructed");
        }
        this.edge_Of_Graph_itr = new ArrayList<>(this.edge_Of_Graph.values());
        this.modeMc = 0;
        return this.edge_Of_Graph_itr.iterator();

    }

    /**
     * This method returns an Iterator for edges getting out of the given node (all the edges starting (source) at the given node).
     * Note: if the graph was changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @param node_id;
     * @return Iterator<EdgeData>
     */
    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        if(this.modeMc != this.mC){
            throw new RuntimeException("The graph was changed since the iterator was constructed");
        }
        this.modeMc = 0;
        return this.edge_Of_Graph_itr.listIterator(node_id);
    }

    /**
     * Deletes the node (with the given ID) from the graph -
     * and removes all edges which starts or ends at this node.
     * This method should run in O(k), V.degree=k, as all the edges should be removed.
     *
     * @param key;
     * @return the data of the removed node (null if none).
     */
    @Override
    public NodeData removeNode(int key) {
        if (this.vertex_Of_Graph.get(key) != null) {
            NodeData tmp = new myNode(this.vertex_Of_Graph.get(key));
            this.vertex_Of_Graph.remove(key);
            int i = 0;
            int j = 0;
            while (!this.neighbors_Of_Vertex_out.get(key).isEmpty()) {
                int dest = this.neighbors_Of_Vertex_out.get(key).get(i);
                Vector<Integer> vectorIn = new Vector<>(2);
                vectorIn.add(key);
                vectorIn.add(dest);
                this.edge_Of_Graph.remove(vectorIn);
                this.neighbors_Of_Vertex_out.get(key).remove(i);
                i++;
            }
            while (!this.neighbors_Of_Vertex_in.get(key).isEmpty()) {
                int dest = this.neighbors_Of_Vertex_in.get(key).get(j);
                Vector<Integer> vectorOut = new Vector<>(2);
                vectorOut.add(dest);
                vectorOut.add(key);
                this.edge_Of_Graph.remove(vectorOut);
                this.neighbors_Of_Vertex_in.get(key).remove(j);
                j++;
            }
            if (this.modeMc == this.mC) {
                this.mC++;
                this.modeMc++;
                return tmp;
            }
        }
        this.mC++;
        return null;
    }

    /**
     * Deletes the edge from the graph,
     * Note: this method should run in O(1) time.
     *
     * @param src;
     * @param dest;
     * @return the data of the removed edge (null if none).
     */
    @Override
    public EdgeData removeEdge(int src, int dest) {
        Vector<Integer> vector = new Vector<>(2);
        vector.add(src);
        vector.add(dest);
        if(edge_Of_Graph.containsKey(vector)){
            EdgeData tmp = new myEdgeData (src, dest, this.edge_Of_Graph.get(vector).getWeight());
            edge_Of_Graph.remove(vector);
            neighbors_Of_Vertex_out.get(src).remove(dest);
            neighbors_Of_Vertex_in.get(dest).remove(src);
            if(this.modeMc==this.mC){
                this.mC++;
                this.modeMc++;
                return tmp;
            }else{
                this.mC++;
                return tmp;
            }
        }
        return null;
    }

    /**
     * Returns the number of vertices (nodes) in the graph.
     * Note: this method should run in O(1) time.
     *
     * @return
     */
    @Override
    public int nodeSize() {
        return this.vertex_Of_Graph.size();
    }

    /**
     * Returns the number of edges (assume directional graph).
     * Note: this method should run in O(1) time.
     *
     * @return
     */
    @Override
    public int edgeSize() {
        return this.edge_Of_Graph.size();
    }

    /**
     * Returns the Mode Count - for testing changes in the graph.
     *
     * @return
     */
    @Override
    public int getMC() {
        return this.mC;
    }
}
