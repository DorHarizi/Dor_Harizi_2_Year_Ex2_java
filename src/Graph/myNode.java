package Graph;

import api.GeoLocation;
import api.NodeData;

public class myNode  implements NodeData {
    private int key;
    private GeoLocation point;
    private double weight;
    private String info;
    private int tag;

    public myNode(int key, double x, double y, double z){
        GeoLocation point = new myPoint3D(x, y, z);
        this.key = key;
        this.point = point;
        this.weight = 0;
        this.info = "";
        this.tag = 0;
    }

    public myNode(int key, GeoLocation point) {
        this.key = key;
        this.point = point;
        this.weight = 0;
        this.info = "";
        this.tag = 0;
    }

    public myNode(int key, GeoLocation point, double weight, String info, int tag) {
        this.key = key;
        this.point = point;
        this.weight = weight;
        this.info = info;
        this.tag = tag;
    }

    public myNode() {
    }

    public myNode(NodeData node){
        this.key = node.getKey();
        this.point = new myPoint3D(node.getLocation());
        this.weight = node.getWeight();
        this.info = node.getInfo();
        this.tag = node.getTag();

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
        this.weight += w;
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
        this.info += s;
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
