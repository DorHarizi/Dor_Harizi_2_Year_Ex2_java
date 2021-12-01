package Graph;

import api.GeoLocation;
import api.NodeData;
import java.util.ArrayList;
import java.util.Vector;
import api.EdgeData;



public class myNode  implements NodeData {
    private int key;
    private myPoint3D point;
    private double weight;
    private String info;
    private int tag;
    private Vector<Double> vector;
    private ArrayList <Vector> graph_side_in;
    private ArrayList <Vector> graph_side_out;
    private myEdgeData side;

    public myNode(int key, myPoint3D point, double weight, String info, int tag) {
        this.key = key;
        this.point = point;
        this.weight = weight;
        this.info = info;
        this.tag = tag;
        this.vector = new Vector<>();
        myPoint3D p = new myPoint3D(point.x(), point.y(), point.z());
        setVector(p);
    }

    public myNode() {
    }

    public void setVector(myPoint3D p) {
        double key = this.key;
        this.vector.add(key);
        this.vector.add(p.x());
        this.vector.add(p.y());
        this.vector.add(p.z());
    }

    @Override
    public String toString() {
        return "myNode{" +
                "key=" + key +
                ", point=" + point +
                ", weight=" + weight +
                ", info='" + info + '\'' +
                ", tag=" + tag +
                ", vector=" + vector +
                ", graph_side_in=" + graph_side_in +
                ", graph_side_out=" + graph_side_out +
                '}';
    }

    public Vector getVector() {
        return vector;
    }

    public ArrayList<Vector> getGraph_side_in() {
        return graph_side_in;
    }

    public ArrayList<Vector> getGraph_side_out() {
        return graph_side_out;
    }

    /**
     * Returns the key (id) associated with this node.
     *
     * @return
     */
    @Override
    public int getKey() {
        return this.key;
    }

    /**
     * Returns the location of this node, if none return null.
     *
     * @return
     */
    @Override
    public GeoLocation getLocation() {
        return this.point;
    }

    /**
     * Allows changing this node's location.
     *
     * @param p - new new location  (position) of this node.
     */
    @Override
    public void setLocation(GeoLocation p) {
        this.point = new myPoint3D(p.x(), p.y(), p.z());
    }

    /**
     * Returns the weight associated with this node.
     *
     * @return
     */
    @Override
    public double getWeight() {
        return this.weight;
    }

    /**
     * Allows changing this node's weight.
     *
     * @param w - the new weight
     */
    @Override
    public void setWeight(double w) {
        this.weight = w;
    }

    /**
     * Returns the remark (meta data) associated with this node.
     *
     * @return
     */
    @Override
    public String getInfo() {
        return this.info;
    }

    /**
     * Allows changing the remark (meta data) associated with this node.
     *
     * @param s
     */
    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    /**
     * Temporal data (aka color: e,g, white, gray, black)
     * which can be used be algorithms
     *
     * @return
     */
    @Override
    public int getTag() {
        return this.tag;
    }

    /**
     * Allows setting the "tag" value for temporal marking an node - common
     * practice for marking by algorithms.
     *
     * @param t - the new value of the tag
     */
    @Override
    public void setTag(int t) {
        this.tag = t;

    }
}
