package interfaceex;

public class K5 extends Car {

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLitter() {
        return 13;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
