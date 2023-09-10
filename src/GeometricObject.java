public abstract class GeometricObject implements Comparable<GeometricObject> {


    @Override
    public int compareTo(GeometricObject o) {
        // fartobebis shedareba
        double thisArea = this.getArea();
        double otherArea = o.getArea();
        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return obj1.compareTo(obj2) > 0 ? obj1 : obj2;
    }

    public abstract double getArea();
}


