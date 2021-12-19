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
    private int modeMc;

    public myGraph(myGraph g) {
        this.vertex_Of_Graph = g.vertex_Of_Graph;
        this.edge_Of_Graph = g.edge_Of_Graph;
        this.neighbors_Of_Vertex_out = g.neighbors_Of_Vertex_out;
        this.neighbors_Of_Vertex_in = g.neighbors_Of_Vertex_in;
        this.edge_Of_Graph_itr = g.edge_Of_Graph_itr;
    }


    public myGraph(){
        this.vertex_Of_Graph = new ArrayList<>();
        this.edge_Of_Graph = new HashMap<>();
        this.neighbors_Of_Vertex_in = new HashMap<>();
        this.neighbors_Of_Vertex_out = new HashMap<>();
        this.modeMc = 0;
    }

    public ArrayList<NodeData> getVertex_Of_Graph() {
        return vertex_Of_Graph;
    }


    public HashMap<Integer, ArrayList<Integer>> getNeighbors_Of_Vertex_out() {
        return neighbors_Of_Vertex_out;
    }

    public HashMap<Integer, ArrayList<Integer>> getNeighbors_Of_Vertex_in() {
        return neighbors_Of_Vertex_in;
    }

    /**
     * returns the node_data by the node_id,
     *
     * @param key - the node_id
     * @return the node_data by the node_id, null if none.
     */
    @Override
    public NodeData getNode(int key) {
        if(this.vertex_Of_Graph.get(key).getKey()== key){
            return this.vertex_Of_Graph.get(key);
        }
        return null;
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
        if(n != null){
            NodeData node = new myNode(n);
            this.vertex_Of_Graph.add(n.getKey(),node);
            this.modeMc++;
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
        Vector <Integer> vector = new Vector<> (2);
        vector.add(src);
        vector.add(dest);
        if(!this.edge_Of_Graph.containsKey(vector)){
            EdgeData edge = new myEdgeData(src, dest, w);
            this.edge_Of_Graph.put(vector, edge);
            this.vertex_Of_Graph.get(src).setInfo("("+src+","+dest+"),");
            this.vertex_Of_Graph.get(dest).setInfo("("+src+","+dest+"),");
            this.vertex_Of_Graph.get(src).setWeight(w);
            this.vertex_Of_Graph.get(dest).setWeight(w);
            this.neighbors_Of_Vertex_out.computeIfAbsent(src, k -> new ArrayList<>());
            this.neighbors_Of_Vertex_out.get(src).add(dest);
            this.neighbors_Of_Vertex_in.computeIfAbsent(dest, k -> new ArrayList<>());
            this.neighbors_Of_Vertex_in.get(dest).add(src);
            this.modeMc++;
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
        Iterator <NodeData> iterator_verties = new Iterator<>() {
            private final Iterator<NodeData> inter = vertex_Of_Graph.iterator();
            private  int Mc = modeMc;

            @Override
            public boolean hasNext() {
                if(this.Mc != modeMc){
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                return inter.hasNext();
            }

            @Override
            public NodeData next() {
                if(this.Mc != modeMc){
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                NodeData current = inter.next();
                return current;
            }
            public void remove(){
                if(this.Mc != modeMc){
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                inter.remove();
                Mc = 0;
            }
        };
        return iterator_verties;
    }

    /**
     * This method returns an Iterator for all the edges in this graph.
     * Note: if any of the edges going out of this node were changed since the iterator was constructed - a RuntimeException should be thrown.
     *
     * @return Iterator<EdgeData>
     */
    @Override
    public Iterator<EdgeData> edgeIter() {
        this.edge_Of_Graph_itr = new ArrayList<>(this.edge_Of_Graph.values());
        Iterator<EdgeData> iterator_edges = new Iterator<>() {
            private final Iterator<EdgeData> inter = edge_Of_Graph_itr.iterator();
            private int Mc = modeMc;

            @Override
            public boolean hasNext() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                return inter.hasNext();
            }

            @Override
            public EdgeData next() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                EdgeData current = inter.next();
                return current;
            }

            @Override
            public void remove() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                inter.remove();
                Mc = 0;
            }

        };
        return iterator_edges;
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
        ArrayList<EdgeData> edges = new ArrayList<>();
        if(this.neighbors_Of_Vertex_out.get(node_id) != null){
            for(int i=0; i<this.neighbors_Of_Vertex_out.get(node_id).size();i++){
                edges.add(this.getEdge(node_id, this.neighbors_Of_Vertex_out.get(node_id).get(i)));
            }
        }
        if(this.neighbors_Of_Vertex_in.get(node_id) != null){
            for(int j=0; j<this.neighbors_Of_Vertex_in.get(node_id).size();j++){
                edges.add(this.getEdge(this.neighbors_Of_Vertex_in.get(node_id).get(j), node_id));
            }
        }

        Iterator<EdgeData> iterator_edges_of_vertex = new Iterator<>() {
            private final Iterator<EdgeData> inter = edges.iterator();
            private int Mc = modeMc;

            @Override
            public boolean hasNext() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                return inter.hasNext();
            }

            @Override
            public EdgeData next() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                EdgeData current = inter.next();
                return current;
            }

            @Override
            public void remove() {
                if (this.Mc != modeMc) {
                    throw new RuntimeException("the graph was changed since the iterator was constructed");
                }
                inter.remove();
                Mc = 0;
            }

        };
        return iterator_edges_of_vertex;
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
       if (this.vertex_Of_Graph.get(key).getKey() == key) {
           NodeData tmp = new myNode(this.vertex_Of_Graph.get(key));
           this.vertex_Of_Graph.remove(key);
           while (!this.neighbors_Of_Vertex_out.get(key).isEmpty()) {
               int dest = this.neighbors_Of_Vertex_out.get(key).get(0);
               Vector<Integer> vectorIn = new Vector<>(2);
               vectorIn.add(key);
               vectorIn.add(dest);
               this.edge_Of_Graph.remove(vectorIn);
               this.neighbors_Of_Vertex_out.get(key).remove((Integer) dest);
           }
           while (!this.neighbors_Of_Vertex_in.get(key).isEmpty()) {
               int src = this.neighbors_Of_Vertex_in.get(key).get(0);
               Vector<Integer> vectorOut = new Vector<>(2);
               vectorOut.add(src);
               vectorOut.add(key);
               this.edge_Of_Graph.remove(vectorOut);
               this.neighbors_Of_Vertex_in.get(key).remove((Integer) src);
           }
           this.modeMc++;
           return tmp;
       }
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
        if(this.edge_Of_Graph.containsKey(vector)){
            double tmp1 = this.edge_Of_Graph.get(vector).getWeight();
            double w1 = this.vertex_Of_Graph.get(src).getWeight() - tmp1;
            double w2 = this.vertex_Of_Graph.get(dest).getWeight() - tmp1;
            this.vertex_Of_Graph.get(src).setWeight(w1);
            this.vertex_Of_Graph.get(dest).setWeight(w2);
            EdgeData tmp = new myEdgeData (src, dest, tmp1);
            this.edge_Of_Graph.remove(vector);
            this.neighbors_Of_Vertex_out.get(src).remove((Integer) dest);
            this.neighbors_Of_Vertex_in.get(dest).remove((Integer) src);
            this.vertex_Of_Graph.get(src).getInfo().replaceAll("("+src+","+dest+")","");
            this.vertex_Of_Graph.get(dest).getInfo().replaceAll("("+src+","+dest+")","");
            this.modeMc++;
            return tmp;
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
        return this.modeMc;
    }

    @Override
    public String toString() {
        String myGraph = "{"+'"'+"Edges"+'"'+":" + "[\n";        Iterator<EdgeData> edges = this.edgeIter();
        while (edges.hasNext()) {
            EdgeData edge = edges.next();
            myGraph = myGraph + "" + "{\n" + '"' + "src" + '"' + ": "+edge.getSrc()+",\n"+'"'+"w"+'"'+": "+edge.getWeight()+",\n"+'"'+"dest"+'"'+": "+edge.getDest()+"\n}"+",\n";
        }
        myGraph = myGraph.substring(0, myGraph.length() - 2) + "\n]";
        myGraph = myGraph + ","+'"'+ "Nodes" + '"' + ": [\n";

        Iterator<NodeData> nodes = this.nodeIter();
        while (nodes.hasNext()) {
            NodeData node = nodes.next();
            myGraph = myGraph +"" + "{\n" + '"' + "pos" + '"' + ": " + '"'+node.getLocation().x()+","+node.getLocation().y()+'"'+",\n"+'"'+"id"+'"'+": "+node.getKey()+"\n}"+",\n";
        }
        myGraph = myGraph.substring(0, myGraph.length() - 2) + "\n]}";
        return myGraph;

    }

}
