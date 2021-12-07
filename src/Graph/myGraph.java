package Graph;

import api.DirectedWeightedGraph;
import api.EdgeData;
import api.NodeData;
import java.util.*;
import java.util.Vector;
import java.util.Iterator;

public class myGraph implements DirectedWeightedGraph {
    private ArrayList <Graph.myNode> vertex_Of_Graph;
    private HashMap<Vector<Integer>,myEdgeData> edge_Of_Graph;
    private ArrayList <NodeData> vertices;
    private ArrayList <EdgeData> edges;

    public myGraph(ArrayList<myNode> vertex_Of_Graph, HashMap<Vector<Integer>, myEdgeData> edge_Of_Graph,
                   ArrayList<NodeData> vertices, ArrayList<EdgeData> edges) {
        this.vertex_Of_Graph = vertex_Of_Graph;
        this.edge_Of_Graph = edge_Of_Graph;
        this.vertices = vertices;
        this.edges = edges;
    }

    public myGraph() {
    }

    public void addVector(myEdgeData edge){
        Vector<Integer> vector = new Vector <> (2);
        int src = edge.getSrc();
        int dest = edge.getDest();
        vector.add(src);
        vector.add(dest);
        edge_Of_Graph.put(vector,edge);
    }


    /**
     * returns the node_data by the node_id,
     *
     * @param key - the node_id
     * @return the node_data by the node_id, null if none.
     */
    @Override
    public NodeData getNode(int key) {
        return vertex_Of_Graph.get(key);
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
        if(edge_Of_Graph.containsKey(vector)){
            return edge_Of_Graph.get(vector);
        }
        return null ;
    }

    /**
     * adds a new node to the graph with the given node_data.
     * Note: this method should run in O(1) time.
     *
     * @param n
     */
    @Override
    public void addNode(NodeData n) {
        myNode node = new myNode();
        node.setLocation(n.getLocation());
        node.setKey(n.getKey());
        vertex_Of_Graph.add(node.getKey(),node);
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
        myEdgeData edge = new myEdgeData(src, dest, w);
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
        return vertices.iterator();
    }

    /**
     * This method returns an Iterator for all the edges in this graph.
     * Note: if any of the edges going out of this node were changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @return Iterator<EdgeData>
     */
    @Override
    public Iterator<EdgeData> edgeIter() {
        return edges.iterator();
    }

    /**
     * This method returns an Iterator for edges getting out of the given node (all the edges starting (source) at the given node).
     * Note: if the graph was changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @param node_id
     * @return Iterator<EdgeData>
     */
    @Override
    public Iterator<EdgeData> edgeIter(int node_id) {
        return edges.listIterator(node_id);
    }

    /**
     * Deletes the node (with the given ID) from the graph -
     * and removes all edges which starts or ends at this node.
     * This method should run in O(k), V.degree=k, as all the edges should be removed.
     *
     * @param key
     * @return the data of the removed node (null if none).
     */
    @Override
    public NodeData removeNode(int key) {
        if(vertices.get(key) != null){
            int count1 = 0;
            int count2 = edges.size();
            while(-1 < count2 && count1 < edges.size()) {
                Vector <Integer> v1 = new Vector <> (count2, key);
                Vector <Integer> v2 = new Vector <> (key, count1);
                if(edge_Of_Graph.containsKey(v1)){
                    edges.remove(edge_Of_Graph.get(v1));
                }
                if(edge_Of_Graph.containsKey(v2)){
                    edges.remove(edge_Of_Graph.get(v2));
                }
                count1++;
                count2--;
            }
            String info = vertices.get(key).getInfo();
            double x = vertices.get(key).getLocation().x();
            double y = vertices.get(key).getLocation().y();
            double z = vertices.get(key).getLocation().z();
            myPoint3D g = new myPoint3D(x,y,z);
            int tag = vertices.get(key).getTag();
            double w = vertices.get(key).getWeight();
            NodeData node = new myNode(key,g, w, info, tag);
            vertices.remove(key);
            return node;
        }
        return null;
    }

    /**
     * Deletes the edge from the graph,
     * Note: this method should run in O(1) time.
     *
     * @param src
     * @param dest
     * @return the data of the removed edge (null if none).
     */
    @Override
    public EdgeData removeEdge(int src, int dest) {
        Vector<Integer> vector = new Vector<>(2);
        vector.add(src);
        vector.add(dest);
        if(edge_Of_Graph.containsKey(vector)){
            String info = edge_Of_Graph.get(vector).getInfo();
            int tag = edge_Of_Graph.get(vector).getTag();
            double w = edge_Of_Graph.get(vector).getWeight();
            EdgeData e = new myEdgeData(src, dest, w, info, tag);
            edge_Of_Graph.remove(vector);
            return e;
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
        return vertices.size();
    }

    /**
     * Returns the number of edges (assume directional graph).
     * Note: this method should run in O(1) time.
     *
     * @return
     */
    @Override
    public int edgeSize() {
        return edges.size();
    }

    /**
     * Returns the Mode Count - for testing changes in the graph.
     *
     * @return
     */
    @Override
    public int getMC() {
        return 0;
    }
}
