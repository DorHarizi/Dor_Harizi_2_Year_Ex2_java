package Graph;

import api.GeoLocation;
import api.NodeData;

public class myNode  implements NodeData {
    @java.lang.Override
    public int getKey() {
        return 0;
    }

    @java.lang.Override
    public GeoLocation getLocation() {
        return null;
    }

    @java.lang.Override
    public void setLocation(GeoLocation p) {

    }

    @java.lang.Override
    public double getWeight() {
        return 0;
    }

    @java.lang.Override
    public void setWeight(double w) {

    }

    @java.lang.Override
    public String getInfo() {
        return null;
    }

    @java.lang.Override
    public void setInfo(String s) {

    }

    @java.lang.Override
    public int getTag() {
        return 0;
    }

    @java.lang.Override
    public void setTag(int t) {

    }
}
