package inheritance;

public class K5 extends Car {



    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    String getName() {
        return "K5";
    }
}
