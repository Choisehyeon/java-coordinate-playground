package interfaceex;

public class Sonata extends Car {

    public Sonata(int distance) {
        this.distance = distance;
    }


    @Override
    public double getDistancePerLitter() {
        return 10;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
