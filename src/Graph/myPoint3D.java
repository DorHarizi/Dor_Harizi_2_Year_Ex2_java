package Graph;

import api.GeoLocation;

public class myPoint3D implements GeoLocation {
    @Override
    public double x() {
        return 0;
    }

    @Override
    public double y() {
        return 0;
    }

    @Override
    public double z() {
        return 0;
    }

    @Override
    public double distance(GeoLocation g) {
        return 0;
    }
}

