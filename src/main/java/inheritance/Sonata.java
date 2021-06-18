package inheritance;

public class Sonata extends Car {

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
