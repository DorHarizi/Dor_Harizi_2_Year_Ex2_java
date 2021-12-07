package Graph;

import api.GeoLocation;
import api.NodeData;
import java.util.*;
import java.util.Vector;

public class myNode  implements NodeData {
    private int key;
    private myPoint3D point;
    private double weight;
    private String info;
    private int tag;
    private ArrayList <myNode> vectors_side_in;
    private ArrayList <myNode> vectors_side_out;

    public myNode(int key, myPoint3D point) {
        this.key = key;
        this.point = point;
        this.weight = 0;
        this.info = "";
        this.tag = 0;
        this.vectors_side_in = null;
        this.vectors_side_out = null;
    }

    public myNode(int key, myPoint3D point, double weight, String info, int tag) {
        this.key = key;
        this.point = point;
        this.weight = weight;
        this.info = info;
        this.tag = tag;
    }

    //    public myNode(int key, GeoLocation g) {
//        this.key = key;
//        myPoint3D p = new myPoint3D(g.x(), g.y(), g.z());
//        this.point = p;
//        this.weight = 0;
//        this.info = "";
//        this.tag = 0;
//        this.vectors_side_in = null;
//        this.vectors_side_out = null;
//    }

    public myNode() {
    }

    @Override
    public String toString() {
        return "myNode{" +
                "key=" + key +
                ", point=" + point +
                ", weight=" + weight +
                ", info='" + info + '\'' +
                ", tag=" + tag +
                '}';
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

    public void setKey(int key) {
        this.key = key;
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
